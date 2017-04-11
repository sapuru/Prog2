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
public class Localidad {
    
    private int id;
    
    private String nombre;
    
    private Provincia refProvincia;

    public Provincia getRefProvincia() {
        return refProvincia;
    }

    public void setRefProvincia(Provincia refProvincia) {
        this.refProvincia = refProvincia;
    }

    public Localidad() {
    }

    public Localidad(int id, String nombre, Provincia refProvincia) {
        this.id = id;
        this.nombre = nombre;
        this.refProvincia = refProvincia;
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
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    public void agregarOtroDestino(Provincia prov) {
        this.refProvincia=prov;
    }
}
