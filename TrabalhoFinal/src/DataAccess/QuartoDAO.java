/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Quarto;
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
 * 
 * 
 */
public class QuartoDAO {
    private BancodeDados bd;

    public QuartoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Quarto obj) {
        try{
            if (obj.getIdQuarto() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into quartos(descricao) values(?)");
                comando.setInt(1, obj.getNumero());
                comando.setBoolean(2, obj.isBanheiro());
                comando.setInt(3, obj.getCodpredio());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update quartos set descricao = ? where idquarto = ?");
                comando.setInt(1, obj.getNumero());
                comando.setBoolean(2, obj.isBanheiro());
                comando.setInt(3, obj.getCodpredio());
                comando.setInt(4, obj.getIdQuarto());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Quarto Abrir(int codigo) {
        try {
            Quarto quarto = new Quarto (0, 0, true);

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from quartos where idquarto = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            quarto.setIdQuarto(resultado.getInt("idquarto"));
            quarto.setNumero(resultado.getInt("numero"));
            quarto.setBanheiro(resultado.getBoolean("banheiro"));
            quarto.setCodpredio(resultado.getInt("codpredio"));

            return quarto;

        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Quarto obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from quartos where idquarto = ?");
            comando.setInt(1, obj.getIdQuarto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Quarto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from metodopags ");
            ResultSet resultado = comando.executeQuery();
            
            List<Quarto> quarto = new LinkedList<>();
            while (resultado.next()) {
                Quarto tmp = new Quarto(0,0,false);
                
                tmp.setIdQuarto(resultado.getInt("idquarto"));
                tmp.setNumero(resultado.getInt("numero"));
                tmp.setBanheiro(resultado.getBoolean("banheiro"));
                tmp.setCodpredio(resultado.getInt("codpredio"));
                
                quarto.add(tmp);
            }
            return quarto;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Quarto> buscar(Quarto filtro) {
        try {
            
            String sql = "select * from quartos ";
            String where = "";
            
            if(filtro.getNumero()> 0){
                where = "numero ="+filtro.getNumero()+"%'";
            }
                       
            
            if (filtro.getIdQuarto() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idquarto = " + filtro.getIdQuarto();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Quarto> quarto = new LinkedList<>();
            while (resultado.next()) {
                
                Quarto temp = new Quarto(0,0, false);
                
                temp.setIdQuarto(resultado.getInt("idquarto"));
                temp.setNumero(resultado.getInt("numero"));
                temp.setBanheiro(resultado.getBoolean("banheiro"));
                temp.setCodpredio(resultado.getInt("codpredio"));
                
                
                quarto.add(temp);
            }
            return quarto;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
