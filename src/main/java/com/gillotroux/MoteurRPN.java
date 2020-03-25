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
    /**
     * Constructeur Moteur.
     */
    private MoteurRPN() {
        this.moteur = new HashMap<String, SpecificCommand>();
        this.s=new Stack<String>();
    }
    /**
     * Ajoute une entrée.
     * @param a
     */
    void enregistre(final int a) {
        s.addElement(String.valueOf(a));
    }
    /**
     * Affiche les operandes de la liste.
     */
    void affiche() {
        for(String operande : s) {
            System.out.println(operande);
        }
    }
    /**
     * Ajoute une commande.
     * @param name
     * @param command
     */
    void addCommand(String name, SpecificCommand command) {
        this.moteur.put(name,command);
    }
    /**
     * Execute une commande.
     * @param name
     */
    void executeCommand(String name) {
        if(this.moteur.containsKey(name)) {
            this.moteur.get(name).apply();
        }
    }
    static MoteurRPN init() {
        MoteurRPN moteurInit= new MoteurRPN();
        moteurInit.a
        return moteurInit;
    }
}
