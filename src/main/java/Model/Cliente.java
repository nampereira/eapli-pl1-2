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
@Table (name="CLIENTE")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPOCLIENTE")
public abstract class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    
    String nome;
    public  Cliente () {
        
    }
    public  Cliente (String nome) {
        this.nome=nome;
    }
    public void  setNomeCliente (String nome) {
        this.nome=nome;
    }
    public Cliente getCliente()
    {
            return this;
    }
    public String getNomeCliente()
    {
            return this.nome;
    }
}
