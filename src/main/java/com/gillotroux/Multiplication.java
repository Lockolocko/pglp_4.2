/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

/**
 * Multiplication.
 * @author Lockolocko
 */
public class Multiplication implements SpecificCommand {
    /**
     * Effectue la multiplication a * b.
     * @param a
     * @param b
     * @return multiplication
     */
    public int apply(final int a, final int b) {
        return a * b;
    }
}
