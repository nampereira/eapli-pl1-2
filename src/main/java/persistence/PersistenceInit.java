/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
/**
 *
 * @author losa
 */

@PersistenceUnit

public class PersistenceInit {
    
   public static EntityManager getEntityManager()
    {
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("Automoveis");
      EntityManager manager = factory.createEntityManager();
      return manager;
    }
}
