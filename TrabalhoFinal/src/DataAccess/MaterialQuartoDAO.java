/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table materialporquarto(
idmaterialquarto int not null auto_increment primary key,
idmaterial int,
idquarto int,
qtde int,
foreign key (idmaterial) references materiais(idmaterial),
foreign key (idquarto) references quartos(idquarto))
 * 
 */
package DataAccess;

/**
 *
 * @author Iara
 */
public class MaterialQuartoDAO {
    
}
