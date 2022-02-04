
package taller1;

/**
 * Clase Casa para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class House {
    /**
     * Representa la dirección de la casa.
     */
    protected String adress;
    /**
     * Representa el número de ventanas de la casa.
     */
    public int numWindows;
    /**
     * Representa el número de baños de la casa.
     */
    public int numBathrooms;
    /**
     * Representa el número de habitaciones de la casa.
     */
    private int numRooms;
    /**
     * Representa el estrato social de la casa.
     */
    private int sratum;

    /**
     * 
     * @return La dirección de la casa. 
     */
    protected String getAdress() {
        return adress;
    }

    /**
     * Asigna el valor correspondiente a la dirección de la casa.
     * @param adress 
     */
    protected void setAdress(String adress) {
        this.adress = adress;
    }
    
}
