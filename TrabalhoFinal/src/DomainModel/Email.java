/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Rosy
 */
@Entity
public class Email {
    @Column (name="Email")
    private String email;
    
    public Email(){
        this.email = "teste@ol.com.br";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
