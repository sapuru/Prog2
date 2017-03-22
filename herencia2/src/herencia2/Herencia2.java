/*
El mecanismo de la herencia hace que aunque haya pedido que se construya el hijo, 
Primero debe llamar al constructor del padre, y el padre llama al contstructor de Abuelo.
Por eso el resultado es construye primero Abuelo, luego Padre y luego hijo.
 */

package herencia2;

/**
 *
 * @author Puesto 2.2
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hijo hijo1 = new Hijo();
    }
    
}
