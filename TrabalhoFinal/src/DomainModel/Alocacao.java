/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

/**
 *
 * @author Rosy
 */
@Entity
public class Alocacao {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idalocacao;
    private int idaluno;
    private int idquarto;
    @Temporal(TemporalType.DATE)
    @Column (name="Data Entrada")
    private Date dataEntrada;
    @Temporal(TemporalType.DATE)
    @Column(name="Data Saida")
    private Date dataSaida;
    @Column(nullable=false)
    private String semestreletivo;
    
    public Alocacao(){
        idalocacao = 0;
        idaluno = 0;
        idquarto = 0;
        semestreletivo = "";
        dataEntrada = new Date();
        dataSaida = new Date();
    }

    public int getIdalocacao() {
        return idalocacao;
    }

    public void setIdalocacao(int idalocacao) {
        this.idalocacao = idalocacao;
    }

    
    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public int getIdquarto() {
        return idquarto;
    }

    public void setIdquarto(int idquarto) {
        this.idquarto = idquarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getSemestreletivo() {
        return semestreletivo;
    }

    public void setSemestreletivo(String semestreletivo) {
        this.semestreletivo = semestreletivo;
    }
    
    
        
    

    
}
