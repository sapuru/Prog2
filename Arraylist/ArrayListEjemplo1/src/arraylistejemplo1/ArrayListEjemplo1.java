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
public class ArrayListEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona("Alberto", 32);
        Persona per2 = new Persona("Juan", 44);
        
        Auto au1 = new Auto("Fiat", "fds453");
        Auto au2 = new Auto("Falcon", "fds444");
        Auto au3 = new Auto("VM", "sss333");
        
        per1.getRefAutos().add(au3); //obtengo la posición de memoria donde está el array 
        per1.getRefAutos().add(au1); 
        
        per2.getRefAutos().add(au2); 
        
        
        System.out.println("El dueño: "+per1.getNombre()+" del auto: ");
        
        per1.mostrarAutos();
        
        System.out.println("El dueño: "+per2.getNombre()+ " del auto: ");
        
        per2.mostrarAutos();
            }
    
}
