/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Multiplication.
 * @author Lockolocko
 *
 */
public class Multiplication implements SpecificCommand {
    /**
     * Effectue la multiplication a * b
     * @param a
     * @param b
     */
    public int apply(int a,int b) {
        return a * b;
    }
}
