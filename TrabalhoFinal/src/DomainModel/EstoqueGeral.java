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
import javax.persistence.OneToMany;

/**
 *
 * @author Rosy
 */
@Entity
public class EstoqueGeral {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idEstoque;
    @Column(nullable=false)
    private int qtde;
    @ManyToOne
    private Material material;
    
    public EstoqueGeral(){
        idEstoque = 0;
        qtde = 0;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    
    
    
    
}
