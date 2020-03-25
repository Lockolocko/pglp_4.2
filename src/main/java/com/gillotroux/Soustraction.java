/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Soustraction.
 * @author Lockolocko
 *
 */
public class Soustraction implements SpecificCommand {
    /**
     * Effectue la soustraction a - b
     * @param a
     * @param b
     */
    public int apply(int a,int b) {
        return a-b;
    }
}
