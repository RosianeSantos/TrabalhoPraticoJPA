/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Rosy
 */
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idAluno;
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false)
    private String cpf;
    @Column(nullable=false)
    private String rg;
    @Column(nullable=false)
    private String telefone;
    @Column(nullable=false)
    private String email;
    @Column(nullable=false)
    private double media;
    @Column(nullable=false)
    private String nomeresp;
    @Column(nullable=false)
    private String telefoneresp;
    @ManyToOne
    private Curso curso;
    
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

    public Curso getcurso() {
        return curso;
    }

    public void setcurso(Curso idcurso) {
        this.curso = curso;
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
