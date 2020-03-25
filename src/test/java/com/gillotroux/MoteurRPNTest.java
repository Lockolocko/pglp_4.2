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
    }

}
