/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
create table alunosportarefa(
idalunotarefa int not null auto_increment primary key,
idaluno int,
idtarefa int,
foreign key (idaluno) references alunos(idaluno),
foreign key (idtarefa) references tarefasemanais(idtarefa))


 */
package DataAccess;

/**
 *
 * @author Iara
 */
public class AlunoTarefaDAO {
    
}
