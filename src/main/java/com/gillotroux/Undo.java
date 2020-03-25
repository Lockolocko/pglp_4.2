/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.Stack;

/**
 * Undo.
 * 
 * @author Lockolocko
 *
 */
public class Undo implements GeneriqueCommand {
    private static Stack<Stack<String>> historiquePile;

    public Undo() {
        historiquePile = new Stack<Stack<String>>();
    }

    public static void add(Stack<String> pile) {
        @SuppressWarnings("unchecked")
        Stack<String> pileCopie = (Stack<String>) pile.clone();
        historiquePile.push(pileCopie);
    }

    public Stack<String> getPile() {
        if (!historiquePile.isEmpty()) {
            return historiquePile.lastElement();
        } else {
            return new Stack<String>();
        }
    }

    public void apply() {
        if (!historiquePile.isEmpty()) {
            historiquePile.pop();
        } else {
            System.out.println("Undo impossible! La pile est vide.");
        }
    }

    public static void affichage() {
        for (Stack<String> p : historiquePile) {
            for (String elem : p) {
                System.out.print(elem);
            }
            System.out.println("");
        }
    }

}
