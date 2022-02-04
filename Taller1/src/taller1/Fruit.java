
package taller1;

/**
 * Libreria para poder utilizar un ArrayList.
 */
import java.util.ArrayList; 

/**
 * Clase fruta para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta.
     */
    private float averageWeight;
    /**
     * Representa los colores de la fruta.
     */
    ArrayList<String> colors;

    /**
     * 
     * @return Los colores de la fruta, en una ArrayList.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Asigna el valor correspondiente a los colores de la fruta.
     * @param colors 
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
}
