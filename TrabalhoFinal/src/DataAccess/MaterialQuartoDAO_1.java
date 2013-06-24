/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table materialporquarto(
idmaterialquarto int not null auto_increment primary key,
idmaterial int,
idquarto int,
qtde int,
foreign key (idmaterial) references materiais(idmaterial),
foreign key (idquarto) references quartos(idquarto))
 * 
 */
package DataAccess;

import DomainModel.MaterialQuarto;
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
public class MaterialQuartoDAO {
    private BancodeDados bd;

    public MaterialQuartoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(MaterialQuarto obj) {
        try{
            if (obj.getIdMaterialQuarto() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into materialporquarto() values()");
                comando.setObject(1, obj.getMaterial());
                comando.setInt(2, obj.getQtde());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update materialporquarto set  where idmaterialquarto = ?");
                comando.setObject(1, obj.getMaterial());
                comando.setInt(2, obj.getQtde());
                comando.setInt(3, obj.getIdMaterialQuarto());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public MaterialQuarto Abrir(int codigo) {
        try {
            MaterialQuarto materialquarto = new MaterialQuarto ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from materialporquarto where idmaterialquarto = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            materialquarto.setIdMaterialQuarto(resultado.getInt("idmaterialquarto"));
            materialquarto.setMaterial(resultado.getObject(""));
            materialquarto.setQtde(resultado.getInt("qtde"));

            return materialquarto;

        } catch (SQLException ex) {
            Logger.getLogger(MaterialQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(MaterialQuarto obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from materialporquarto where idmaterialquarto = ?");
            comando.setInt(1, obj.getIdMaterialQuarto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<MaterialQuarto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from materialporquarto");
            ResultSet resultado = comando.executeQuery();
            
            List<MaterialQuarto> materialquarto = new LinkedList<>();
            while (resultado.next()) {
                MaterialQuarto tmp = new MaterialQuarto();
                
                tmp.setIdMaterialQuarto(resultado.getInt("idmaterialquarto"));
                tmp.setMaterial(resultado.get);
                tmp.setQtde(resultado.getInt("qtde"));
              
                materialquarto.add(tmp);
            }
            return materialquarto;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<MaterialQuarto> buscar(MaterialQuarto filtro) {
        try {
            
            String sql = "select * from materialporquarto ";
            String where = "";
            
            if(filtro.getMaterial()> 0){
                where = "idmaterial ="+filtro.getMaterial()+"%'";
            }
        
            
            if (filtro.getIdMaterialQuarto() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idmaterialquarto = " + filtro.getIdMaterialQuarto();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<MaterialQuarto> materialquarto = new LinkedList<>();
            while (resultado.next()) {
                

                MaterialQuarto temp = new MaterialQuarto();
                
                temp.setIdMaterialQuarto(resultado.getInt("idmaterialquarto"));
                temp.setMaterial(resultado.getObject(""));
                temp.setQtde(resultado.getInt("qtde"));
                
                materialquarto.add(temp);
            }
            return materialquarto;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
