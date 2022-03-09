/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import Model.CondutorAutorizado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
/**
 *
 * @author losa
 */
@Entity
public class ContratoAluguer {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int idcontrato;
 
 @ManyToOne (cascade = CascadeType.ALL)
 private Cliente cliente;
 
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date datacontrato;
  
  @OneToMany(mappedBy = "contrato", cascade = CascadeType.PERSIST)
  private List<CondutorAutorizado> listCondutorAutorizado=new ArrayList<CondutorAutorizado>();

    public Date getDatacontrato() {
        return datacontrato;
    }
  
  public ContratoAluguer() {}
  
   
  
   public void addCondutorAutorizado(CondutorAutorizado condutor)
   {
       listCondutorAutorizado.add(condutor);
   }
   
   public CondutorAutorizado getCondutorAutorizado( int index)
   {
     return listCondutorAutorizado.get(index);
   }  
   
   public List<CondutorAutorizado> getCondutores( )
   {
     return listCondutorAutorizado;
   }  

    

     
}

