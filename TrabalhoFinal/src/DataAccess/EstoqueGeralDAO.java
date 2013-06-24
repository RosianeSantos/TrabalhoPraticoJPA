/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table estoquegeral(
idestoque int not null auto_increment primary key,
idmaterial int,
qtde int,
foreign key (idmaterial) references materiais(idmaterial))
 */
package DataAccess;

import DomainModel.EstoqueGeral;
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
public class EstoqueGeralDAO {
    private BancodeDados bd;

    public EstoqueGeralDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(EstoqueGeral obj) {
        try{
            if (obj.getIdEstoque() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into estoquegeral(idmaterial,qtde) values(?,?)");
                comando.setObject(1, obj.getMaterial());
                comando.setInt(2, obj.getQtde());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update estoquegeral set idmaterial = ?,qtde = ? where idestoque = ?");
                comando.setObject(1, obj.getMaterial());
                comando.setInt(2, obj.getQtde());
                comando.setInt(3, obj.getIdEstoque());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueGeralDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public EstoqueGeral Abrir(int codigo) {
        try {
            EstoqueGeral estoquegeral = new EstoqueGeral ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from estoquegeral where idestoque = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            estoquegeral.setIdEstoque(resultado.getInt("idestoque"));
            
            return estoquegeral;
            
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueGeralDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(EstoqueGeral obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from estoquegeral where idestoque = ?");
            comando.setInt(1, obj.getIdEstoque());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueGeralDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<EstoqueGeral> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from estoquegeral");
            ResultSet resultado = comando.executeQuery();
            
            List<EstoqueGeral> estoquegeral = new LinkedList<>();
            while (resultado.next()) {
                EstoqueGeral tmp = new EstoqueGeral();
                
                tmp.setIdEstoque(resultado.getInt("idestoque"));

                
                estoquegeral.add(tmp);
            }
            return estoquegeral;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueGeralDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<EstoqueGeral> buscar(EstoqueGeral filtro) {
        try {
            
            String sql = "select * from estoquegeral ";
            String where = "";
                                 
            
            if (filtro.getIdEstoque() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idestoque = " + filtro.getIdEstoque();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<EstoqueGeral> estoquegeral = new LinkedList<>();
            while (resultado.next()) {
                
                EstoqueGeral temp = new EstoqueGeral();
                
                temp.setIdEstoque(resultado.getInt("idestoque"));
                temp.setQtde(resultado.getInt("qtde"));
                //temp.setMaterial(resultado.getObject(""));
                
                estoquegeral.add(temp);
            }
            return estoquegeral;
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueGeralDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}


