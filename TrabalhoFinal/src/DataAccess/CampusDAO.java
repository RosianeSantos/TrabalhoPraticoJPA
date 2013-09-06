/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Campus;
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
public class CampusDAO {
    private BancodeDados bd;

    public CampusDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Campus obj) {
        try{
            if (obj.getIdCampus() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into campus(nome, telefone, cidade, rua, numero) values(?,?,?,?,?)");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getTelefone());
                comando.setString(3, obj.getCidade());
                comando.setString(4, obj.getRua());
                comando.setInt(5, obj.getNumero());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update campus set nome = ?, telefone = ?, cidade = ?, rua = ?, numero = ? where idcampus = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getTelefone());
                comando.setString(3, obj.getCidade());
                comando.setString(4, obj.getRua());
                comando.setInt(5, obj.getNumero());
                comando.setInt(6, obj.getIdCampus());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CampusDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Campus Abrir(int codigo) {
        try {
            Campus campus = new Campus(0, "", "", "", "",0);

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from campus where idcampus = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            campus.setIdCampus(resultado.getInt("idcampus"));
            campus.setNome(resultado.getString("nome"));
            campus.setTelefone(resultado.getString("telefone"));
            campus.setCidade(resultado.getString("cidade"));
            campus.setRua(resultado.getString("rua"));
            campus.setNumero(resultado.getInt("numero"));
            
            return campus;
            
        } catch (SQLException ex) {
            Logger.getLogger(CampusDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Campus obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from campus where idcampus = ?");
            comando.setInt(1, obj.getIdCampus());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CampusDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Campus> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from campus");
            ResultSet resultado = comando.executeQuery();
            
            List<Campus> campus = new LinkedList<>();
            while (resultado.next()) {
                Campus tmp = new Campus(0,"","","","",0);
                
                tmp.setIdCampus(resultado.getInt("idcampus"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setTelefone(resultado.getString("telefone"));
                tmp.setCidade(resultado.getString("cidade"));
                tmp.setRua(resultado.getString("rua"));
                tmp.setNumero(resultado.getInt("numero"));
                                
                campus.add(tmp);
            }
            return campus;
        } catch (SQLException ex) {
            Logger.getLogger(CampusDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Campus> buscar(Campus filtro) {
        try {
            
            String sql = "select * from campus ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getIdCampus() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idcampus = " + filtro.getIdCampus();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Campus> campus = new LinkedList<>();
            while (resultado.next()) {
                
                Campus temp = new Campus(0,"", "", "", "",0);
                
                temp.setIdCampus(resultado.getInt("idcampus"));
                temp.setNome(resultado.getString("nome"));   
                temp.setTelefone(resultado.getString("telefone"));
                temp.setCidade(resultado.getString("cidade"));
                temp.setRua(resultado.getString("rua"));
                temp.setNumero(resultado.getInt("numero"));
                
                campus.add(temp);
            }
            return campus;
        } catch (SQLException ex) {
            Logger.getLogger(CampusDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
