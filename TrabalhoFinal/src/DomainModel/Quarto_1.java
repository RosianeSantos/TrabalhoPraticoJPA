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
public class Quarto {
    private int idQuarto;
    private int numero;
    private boolean banheiro;
    private int codpredio;
    
    private List<MaterialQuarto> mats;
    
    public Quarto(int id, int num, boolean banheiro){
        this.idQuarto = id;
        this.numero = num;
        this.banheiro = banheiro;
        mats = new LinkedList<MaterialQuarto>();
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

    public List<MaterialQuarto> getMats() {
        return mats;
    }

    public void setMats(List<MaterialQuarto> mats) {
        this.mats = mats;
    }
       
    public void add(MaterialQuarto mq){
        if(!mats.contains(mq)){
            mats.add(mq);
            
            // Tirar de estoque geral
            //valorTotal += i.getProduto().getValor() * i.getQuantidade();
        }
    }
    
    public void remove(MaterialQuarto mq){
        if(mats.contains(mq)){
            mats.remove(mq);
            
            //Tirar de estoque geral
            //valorTotal -= i.getProduto().getValor() * i.getQuantidade();
        }
    }
    
    
}
