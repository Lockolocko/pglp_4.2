/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Quit.
 * @author Lockolocko
 *
 */
public class Quit implements GeneriqueCommand {
    /**
     * Permet l'arr�t de la calcultrice.
     */
    public void apply() {
        System.exit(0);
    }

}
