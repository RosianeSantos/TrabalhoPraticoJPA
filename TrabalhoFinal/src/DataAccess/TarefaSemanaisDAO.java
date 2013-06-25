/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.TarefasSemanais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iara
 */
public class TarefaSemanaisDAO {
    private BancodeDados bd;

    public TarefaSemanaisDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(TarefasSemanais obj) {
        try{
            if (obj.getIdTarefas() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into tarefasemanais(descricao) values(?)");
                comando.setString(1, obj.getDescricao());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update tarefasemanais set descricao = ? where idtarefa = ?");
                comando.setString(1, obj.getDescricao());
                comando.setInt(2, obj.getIdTarefas());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TarefaSemanaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public TarefasSemanais Abrir(int codigo) {
        try {
            TarefasSemanais tarefas = new TarefasSemanais (0, "");

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from tarefasemanais where idtarefa = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            tarefas.setIdTarefas(resultado.getInt("idtarefa"));
            tarefas.setDescricao(resultado.getString("descricao"));

            return tarefas;

        } catch (SQLException ex) {
            Logger.getLogger(TarefaSemanaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(TarefasSemanais obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from tarefasemanais where idtarefa = ?");
            comando.setInt(1, obj.getIdTarefas());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TarefaSemanaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<TarefasSemanais> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from tarefasemanais ");
            ResultSet resultado = comando.executeQuery();
            
            List<TarefasSemanais> tarefa = new LinkedList<>();
            while (resultado.next()) {
                TarefasSemanais tmp = new TarefasSemanais(0,"");
                
                tmp.setIdTarefas(resultado.getInt("idtarefa"));
                tmp.setDescricao(resultado.getString("descricao"));
                
                tarefa.add(tmp);
            }
            return tarefa;
        } catch (SQLException ex) {
            Logger.getLogger(TarefaSemanaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<TarefasSemanais> buscar(TarefasSemanais filtro) {
        try {
            
            String sql = "select * from tarefasemanais ";
            String where = "";
            
            if(filtro.getDescricao().length() > 0){
                where = "descricao like '%"+filtro.getDescricao()+"%'";
            }
                       
            
            if (filtro.getIdTarefas() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idtarefa = " + filtro.getIdTarefas();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<TarefasSemanais> tarefa = new LinkedList<>();
            while (resultado.next()) {
                
                TarefasSemanais temp = new TarefasSemanais(0,"");
                
                temp.setIdTarefas(resultado.getInt("idtarefa"));
                temp.setDescricao(resultado.getString("descricao"));                
                
                tarefa.add(temp);
            }
            return tarefa;
        } catch (SQLException ex) {
            Logger.getLogger(TarefaSemanaisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
