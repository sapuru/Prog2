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
public class Alumno extends Persona{
    
    private int legajo;

    public Alumno() {
    }

    public Alumno(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(int legajo, String nombre, String apellido) {
        super(nombre, apellido);
        this.legajo = legajo;
    }

    
    /**
     * Get the value of legajo
     *
     * @return the value of legajo
     */
    public int getLegajo() {
        return legajo;
    }

    /**
     * Set the value of legajo
     *
     * @param legajo new value of legajo
     */
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    
}
