/*
Herencia: Gráfico es una flecha que termina en punta cerrada o triangulo cerrado
Visibilidad protegida significa que va a ser visto por los hijos y privado para el resto.
En UML las escritas en itálica son las clases abstractas, son las clases padres, no se puede hacer un "new", o sea no se puede
instancear desde una clase abstracta. Pueden tener atributos y constantes. Pueden tener métodos concretos y abstractos.

Un método concreto es un método que tiene implementación de código
Un método abstracto es un método que no tiene implementación de código, sino que es un enunciado 
para que las clases hijas lo implementen de una forma distinta. 

 */

package herencia;

/**
 *
 * @author Puesto 2.2
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alu1 = new Alumno(2345, "Juan", "Perez", 27);
        Profesor prof1 = new Profesor(3, "Aymara", "Samudio", 34);
        
        System.out.println("El alumno se llama "+ alu1.getNombre());
        
        System.out.println("El apellido del alumno es "+ alu1.getApellido());
        
        System.out.println("El legajo es "+ alu1.getLegajo());
        
        
        System.out.println("El nombre del profesor es: "+ prof1.getNombre());
        
        System.out.println("Tiene: "+ prof1.getCantHijos()+" hijos");
    }
    
}
