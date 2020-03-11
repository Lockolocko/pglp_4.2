/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * MoteurRPN.
 * @author Lockolocko
 *
 */
public class MoteurRPN {
    private Map<String,SpecificCommand> moteur;
    private Stack<String> s;
    
    private MoteurRPN() {
        this.moteur = new HashMap<String, SpecificCommand>();
        this.s=new Stack<String>();
    }
    
    void enregistre(final int a) {
        s.addElement(String.valueOf(a));
    }

}
