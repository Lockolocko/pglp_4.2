/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

/**
 * Addition.
 * @author Lockolocko
 */
public class Addition implements SpecificCommand {
    /**
     * Effectue la addition a + b.
     * @param a
     * @param b
     * @return somme
     */
    public int apply(final int a, final int b) {
        return a + b;
    }
}
