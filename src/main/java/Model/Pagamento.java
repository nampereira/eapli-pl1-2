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
@Table(name="PAGAMENTO")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class Pagamento {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="IDPAGAMENTO")  
 protected int idPagamento;
 
 protected double montante;
 
 public Pagamento() {}

 void setMontante(double montante) {
    this.montante=montante;
  }
}

