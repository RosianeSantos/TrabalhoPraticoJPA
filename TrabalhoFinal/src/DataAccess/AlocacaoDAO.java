/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 */
package DataAccess;

import DomainModel.Alocacao;
import java.sql.Date;
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
public class AlocacaoDAO {
    private BancodeDados bd;

    public AlocacaoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Alocacao obj) {
        try{
            if (obj.getIdalocacao() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into alocacao(idaluno,idquarto,semestreletivo,dataentrada,datasaida) values(?,?,?,?,?)");
                comando.setInt(1, obj.getIdaluno());
                comando.setInt(2, obj.getIdquarto());
                comando.setString(3, obj.getSemestreletivo());
                comando.setDate(4,(Date) obj.getDataEntrada());
                comando.setDate(5,(Date) obj.getDataSaida());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update alocacao set idaluno=?,idquarto=?,semestreletivo=?,dataentrada=?,datasaida=? where idalocacao = ?");
                comando.setInt(1, obj.getIdaluno());
                comando.setInt(2, obj.getIdquarto());
                comando.setString(3, obj.getSemestreletivo());
                comando.setDate(4,(Date) obj.getDataEntrada());
                comando.setDate(5,(Date) obj.getDataSaida());
                comando.setInt(6, obj.getIdalocacao());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Alocacao Abrir(int codigo) {
        try {
            Alocacao alocacao = new Alocacao ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from alocacao where idalocacao = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            alocacao.setIdalocacao(resultado.getInt("idalocacao"));
            alocacao.setIdaluno(resultado.getInt("idaluno"));
            alocacao.setIdquarto(resultado.getInt("idquarto"));
            alocacao.setSemestreletivo(resultado.getString("semestreletivo"));
            alocacao.setDataEntrada(resultado.getDate("dataentrada"));
            alocacao.setDataSaida(resultado.getDate("datasaida"));

            return alocacao;

        } catch (SQLException ex) {
            Logger.getLogger(AlocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Alocacao obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from alocacao where idalocacao = ?");
            comando.setInt(1, obj.getIdalocacao());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Alocacao> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from alocacao");
            ResultSet resultado = comando.executeQuery();
            
            List<Alocacao> alocacao = new LinkedList<>();
            while (resultado.next()) {
                Alocacao tmp = new Alocacao();
                
                tmp.setIdalocacao(resultado.getInt("idalocacao"));
                tmp.setIdaluno(resultado.getInt("idaluno"));
                tmp.setIdquarto(resultado.getInt("idquarto"));
                tmp.setSemestreletivo(resultado.getString("semestreletivo"));
                tmp.setDataEntrada(resultado.getDate("dataentrada"));
                tmp.setDataSaida(resultado.getDate("datasaida"));
              
                alocacao.add(tmp);
            }
            return alocacao;
        } catch (SQLException ex) {
            Logger.getLogger(AlocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Alocacao> buscar(Alocacao filtro) {
        try {
            
            String sql = "select * from alocacao ";
            String where = "";
            
            if(filtro.getIdquarto()> 0){
                where = "idquarto ="+filtro.getIdquarto()+"%'";
            }
            
            if(filtro.getIdaluno()> 0){
                where = "idaluno ="+filtro.getIdaluno()+"%'";
            }
            
            if (filtro.getIdalocacao() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idalocacao = " + filtro.getIdalocacao();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Alocacao> alocacao = new LinkedList<>();
            while (resultado.next()) {
                
                Alocacao temp = new Alocacao();
                
                temp.setIdalocacao(resultado.getInt("idalocacao"));
                temp.setIdaluno(resultado.getInt("idaluno"));
                temp.setIdquarto(resultado.getInt("idquarto"));
                temp.setSemestreletivo(resultado.getString("semestreletivo"));
                temp.setDataEntrada(resultado.getDate("dataentrada"));
                temp.setDataSaida(resultado.getDate("datasaida"));
                
                
                alocacao.add(temp);
            }
            return alocacao;
        } catch (SQLException ex) {
            Logger.getLogger(AlocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
