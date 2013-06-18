/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table estoquegeral(
idestoque int not null auto_increment primary key,
idmaterial int,
qtde int,
foreign key (idmaterial) references materiais(idmaterial))
 */
package DataAccess;

/**
 *
 * @author Iara
 */
public class EstoqueGeralDAO {
    
}
