/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table alocacao(
idalocacao int not null auto_increment primary key,
idaluno int,
idquarto int,
semestreletivo varchar(20),
dataentrada date,
datasaida date,
foreign key (idaluno) references alunos(idaluno),
foreign key (idquarto) references quartos(idquarto))
 */
package DataAccess;

/**
 *
 * @author Iara
 */
public class AlocacaoDAO {
    
}
