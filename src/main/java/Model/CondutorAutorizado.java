/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author losa
 */
@Entity
public class CondutorAutorizado {
    @Id
    @GeneratedValue
    private int idcondutor;
    private String nome;
    private String numeroCartaConducao;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="contrato_id")
    private ContratoAluguer contrato;
    
    
    public CondutorAutorizado() {}
    public CondutorAutorizado (String nome)
    {
        this.nome=nome;
       
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public ContratoAluguer getContrato()
    {
        return this.contrato;
    }
    
    
   }

