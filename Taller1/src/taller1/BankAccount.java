
package taller1;

/**
 * Clase cuenta bancaria para el primer taller de la cantera nivel dos.
 * @author Dimar Andrey Suárez Hidalgo
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
}
