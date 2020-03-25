/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.HashMap;
import java.util.Map;

/**
 * Interpreteur.
 * @author Lockolocko
 */
public final class Interpreteur {
    /**
     * Commandes quit et undo.
     */
    private Map<String, GeneriqueCommand> commands;

    /**
     * Constructeur.
     */
    private Interpreteur() {
        this.commands = new HashMap<String, GeneriqueCommand>();
    }

    /**
     * Créer la commande name qui effectue command.
     * @param name
     * @param command
     */
    void addCommand(final String name, final GeneriqueCommand command) {
        this.commands.put(name, command);
    }

    /**
     * Execute la commande name.
     * @param name
     */
    void executeCommand(final String name) {
        if (this.commands.containsKey(name)) {
            this.commands.get(name).apply();
        }
    }

    /**
     * Constructeur public avec les fonctions prédéfinis.
     * @param historique
     * @return Interpreteur
     */
    static Interpreteur init(final Undo historique) {
        Interpreteur interpreteur = new Interpreteur();
        GeneriqueCommand quit = new Quit();
        interpreteur.addCommand("quit", quit);
        interpreteur.addCommand("undo", historique);
        return interpreteur;
    }
}
