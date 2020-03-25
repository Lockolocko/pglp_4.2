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
 */
public final class MoteurRPN {
    /**
     * Liste des commandes disponibles.
     */
    private Map<String, SpecificCommand> moteur;
    /**
     * Pile courante.
     */
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
     * @param a
     */
    void enregistre(final int a) {
        s.addElement(String.valueOf(a));
    }
    /**
     * Depile un élément.
     * @return string
     */
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
     * @param name
     * @param command
     */
    void addCommand(final String name, final SpecificCommand command) {
        this.moteur.put(name, command);
    }

    /**
     * Execute une commande.
     * @param name
     */
    void executeCommand(final String name) {
        if (this.moteur.containsKey(name) && s.size() >= 2) {
            int b = Integer.valueOf(s.pop());
            int a = Integer.valueOf(s.pop());
            s.push(String.valueOf(this.moteur.get(name).apply(a, b)));
        } else {
            System.out.println("Opérande insuffisante");
        }
    }

    /**
     * Prend une nouvelle pile et la copie dans celle
qui été couramment utilisée.
     * @param pile
     */
    void setStack(final Stack<String> pile) {
        @SuppressWarnings("unchecked")
        Stack<String> pileCopie = (Stack<String>) pile.clone();
        s = pileCopie;
    }

    /**
     * Retourne la pile courante.
     * @return pile
     */
    Stack<String> getStack() {
        return s;
    }

    /**
     * Constructeur public qui créer les commandes de notre moteur.
     * @return MoteurRPN
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
