package com.gillotroux;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class UndoTest {

    @Test
    public void test() {
        Undo test=new Undo();
        Stack<String> pile= new Stack<String>();
        
        pile.push("5");
        Undo.add(pile);
        pile.push("5");
        Undo.add(pile);
        Undo.affichage();
        test.apply();
        Undo.affichage();
        
        for(String elem : test.getPile()) {
            System.out.print(elem);
        }
    }

}
