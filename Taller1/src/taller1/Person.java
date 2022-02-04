
package taller1;

/**
 * Clase persona para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class Person {
    /**
     * Representa el nombre de la persona.
     */
    public String name;
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public java.util.Date dateBirth;
    /**
     * Representa la altura de la persona.
     */
    public float height;

    /**
     * 
     * @return El nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna el valor correspondiente al nombre de la persona.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
