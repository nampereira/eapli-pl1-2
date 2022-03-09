/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaautomoveis;
import Model.ClienteEmpresa;
import Model.ClienteParticular;
import Model.*;
import javax.persistence.EntityManager;
import persistence.PersistenceInit;
/**
 *
 * @author losa
 */
public class JpaAutomoveis5 {
    
    // excemplo de teste de herança com uma tabela por classe
     public static void main(String[] args) {
     EntityManager manager=PersistenceInit.getEntityManager();
     
     PagamentoCheque pagCheque = new PagamentoCheque("12345678",200);
    
     PagamentoCredito pagCredito = new PagamentoCredito("xpto12345",300);
    
     
     manager.getTransaction().begin();
     manager.persist(pagCheque);
     manager.persist(pagCredito);
     manager.getTransaction().commit();
     
     Pagamento pag1=manager.find(Pagamento.class, 1);
     Pagamento pag2=manager.find(Pagamento.class, 2);
     System.out.println(pag1);
     System.out.println(pag2);
     manager.close();
     }
}
