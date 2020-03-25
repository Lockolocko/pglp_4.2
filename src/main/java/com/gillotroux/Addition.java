/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Addition.
 * @author Lockolocko
 *
 */
public class Addition implements SpecificCommand {
    /**
     * Effectue la addition a + b
     * @param a
     * @param b
     */
    public int apply(int a,int b) {
        return a+b;
    }
}