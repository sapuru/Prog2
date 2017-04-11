/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */

package arraylistejemplo1;

import java.util.ArrayList;

/**
 *
 * @author Puesto 2.2
 */
public class Persona {
    
    private String nombre;
    
    private int edad;

    private ArrayList<Auto> refAutos;

    public ArrayList<Auto> getRefAutos() {
        return refAutos;
    }

    public void setRefAutos(ArrayList<Auto> refAutos) {
        this.refAutos = refAutos;
    }

    
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        refAutos = new ArrayList();
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
    
    public void mostrarAutos() {
        for (Auto p : refAutos) {
            System.out.println("Marca: "+ p.getModelo()+" Dominio: "+p.getDominio());
        }
    }

}
