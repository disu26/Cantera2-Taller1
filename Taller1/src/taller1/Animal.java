
package taller1;

/**
 * Libreria para poder utilizar un ArrayList.
 */
import java.util.ArrayList; 

/**
 * Clase Animal para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class Animal {
    /**
     * Representa el nombre del animal.
     */
    public String name;
    /**
     * Representa el peso promedio del animal.
     */
    private float averageWeight;
    /**
     * Representa la altura promedio del animal.
     */
    private float averageHeight;
    /**
     * Representa los colores del animal.
     */
    public ArrayList<String> colors;
    
    /**
     * 
     * @return El nombre del animal
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna el valor correspondiente al nombre del animal.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
