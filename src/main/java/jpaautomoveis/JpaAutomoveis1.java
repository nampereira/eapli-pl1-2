/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaautomoveis;

import Model.GrupoAutomovel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import persistence.PersistenceInit;

/**
 *
 * @author losa
 */
public class JpaAutomoveis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // teste da persistência de dois objectos e listagem desses objectos
        EntityManager manager=PersistenceInit.getEntityManager();
        
        GrupoAutomovel grupoAutomovel= new GrupoAutomovel();
        GrupoAutomovel grupo1=new GrupoAutomovel("C",3,"utilitarios");
        GrupoAutomovel grupo2=new GrupoAutomovel("C",5,"topo de gama");
        
        manager.getTransaction().begin();
        manager.persist(grupo1);
        manager.persist(grupo2);
        manager.getTransaction().commit();
        
          Query query=manager.createQuery("select ga from GrupoAutomovel ga");
          List<GrupoAutomovel> results=query.getResultList();
          
          for (int i=0;i<results.size();i++)
              System.out.println(results.get(i));
              
          manager.close();
    }
}
