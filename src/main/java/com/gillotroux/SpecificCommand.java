/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

/**
 * Addition et Soustraction.
 * @author Lockolocko
 */
public interface SpecificCommand {
    /**
     * Fonction apply.
     * @param a
     * @param b
     * @return operation
     */
    int apply(int a, int b);
}
