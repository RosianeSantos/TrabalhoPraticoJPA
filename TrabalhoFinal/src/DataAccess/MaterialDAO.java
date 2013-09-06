package DataAccess;

import DomainModel.Material;
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
public class MaterialDAO {
    private BancodeDados bd;

    public MaterialDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Material obj) {
        try{
            if (obj.getIdMaterial() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into materiais(descricao) values(?)");
                comando.setString(1, obj.getDescricao());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update materiais set descricao = ? where idmaterial = ?");
                comando.setString(1, obj.getDescricao());
                comando.setInt(2, obj.getIdMaterial());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Material Abrir(int codigo) {
        try {
            Material material = new Material (0, "");

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from materiais where idmaterial = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            material.setIdMaterial(resultado.getInt("idmaterial"));
            material.setDescricao(resultado.getString("descricao"));

            return material;

        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Material obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from materiais where idmaterial = ?");
            comando.setInt(1, obj.getIdMaterial());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Material> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from materiais ");
            ResultSet resultado = comando.executeQuery();
            
            List<Material> material = new LinkedList<>();
            while (resultado.next()) {
                Material tmp = new Material(0,"");
                
                tmp.setIdMaterial(resultado.getInt("idmaterial"));
                tmp.setDescricao(resultado.getString("descricao"));
                
                material.add(tmp);
            }
            return material;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Material> buscar(Material filtro) {
        try {
            
            String sql = "select * from materiais ";
            String where = "";
            
            if(filtro.getDescricao().length() > 0){
                where = "descricao like '%"+filtro.getDescricao()+"%'";
            }
                       
            
            if (filtro.getIdMaterial() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idmaterial = " + filtro.getIdMaterial();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Material> material = new LinkedList<>();
            while (resultado.next()) {
                
                Material temp = new Material(0,"");
                
                temp.setIdMaterial(resultado.getInt("idmaterial"));
                temp.setDescricao(resultado.getString("descricao"));                
                
                material.add(temp);
            }
            return material;
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
