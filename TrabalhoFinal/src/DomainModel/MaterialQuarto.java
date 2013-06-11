/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Objects;

/**
 *
 * @author Iara
 */
public class MaterialQuarto {
    int idMaterialQuarto;
    Material material;
    Quarto quarto;
    int qtde;

    public int getIdMaterialQuarto() {
        return idMaterialQuarto;
    }

    public void setIdMaterialQuarto(int idMaterialQuarto) {
        this.idMaterialQuarto = idMaterialQuarto;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
    
}
