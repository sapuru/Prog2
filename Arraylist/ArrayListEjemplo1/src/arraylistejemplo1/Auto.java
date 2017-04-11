/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistejemplo1;

/**
 *
 * @author Puesto 2.2
 */
public class Auto {
    
    private String modelo;
    
    private String dominio;

    public Auto() {
    }

    public Auto(String modelo, String dominio) {
        this.modelo = modelo;
        this.dominio = dominio;
    }
    
    

    /**
     * Get the value of dominio
     *
     * @return the value of dominio
     */
    public String getDominio() {
        return dominio;
    }

    /**
     * Set the value of dominio
     *
     * @param dominio new value of dominio
     */
    public void setDominio(String dominio) {
        this.dominio = dominio;
    }


    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
