/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 */
package DataAccess;

import DomainModel.Administrador;
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
public class AdministradorDAO {
    private BancodeDados bd;

    public AdministradorDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Administrador obj) {
        try{
            if (obj.getIdAdministrador() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into administrador(nome) values(?)");
                comando.setString(1, obj.getUsuario());
                comando.setString(2, obj.getSenha());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update administrador set nome = ? where idadministrador = ?");
                comando.setString(1, obj.getUsuario());
                comando.setString(2, obj.getSenha());
                comando.setInt(3, obj.getIdAdministrador());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Administrador Abrir(int codigo) {
        try {
            Administrador administrador = new Administrador ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from administrador where idadministrador = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            administrador.setIdAdministrador(resultado.getInt("idadministrador"));
            administrador.setUsuario(resultado.getString("usuario"));
            administrador.setSenha(resultado.getString("senha"));
            
            return administrador;
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Administrador obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from administrador where idadministrador = ?");
            comando.setInt(1, obj.getIdAdministrador());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Administrador> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from administrador");
            ResultSet resultado = comando.executeQuery();
            
            List<Administrador> administrador = new LinkedList<>();
            while (resultado.next()) {
                Administrador tmp = new Administrador();
                
                tmp.setIdAdministrador(resultado.getInt("idadministrador"));
                tmp.setUsuario(resultado.getString("usuario"));
                tmp.setSenha(resultado.getString("senha"));
                
                administrador.add(tmp);
            }
            return administrador;
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Administrador> buscar(Administrador filtro) {
        try {
            
            String sql = "select * from administrador ";
            String where = "";
            
            if(filtro.getUsuario().length() > 0){
                where = "nome like '%"+filtro.getUsuario()+"%'";
            }
                       
            
            if (filtro.getIdAdministrador() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idadministrador = " + filtro.getIdAdministrador();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Administrador> administrador = new LinkedList<>();
            while (resultado.next()) {
                
                Administrador temp = new Administrador();
                
                temp.setIdAdministrador(resultado.getInt("idadministrador"));
                temp.setUsuario(resultado.getString("usuario"));
                temp.setSenha(resultado.getString("senha"));              
                
                administrador.add(temp);
            }
            return administrador;
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
