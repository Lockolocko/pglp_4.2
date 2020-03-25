/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Interpreteur.
 * @author Lockolocko
 *
 */
public class Interpreteur {
    /**
     * Commandes quit et undo.
     */
    private Map<String,GeneriqueCommand> commands;
    private Stack<String> s;
    private int a;
    private int b;

    private Interpreteur () {
        this.commands=new HashMap<String,GeneriqueCommand>();
        this.s=new Stack<String>();
    }
    
    void addCommand(String name,GeneriqueCommand command) {
        this.commands.put(name, command);
    }
 
    void executeCommand(String name) {
        if(this.commands.containsKey(name)) {
            this.commands.get(name).apply();
        }
    }
    
    static Interpreteur init() {
        Interpreteur interpreteur = new Interpreteur();
        GeneriqueCommand quit = new Quit();
        GeneriqueCommand undo = new Undo();
        interpreteur.addCommand("quit", quit);
        interpreteur.addCommand("undo", undo);
        return interpreteur;
    }
}
