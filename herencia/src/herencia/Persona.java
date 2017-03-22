/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author Puesto 2.2
 */
public abstract class Persona { /*Agrego "abstract"*/
    

    protected String nombre;
    
    protected String apellido;
    
    protected int edad;
    
    /*Constructores*/

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    

    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }


    /**
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
