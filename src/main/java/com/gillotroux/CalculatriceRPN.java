/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Main.
 * @author Lockolocko
 */
public final class CalculatriceRPN {
    /**
     * Constructeur.
     */
    private CalculatriceRPN() {
    }
    /**
     * Calculatrice RPN de Raphaël Gillot-Roux.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Bienvenue sur la Calculatrice de Gillot-Roux");
        SaisieRPN saisie = new SaisieRPN();
        while (true) {
            saisie.entree();
        }
    }
}
