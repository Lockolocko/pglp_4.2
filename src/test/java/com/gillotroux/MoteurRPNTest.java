package com.gillotroux;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoteurRPNTest {

    @Test
    public void test() {
        MoteurRPN moteurTest=MoteurRPN.init();
        
        moteurTest.enregistre(3);
        moteurTest.enregistre(4);
        
        moteurTest.affiche();
        
        // Test de l'addition.
        moteurTest.executeCommand("+");
        
        moteurTest.affiche();
        
        // Test de la soutraction.
        moteurTest.enregistre(5);
        moteurTest.executeCommand("-");
        moteurTest.affiche();
        
        // Test de la multiplication.
        moteurTest.enregistre(15);
        moteurTest.executeCommand("*");
        moteurTest.affiche();
        
        // Test de la division.
        moteurTest.enregistre(3);
        moteurTest.executeCommand("/");
        moteurTest.affiche();
    }

}
