/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Funcionario;
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
 * @author Rosy
 */
public class FuncionarioDAO {
    private BancodeDados bd;

    public FuncionarioDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Funcionario obj) {
        try{
            if (obj.getIdFuncionario() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into funcionarios(nome, cpf, telefone) values(?, ?, ?)");
                comando.setString(1, obj.getNome());
                comando.setString(2,obj.getCpf());
                comando.setString(3,obj.getTelefone());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update funcionarios set nome = ?, cpf = ?, telefone = ? where idfuncionario = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2,obj.getCpf());
                comando.setString(3,obj.getTelefone());
                comando.setInt(4, obj.getIdFuncionario());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Funcionario Abrir(int codigo) {
        try {
            Funcionario funcionario = new Funcionario (0, "", "", "");

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from funcionarios where idfuncionario = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            funcionario.setIdFuncionario(resultado.getInt("idfuncionario"));
            funcionario.setNome(resultado.getString("nome"));
            funcionario.setCpf(resultado.getString("cpf"));
            funcionario.setTelefone(resultado.getString("telefone"));
            
            return funcionario;
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Funcionario obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from funcionarios where idfuncionario = ?");
            comando.setInt(1, obj.getIdFuncionario());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Funcionario> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from funcionarios");
            ResultSet resultado = comando.executeQuery();
            
            List<Funcionario> funcionario = new LinkedList<>();
            while (resultado.next()) {
                Funcionario tmp = new Funcionario(0,"", "", "");
                
                tmp.setIdFuncionario(resultado.getInt("idfuncionario"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setCpf(resultado.getString("cpf"));
                tmp.setTelefone(resultado.getString("telefone"));
                
                funcionario.add(tmp);
            }
            return funcionario;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Funcionario> buscar(Funcionario filtro) {
        try {
            
            String sql = "select * from funcionarios ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getIdFuncionario() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idfuncionario = " + filtro.getIdFuncionario();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Funcionario> funcionario = new LinkedList<>();
            while (resultado.next()) {
                
                Funcionario temp = new Funcionario(0,"", "","");
                
                temp.setIdFuncionario(resultado.getInt("idfuncionario"));
                temp.setNome(resultado.getString("nome"));                
                temp.setCpf(resultado.getString("cpf"));
                temp.setTelefone(resultado.getString("telefone"));
                
                funcionario.add(temp);
            }
            return funcionario;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
