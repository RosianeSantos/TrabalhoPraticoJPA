/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package DataAccess;


import DomainModel.Aluno;
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
public class AlunoDAO {
    private BancodeDados bd;

    public AlunoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Aluno obj) {
        try{
            if (obj.getIdAluno() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into alunos(nome,cpf,rg, telefone, email, media, nomeresp, telefoneresp, idcurso) values(?,?,?,?,?,?,?,?,?)");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCpf());
                comando.setString(3, obj.getRg());
                comando.setString(4, obj.getTelefone());
                comando.setString(5, obj.getEmail());
                comando.setDouble(6, obj.getMedia());
                comando.setString(7, obj.getNomeresp());
                comando.setString(8, obj.getTelefoneresp());
                comando.setInt(9, obj.getIdcurso());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update alunos set nome=?,cpf=?,rg=?, telefone=?, email=?, media=?, nomeresp=?, telefoneresp=?, idcurso=? where idaluno = ?");
                comando.setString(1, obj.getNome());
                comando.setString(2, obj.getCpf());
                comando.setString(3, obj.getRg());
                comando.setString(4, obj.getTelefone());
                comando.setString(5, obj.getEmail());
                comando.setDouble(6, obj.getMedia());
                comando.setString(7, obj.getNomeresp());
                comando.setString(8, obj.getTelefoneresp());
                comando.setInt(9, obj.getIdcurso());
                comando.setInt(10, obj.getIdAluno());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Aluno Abrir(int codigo) {
        try {
            Aluno aluno = new Aluno ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from alunos where idaluno = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            aluno.setIdAluno(resultado.getInt("idaluno"));
            aluno.setNome(resultado.getString("nome"));
            aluno.setRg(resultado.getString("rg"));
            aluno.setCpf(resultado.getString("cpf"));
            aluno.setTelefone(resultado.getString("telefone"));
            aluno.setEmail(resultado.getString("email"));
            aluno.setMedia(resultado.getDouble("media"));
            aluno.setNomeresp(resultado.getString("nomeresp"));
            aluno.setTelefoneresp(resultado.getString("telefoneresp"));
            aluno.setIdcurso(resultado.getInt("idcurso"));
            
            

            return aluno;

        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Aluno obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from alunos where idaluno = ?");
            comando.setInt(1, obj.getIdAluno());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Aluno> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from metodopags ");
            ResultSet resultado = comando.executeQuery();
            
            List<Aluno> aluno = new LinkedList<>();
            while (resultado.next()) {
                Aluno tmp = new Aluno();
                
                tmp.setIdAluno(resultado.getInt("idaluno"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setRg(resultado.getString("rg"));
                tmp.setCpf(resultado.getString("cpf"));
                tmp.setTelefone(resultado.getString("telefone"));
                tmp.setEmail(resultado.getString("email"));
                tmp.setMedia(resultado.getDouble("media"));
                tmp.setNomeresp(resultado.getString("nomeresp"));
                tmp.setTelefoneresp(resultado.getString("telefoneresp"));
                tmp.setIdcurso(resultado.getInt("idcurso"));
                
                aluno.add(tmp);
            }
            return aluno;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Aluno> buscar(Aluno filtro) {
        try {
            
            String sql = "select * from alunos ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getIdAluno() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idaluno = " + filtro.getIdAluno();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Aluno> aluno = new LinkedList<>();
            while (resultado.next()) {
                
                Aluno temp = new Aluno();
                
                temp.setIdAluno(resultado.getInt("idaluno"));
                temp.setNome(resultado.getString("nome"));
                temp.setRg(resultado.getString("rg"));
                temp.setCpf(resultado.getString("cpf"));
                temp.setTelefone(resultado.getString("telefone"));
                temp.setEmail(resultado.getString("email"));
                temp.setMedia(resultado.getDouble("media"));
                temp.setNomeresp(resultado.getString("nomeresp"));
                temp.setTelefoneresp(resultado.getString("telefoneresp"));
                temp.setIdcurso(resultado.getInt("idcurso"));                
                
                aluno.add(temp);
            }
            return aluno;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
