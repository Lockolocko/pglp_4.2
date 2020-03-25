/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

/**
 * Soustraction.
 * @author Lockolocko
 */
public class Soustraction implements SpecificCommand {
    /**
     * Effectue la soustraction a - b.
     * @param a
     * @param b
     * @return soustraction
     */
    public int apply(final int a, final int b) {
        return a - b;
    }
}
