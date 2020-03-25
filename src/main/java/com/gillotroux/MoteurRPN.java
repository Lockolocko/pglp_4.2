/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * MoteurRPN.
 * 
 * @author Lockolocko
 *
 */
public class MoteurRPN {
    private Map<String, SpecificCommand> moteur;
    private Stack<String> s;

    /**
     * Constructeur Moteur.
     */
    private MoteurRPN() {
        this.moteur = new HashMap<String, SpecificCommand>();
        this.s = new Stack<String>();
    }

    /**
     * Ajoute une entrée.
     * 
     * @param a
     */
    void enregistre(final int a) {
        s.addElement(String.valueOf(a));
    }

    String depiler() {
        return s.pop();
    }

    /**
     * Affiche les operandes de la liste.
     */
    void affiche() {
        System.out.printf("Etat de la pile:");
        for (String operande : s) {
            System.out.printf(" " + operande + " ");
        }
        System.out.println("");
    }

    /**
     * Ajoute une commande.
     * 
     * @param name
     * @param command
     */
    void addCommand(String name, SpecificCommand command) {
        this.moteur.put(name, command);
    }

    /**
     * Execute une commande.
     * 
     * @param name
     */
    void executeCommand(String name) {
        if (this.moteur.containsKey(name)) {
            int b = Integer.valueOf(s.pop());
            int a = Integer.valueOf(s.pop());
            s.push(String.valueOf(this.moteur.get(name).apply(a, b)));
        }
    }

    /**
     * Prend une nouvelle pile et la copie dans celle qui été couramment utilisée.
     * 
     * @param pile
     */
    void setStack(Stack<String> pile) {
        @SuppressWarnings("unchecked")
        Stack<String> pileCopie = (Stack<String>) pile.clone();
        s = pileCopie;
    }

    /**
     * Retourne la pile courante.
     * 
     * @return
     */
    Stack<String> getStack() {
        return s;
    }

    /**
     * Constructeur public qui créer les commandes de notre moteur.
     * 
     * @return
     */
    static MoteurRPN init() {
        MoteurRPN moteurInit = new MoteurRPN();
        SpecificCommand plus = new Addition();
        SpecificCommand moins = new Soustraction();
        SpecificCommand mul = new Multiplication();
        SpecificCommand div = new Division();
        moteurInit.addCommand("+", plus);
        moteurInit.addCommand("-", moins);
        moteurInit.addCommand("*", mul);
        moteurInit.addCommand("/", div);
        return moteurInit;
    }
}
