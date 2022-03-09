/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author losa
 */

@Entity  
@Table(name="PAGAMENTOCREDITO") 
public class PagamentoCredito extends Pagamento {
 private String idCartao;
 
  public PagamentoCredito(  )
 {
     
 }
 public PagamentoCredito(String idcartao, double montante)
 {
      super.setMontante(montante);
     this.idCartao=idcartao;
 }
 
  public String toString(){
     return "Numero do Cartão " + idCartao + " id="+idPagamento + "Montante" + montante;
 }
}
