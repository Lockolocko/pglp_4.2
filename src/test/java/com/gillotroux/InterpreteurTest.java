package com.gillotroux;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterpreteurTest {

    @Test
    public void test() {
        Interpreteur test=Interpreteur.init(new Undo());
        System.out.println("test 1");
        test.executeCommand("quit");
        System.out.println("test 2");
    }

}
