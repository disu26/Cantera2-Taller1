
package taller1;

/**
 * Clase cuenta bancaria para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class BankAccount {
    /**
     * Representa el número de cuenta de la cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa si la cuenta bancaria está o no activada.
     */
    protected boolean activated;
    
    /**
     * 
     * @return Valor booleano, que representa si la cuenta está o no activada.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Asigna el valor correspondiente a la activación o a la no activación de la cuenta.
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
