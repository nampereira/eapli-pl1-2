/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author losa
 */
@Entity
public class GrupoAutomovel implements java.io.Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     @Column(name="IDGRUPOAUTOMOVEL")
     private int idgrupoautomovel;
     
     private String nome;
     private Integer portas;
     private String classe;
     
    public GrupoAutomovel() {
    }
    
    public GrupoAutomovel(String Nome,Integer portas,String classe) 
    {
    this.nome=Nome;this.portas=portas; this.classe=classe; 
    }
    
    public String toString()
     {
      return nome+"-" + portas + "-" + classe;
     }
}
