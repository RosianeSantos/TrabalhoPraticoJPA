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

/**
 *
 * @author Rosy
 */
@Entity
public class Campus {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idCampus;
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false)
    private String telefone;
    @Column(nullable=false)
    private String cidade;
    @Column(nullable=false)
    private String rua;
    @Column(nullable=false)
    private int numero; 
    
    public Campus(int id, String nome, String tel, String cidade, String rua, int num){
        this.idCampus = id;
        this.nome = nome;
        this.telefone = tel;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = num;
    }

    public int getIdCampus() {
        return idCampus;
    }

    public void setIdCampus(int idCampus) {
        this.idCampus = idCampus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
