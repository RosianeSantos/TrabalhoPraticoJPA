/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table alunosportarefa(
idalunotarefa int not null auto_increment primary key,
idaluno int,
idtarefa int,
foreign key (idaluno) references alunos(idaluno),
foreign key (idtarefa) references tarefasemanais(idtarefa))


 */
package DataAccess;

import DomainModel.AlunoTarefa;
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
public class AlunoTarefaDAO {
    private BancodeDados bd;

    public AlunoTarefaDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(AlunoTarefa obj) {
        try{
            if (obj.getIdalunotarefa() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into alunosportarefa() values()");
                comando.setObject(1, obj.getAluno());
                comando.setObject(2, obj.getTarefa());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update alunosportarefa set  where idalunotarefa = ?");
                comando.setObject(1, obj.getAluno());
                comando.setObject(2, obj.getTarefa());
                comando.setInt(3, obj.getIdalunotarefa());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoTarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public AlunoTarefa Abrir(int codigo) {
        try {
            AlunoTarefa alunotarefa = new AlunoTarefa ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from alunosportarefa where idalunotarefa = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            alunotarefa.setIdalunotarefa(resultado.getInt("idalunotarefa"));
            alunotarefa.setAluno(resultado.getObject(""));
            alunotarefa.setTarefa(resultado.getObject(""));

            return alunotarefa;

        } catch (SQLException ex) {
            Logger.getLogger(AlunoTarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(AlunoTarefa obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from alunosportarefa where idalunotarefa = ?");
            comando.setInt(1, obj.getIdalunotarefa());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoTarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<AlunoTarefa> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from alunosportarefa");
            ResultSet resultado = comando.executeQuery();
            
            List<AlunoTarefa> alunotarefa = new LinkedList<>();
            while (resultado.next()) {
                AlunoTarefa tmp = new AlunoTarefa();
                
                tmp.setIdalunotarefa(resultado.getInt("idalunotarefa"));
                tmp.getAluno(resultado.getObject(""));
                tmp.getTarefa(resultado.getObject(""));
              
                alunotarefa.add(tmp);
            }
            return alunotarefa;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoTarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<AlunoTarefa> buscar(AlunoTarefa filtro) {
        try {
            
            String sql = "select * from alunosportarefa ";
            String where = "";
            
            if(filtro.getTarefa()> 0){
                where = "idtarefa ="+filtro.getTarefa()+"%'";
            }
            
            if(filtro.getAluno()> 0){
                where = "idaluno ="+filtro.getAluno()+"%'";
            }
            
            if (filtro.getIdalunotarefa() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idalunotarefa = " + filtro.getIdalunotarefa();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<AlunoTarefa> alunotarefa = new LinkedList<>();
            while (resultado.next()) {
                
                AlunoTarefa temp = new AlunoTarefa();
                
                temp.setIdalunotarefa(resultado.getInt("idalunotarefa"));
                temp.getAluno(resultado.getObject(""));
                temp.getTarefa(resultado.getObject(""));
                
                alunotarefa.add(temp);
            }
            return alunotarefa;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoTarefaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
