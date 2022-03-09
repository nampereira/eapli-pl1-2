/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author losa
 */

@Entity  
@Table(name="PAGAMENTOCHEQUE") 
public class PagamentoCheque extends Pagamento {
private String numeroCheque;
 
  public PagamentoCheque(  )
 {
     
 }
 public PagamentoCheque(String numeroCheque,double montante)
 {
     super.setMontante(montante);
     this.numeroCheque=numeroCheque;
 }
 
 public String toString(){
     return "Número do cheque " + numeroCheque  + " id="+idPagamento + "Montante" + montante;
 }
}
  
  
 