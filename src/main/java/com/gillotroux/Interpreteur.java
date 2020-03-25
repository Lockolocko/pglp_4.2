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
    /**
     * Constructeur.
     */
    private Interpreteur () {
        this.commands=new HashMap<String,GeneriqueCommand>();
    }
    /**
     * Créer la commande name qui effectue command.
     * @param name
     * @param command
     */
    void addCommand(String name,GeneriqueCommand command) {
        this.commands.put(name, command);
    }
    /**
     * Execute la commande name.
     * @param name
     */
    void executeCommand(String name) {
        if(this.commands.containsKey(name)) {
            this.commands.get(name).apply();
        }
    }
    /**
     * Constructeur public avec les fonctions prédéfinis.
     * @return
     */
    static Interpreteur init() {
        Interpreteur interpreteur = new Interpreteur();
        GeneriqueCommand quit = new Quit();
        GeneriqueCommand undo = new Undo();
        interpreteur.addCommand("quit", quit);
        interpreteur.addCommand("undo", undo);
        return interpreteur;
    }
}
