/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author losa
 * **/
@Entity
@DiscriminatorValue("PAR")
public class ClienteParticular extends Cliente{
      
     private String NIF;
    public ClienteParticular()
    {}
    
    
    public ClienteParticular(String nome, String nif)
    {
    this.setNomeCliente(nome);
    this.NIF=nif;
    }
    public void  setNIF(String nif)
   {
       NIF=nif;
   }
    
    public String toString()
    {
        return NIF+ " " + nome;
    }
            
}
