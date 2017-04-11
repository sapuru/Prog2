/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaparcial;

/**
 *
 * @author Puesto 2.2
 */
public class Profesor extends Persona{
    
        private int cantHijos;

    public Profesor() {
    }

    public Profesor(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Profesor(int cantHijos, String nombre, String apellido) {
        super(nombre, apellido);
        this.cantHijos = cantHijos;
    }

        
    /**
     * Get the value of cantHijos
     *
     * @return the value of cantHijos
     */
    public int getCantHijos() {
        return cantHijos;
    }

    /**
     * Set the value of cantHijos
     *
     * @param cantHijos new value of cantHijos
     */
    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    
}
