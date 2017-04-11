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
public class PracticaParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pais pais1 = new Pais(2, "Argentina");
        Provincia prov1 = new Provincia(1, "Mendoza", pais1);
        Localidad loca1 = new Localidad(4, "Godoy Cruz", prov1);
        Domicilio dom1 = new Domicilio("Rivadavia", 345, loca1);
        Alumno alu1 = new Alumno(76532, "Juan", "Perez");
        Persona per1 = new Persona();
        
        
        System.out.println("Los datos del alumno: "+alu1.getNombre()+" "+ alu1.getApellido());
        
        System.out.println("Domicilio: "+alu1.getRefDomicilio());
    }
    
}
