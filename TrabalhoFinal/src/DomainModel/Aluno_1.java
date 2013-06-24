/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author Iara
 */
public class Aluno {
    private int idAluno;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private double media;
    private String nomeresp;
    private String telefoneresp;
    private int idcurso;
    
    public Aluno(){
        idAluno =0;
        nome = "";
        cpf = "";
        rg = "";
        telefone = "";
        email = "";
        media = 0;
        nomeresp = "";
        telefoneresp = "";
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNomeresp() {
        return nomeresp;
    }

    public void setNomeresp(String nomeresp) {
        this.nomeresp = nomeresp;
    }

    public String getTelefoneresp() {
        return telefoneresp;
    }

    public void setTelefoneresp(String telefoneresp) {
        this.telefoneresp = telefoneresp;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
