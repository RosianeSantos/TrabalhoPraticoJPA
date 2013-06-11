/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author Iara
 */
public class Quarto {
    private int idQuarto;
    private int numero;
    private boolean banheiro;
    private int codpredio;
    
    public Quarto(int id, int num, boolean banheiro){
        this.idQuarto = id;
        this.numero = num;
        this.banheiro = banheiro;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public int getCodpredio() {
        return codpredio;
    }

    public void setCodpredio(int codpredio) {
        this.codpredio = codpredio;
    }
    
    
    
}
