/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.Scanner;

/**
 * SaisieRPN.
 * @author Lockolocko
 */
public class SaisieRPN {
    /**
     * Moteur de la calculatrice.
     */
    private MoteurRPN moteur;
    /**
     * Interpreteur.
     */
    private Interpreteur interprete;
    /**
     * Scanner pour r�cup�rer les entr�es.
     */
    private Scanner sc = new Scanner(System.in);
    /**
     * Undo pile.
     */
    private Undo historique;
    /**
     * Constructeur.
     */
    public SaisieRPN() {
        this.moteur = MoteurRPN.init();
        this.historique = new Undo();
        this.interprete = Interpreteur.init(historique);
    }
    /**
     * G�re les entree.
     */
    public void entree() {
        System.out.println("Veuillez saisir une action :");
        String str = sc.nextLine();
        if (str.equals("quit")) {
            interprete.executeCommand(str);
        } else if (str.equals("undo")) {
            interprete.executeCommand(str);
            moteur.setStack(historique.getPile());
            moteur.affiche();
        } else if (str.equals("-") || str.equals("*")
|| str.equals("/") || str.equals("+")) {
            moteur.executeCommand(str);
            historique.add(moteur.getStack());
            moteur.affiche();
        } else {
            try {
                int nombre = Integer.parseInt(str);
                moteur.enregistre(nombre);
                historique.add(moteur.getStack());
                moteur.affiche();
            } catch (NumberFormatException e) {
                System.out.println("Cette entr�e est invalide");
            }
        }

    }
}
