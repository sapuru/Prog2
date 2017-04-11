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
public class Provincia {
    
    private int id;
        
    private String nombre;
    
    private Pais refPais;

    public Pais getRefPais() {
        return refPais;
    }

    public void setRefPais(Pais refPais) {
        this.refPais = refPais;
    }

    public Provincia() {
    }

    public Provincia(int id, String nombre, Pais refPais) {
        this.id = id;
        this.nombre = nombre;
        this.refPais = refPais;
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
    
        public void agregarOtroDestinoMas(Pais pais) {
        this.refPais=pais;
    }

}
