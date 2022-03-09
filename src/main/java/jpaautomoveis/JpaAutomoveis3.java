/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaautomoveis;

import Model.Automovel;
import Model.Cliente;
import Model.CondutorAutorizado;
import Model.ContratoAluguer;
import Model.GrupoAutomovel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import persistence.PersistenceInit;

/**
 *
 * @author losa
 */
public class JpaAutomoveis3 {
    
    public static void main(String[] args) {
       
        
        EntityManager manager=PersistenceInit.getEntityManager();
                 
     //   ***** teste de one-to-many bidirecional : Contrato -> Condutores autorizados
        
        ContratoAluguer contrato=new ContratoAluguer( );
        CondutorAutorizado condutor1= new CondutorAutorizado("Manuel Antonio"); 
        CondutorAutorizado condutor2= new CondutorAutorizado("Carlos Manuel"); 
        contrato.addCondutorAutorizado(condutor1);
        contrato.addCondutorAutorizado(condutor2);
     //   Cliente cli=new Cliente(); 
        
        manager.getTransaction().begin();    
        manager.persist(contrato);
               
        manager.getTransaction().commit(); 
        
      //  Query query = manager.createQuery("from Model.ContratoAluguer where idcontrato= :id");
       // define valor do parâmetro
      //  query.setParameter("id", 1);  
        
              
        contrato=manager.find(ContratoAluguer.class, 1);
  
        List<CondutorAutorizado> condutores= contrato.getCondutores();
        for (int i=0;i<condutores.size();i++){
            System.out.println(condutores.get(i).getNome());
            
        }  
        manager.close();
    }
}
