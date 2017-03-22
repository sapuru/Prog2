/*
Instanciación
Relación de dependiencia
No debo matrizarlo. 
En tiempo de ejecución
Creamos un metodo adicional en la clase origen como si fuera un contructor que tendrá la responsabilidad de 
crear el objeto destino
 */

package instanciate;

/**
 *
 * @author Puesto 2.2
 */
public class Instanciate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona("Perez", "Jose", 72);
        
        /*Opcional crear o no crear un domicilio*/
        
        per1.crearDestino("Rodriguez", 238); 
        
        //desde aquí no se pueden acceder a los datos del domicilio, por lo tanto no puedo mostrar
    
    }
    
}
