
package taller1;

/**
 * Libreria para poder utilizar un ArrayList.
 */
import java.util.ArrayList; 

/**
 * Clase País para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class Country {
    /**
     * Representa el nombre del país.
     */
    public String name;
    /**
     * Representa los estados del país.
     */
    public ArrayList<String> state;
    /**
     * Representa las ciudades del país.
     */
    public ArrayList<String> city;
    /**
     * Representa la población del país.
     */
    private float poblation;

    /**
     * 
     * @return El nombre del país.
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna el valor correspondiente al nombre del país.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}

