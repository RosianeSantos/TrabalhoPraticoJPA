/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package DataAccess;

import DomainModel.Predio;
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
public class PredioDAO {
    private BancodeDados bd;

    public PredioDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Predio obj) {
        try{
            if (obj.getIdPredio() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into predios(nome, idfuncionario, idcampus) values(?,?,?)");
                comando.setString(1, obj.getNome());
                comando.setInt(2, obj.getCodfuncionario());
                comando.setInt(3, obj.getCodcampus());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update predios set nome = ?, idfuncionario=?, idcampus = ? where idpredio = ?");
                comando.setString(1, obj.getNome());
                comando.setInt(2, obj.getCodfuncionario());
                comando.setInt(3, obj.getCodcampus());
                comando.setInt(4, obj.getIdPredio());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PredioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Predio Abrir(int codigo) {
        try {
            Predio predio = new Predio (0, "");

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from predios where idpredio = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            predio.setIdPredio(resultado.getInt("idpredio"));
            predio.setNome(resultado.getString("nome"));
            predio.setCodfuncionario(resultado.getInt("idfuncionario"));
            predio.setCodcampus(resultado.getInt("idcampus"));
            
            return predio;
            
        } catch (SQLException ex) {
            Logger.getLogger(PredioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Predio obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from predios where idpredio = ?");
            comando.setInt(1, obj.getIdPredio());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PredioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Predio> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from predios");
            ResultSet resultado = comando.executeQuery();
            
            List<Predio> predio = new LinkedList<>();
            while (resultado.next()) {
                Predio tmp = new Predio(0,"");
                
                tmp.setIdPredio(resultado.getInt("idpredio"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setCodfuncionario(resultado.getInt("idfuncionario"));
                tmp.setCodcampus(resultado.getInt("idcampus"));
                
                predio.add(tmp);
            }
            return predio;
        } catch (SQLException ex) {
            Logger.getLogger(PredioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Predio> buscar(Predio filtro) {
        try {
            
            String sql = "select * from predios ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getIdPredio() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idpredio = " + filtro.getIdPredio();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Predio> predio = new LinkedList<>();
            while (resultado.next()) {
                
                Predio temp = new Predio(0,"");
                
                temp.setIdPredio(resultado.getInt("idpredio"));
                temp.setNome("nome");                
                temp.setCodfuncionario(resultado.getInt("idfuncionario"));
                temp.setCodcampus(resultado.getInt("idcampus"));
                
                predio.add(temp);
            }
            return predio;
        } catch (SQLException ex) {
            Logger.getLogger(PredioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
