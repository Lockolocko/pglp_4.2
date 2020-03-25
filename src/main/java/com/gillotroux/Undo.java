/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.Stack;

/**
 * Undo.
 * @author Lockolocko
 */
public class Undo implements GeneriqueCommand {
    /**
     * Historique des piles de la calculette.
     */
    private static Stack<Stack<String>> historiquePile;
    /**
     * Constructeur.
     */
    public Undo() {
        historiquePile = new Stack<Stack<String>>();
    }
    /**
     * ajoute une pile à l'historique.
     * @param pile
     */
    public static void add(final Stack<String> pile) {
        @SuppressWarnings("unchecked")
        Stack<String> pileCopie = (Stack<String>) pile.clone();
        historiquePile.push(pileCopie);
    }
    /**
     * Retourne le dernier élément de la pile.
     * @return pile
     */
    public Stack<String> getPile() {
        if (!historiquePile.isEmpty()) {
            return historiquePile.lastElement();
        } else {
            return new Stack<String>();
        }
    }
    /**
     * Retire le dernier état et modifie l'état de la pile courante.
     */
    public void apply() {
        if (!historiquePile.isEmpty()) {
            historiquePile.pop();
        } else {
            System.out.println("Undo impossible! La pile est vide.");
        }
    }
    /**
     * Affichage de toutes les piles de l'historique.
     */
    public static void affichage() {
        for (Stack<String> p : historiquePile) {
            for (String elem : p) {
                System.out.print(elem);
            }
            System.out.println("");
        }
    }

}
