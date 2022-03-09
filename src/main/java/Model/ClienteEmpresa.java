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
@DiscriminatorValue("EMP")
public class ClienteEmpresa extends Cliente{
      
    private String CAE;
    public ClienteEmpresa()
    {}
    public ClienteEmpresa(String nome, String cae)
    {
    this.setNomeCliente(nome);
    this.CAE=cae;
    }
    
   public void  setCAE(String cae)
   {
       CAE=cae;
   }
   
   public String toString()
    {
        return CAE + " " + nome;
    }
}
