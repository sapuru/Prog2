/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instanciate;

/**
 *
 * @author Puesto 2.2
 */
public class Persona {
    
        private String apellido;
        
        private String nombre;
    
        private int edad;
        
        /*Constructores*/

    public Persona() {
    }

    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }
        
        
    /*Getters & Setters */
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
    
    /*Metodos*/
    
    public void crearDestino(String calle, int numero) { /*Creo el domicilio*/
        
        Domicilio refDomicilio = new Domicilio(calle, numero);
        
        //desde aquí se puede mostrar
        System.out.println("Domicilio"+ Domicilio);
    }

}
