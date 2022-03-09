/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author losa
 */

@Entity
public class Automovel {
    @Id
    @GeneratedValue
    private Long id;
    private String matricula;
    
    @ManyToOne (cascade = CascadeType.ALL)
    private GrupoAutomovel grupo;

    public Automovel() {
    }
    
    public Automovel(String matricula, GrupoAutomovel grupo){
        this.matricula=matricula; this.grupo=grupo;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public String getGrupo()
    {
        return grupo.toString();
    }
    
    public String toString()
    {
        return "matricula" + matricula + "\n " + getGrupo();
    }
}
