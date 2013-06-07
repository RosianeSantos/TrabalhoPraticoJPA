/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Iara
 */
public class Aluno {
    int idAluno;
    String nome;
    String cpf;
    String rg;
    List<Telefone> telefone;
    List<Email> email;
    double media;
    String nomeresp;
    String telefoneresp;
    int idcurso;
    
    public Aluno(){
        idAluno =0;
        nome = "";
        cpf = "";
        rg = "";
        telefone = new LinkedList <>();
        email = new LinkedList <>();
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

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
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
    
    
}
