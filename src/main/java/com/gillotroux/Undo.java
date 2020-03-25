/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.Stack;

/**
 * Undo.
 * @author Lockolocko
 *
 */
public class Undo implements GeneriqueCommand {
    private Stack<Stack<String>> historiquePile;
    
    public Undo() {
        historiquePile =new Stack<Stack<String>>();
    }
    
    public void add (Stack<String> pile) {
        historiquePile.push(pile);
    }
    
    public Stack<String> getPile() {
        return historiquePile.lastElement();
    }
    
    public void apply() {
        historiquePile.pop();
    }

}
