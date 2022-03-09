/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaautomoveis;
import Model.ClienteEmpresa;
import Model.ClienteParticular;
import Model.Cliente;
import javax.persistence.EntityManager;
import persistence.PersistenceInit;
/**
 *
 * @author losa
 */
public class JpaAutomoveis4 {
    // exemplo de teste de herança com uma única classe
     public static void main(String[] args) {
     EntityManager manager=PersistenceInit.getEntityManager();
     
     ClienteEmpresa cliEmpresa = new ClienteEmpresa("carlos","1234");
    
     ClienteParticular cliParticular = new ClienteParticular("antónio", "12345678");
    
     
     manager.getTransaction().begin();
     manager.persist(cliEmpresa);
     manager.persist(cliParticular);
     manager.getTransaction().commit();
     
     Cliente cli1=manager.find(Cliente.class, 1);
     Cliente cli2=manager.find(Cliente.class, 2);
     System.out.println(cli1);
     System.out.println(cli2);
     manager.close();
     }
}
