/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;

import java.util.Map;
import java.util.Stack;
import java.util.Scanner;

/**
 * SaisieRPN.
 * @author Lockolocko
 *
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
     * Scanner pour récupérer les entrées.
     */
    private Scanner sc = new Scanner(System.in);
    
    public SaisieRPN() {
        this.moteur=MoteurRPN.init();
        this.interprete=Interpreteur.init();
    }
    
    public void entree() {
        System.out.println("Veuillez saisir une action :");
        String str = sc.nextLine();
        
        if (str.equals("quit")) {
            interprete.executeCommand(str);
        }
        else if (str.equals("undo")) {
            interprete.executeCommand(str);
        }
        else if (str.equals("-") || str.equals("*")  || str.equals("/") || str.equals("+")) {
            moteur.executeCommand(str);
        }
        else {
            try {
                int nombre = Integer.parseInt(str);
                moteur.enregistre(nombre);
                } catch(NumberFormatException e) {
                System.out.println("Cette entrée est invalide");
              }      
        }
        
    }
}
