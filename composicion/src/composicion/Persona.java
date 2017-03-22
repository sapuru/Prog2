/*
Clase personal
 */

package composicion;

/**
 *
 * @author Puesto 2.2
 */
public class Persona {
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    private Domicilio refDomicilio; /*matrizado estáticamente - enlace explícito*/
    
    /*Constructores */

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String calle, int numero) { /*paso las referencias del domicilio*/
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        refDomicilio= new Domicilio(calle,numero); /*Creo la composición */
    }

    /*Getters & Setters*/
    public Domicilio getRefDomicilio() {
        return refDomicilio;
    }

    public void setRefDomicilio(Domicilio refDomicilio) {
        this.refDomicilio = refDomicilio;
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
     * Get the value of apellido
     *
     * @return the value of apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set the value of apellido
     *
     * @param apellido new value of apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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

}
