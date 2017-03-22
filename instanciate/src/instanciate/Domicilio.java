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
public class Domicilio {
    
    private String calle;
    
    private int numero;
    
    /*Constructores*/

    public Domicilio() {
    }

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    
    /*Getters & Setters*/
    
    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Get the value of calle
     *
     * @return the value of calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Set the value of calle
     *
     * @param calle new value of calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    /*Metodos*/

}
