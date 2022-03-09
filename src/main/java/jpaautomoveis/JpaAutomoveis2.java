/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaautomoveis;

import Model.Automovel;
import Model.GrupoAutomovel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import persistence.PersistenceInit;

/**
 *
 * @author losa
 */
public class JpaAutomoveis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        EntityManager manager=PersistenceInit.getEntityManager();
        
         
     //   ***** teste de many-to-one : automovel ->grupo automovel
        
        GrupoAutomovel grupo=new GrupoAutomovel("C",5,"utilitario");
        Automovel auto=new Automovel("15-BM-17",grupo);
              
        manager.getTransaction().begin();    
        manager.persist(auto);
               
        manager.getTransaction().commit(); 
        
        
        Query query=manager.createQuery("select a from Automovel a");
          List<GrupoAutomovel> results=query.getResultList();
          
          for (int i=0;i<results.size();i++)
              System.out.println(results.get(i));
              
          manager.close();
    }
}
