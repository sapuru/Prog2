/*
En el UML figura como un diamante pintado o rellenado en el puntero de origen. 
Es un tipo de asociación. 
En la composición la responsabilidad de crear el objeto destino la tiene el objeto origen.
Para ello se debe hacer el "new" del objeto destino en el constructor del Objeto Origen. 
De este modo tenemos que tener en cuenta que no solamente van a seguir los parámetros de los
atributos de la clase origen, sino tambien los atributos de la clase destino.

En el caso de la composición la vida del objeto destino depende del objeto origen. 
*/

package composicion;

/**
 *
 * @author Puesto 2.2
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona per1 = new Persona("carlos","cortez",53,"rivadavia",798);
        
    }
    
}
