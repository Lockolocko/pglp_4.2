/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Division.
 * @author Lockolocko
 *
 */
public class Division implements SpecificCommand {
    /**
     * Effectue la division a / b
     * @param a
     * @param b
     * @return
     */
    public int apply(int a,int b) {
        return a / b;
    }
}
