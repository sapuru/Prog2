/*
Creo en la clase origen un metodo en la clase origen que reciba como parametro el objeto del destino.
Relación de dependencia
No debo matrizarlo. 
 */

package uso;

/**
 *
 * @author Puesto 2.2
 */
public class Uso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona("Perez", "Juan", 53);
        Domicilio dom1 = new Domicilio(); /*Creo la variable con el constructor vacío*/
        
        per1.usarDestino(dom1);
        
    }
    
}
