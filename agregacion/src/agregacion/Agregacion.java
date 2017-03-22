/*
 En un UML es como un diamante en blanco o vacío en el puntero de origen. 
Cuando me encuentro con una agregación debo dotar a la clase origen con un metodo adicional 
que me permita agregar
el elemento destino y asignarlo al atributo propio de la clase origen.
 */

package agregacion;

/**
 *
 * @author Puesto 2.2
 */
public class Agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona();
        Domicilio dom1 = new Domicilio();
        per1.agregarDestino(dom1); /*Llama al método adicional creado en Persona */ 
    }
    
}
