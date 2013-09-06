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
public class Telefone {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idTelefone;
    @Column(nullable=false)
    private String ddd;
    @Column(nullable=false)
    private String numero;
    
    public Telefone(){
        this.ddd = "38";
        this.numero = "36213129";
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }
    
}
