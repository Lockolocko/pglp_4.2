/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Quit et undo.
 * @author Lockolocko
 *
 */
public interface GeneriqueCommand extends CommandInterface {
    /**
     * Quit.
     */
    void quit();
    /**
     * Undo.
     */
    void undo();
}
