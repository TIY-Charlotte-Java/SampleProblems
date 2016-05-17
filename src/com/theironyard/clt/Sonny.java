package com.theironyard.clt;

import java.util.ArrayList;

/**
 * Created by Ben on 5/16/16.
 */
public class Sonny extends Robot {

    // Use the base "Robot" class
    // Setup Sonny to implement an additional fourth law:
    // "A robot may not harm humanity, or, by inaction, allow humanity to come to harm."

    @Override
    protected ArrayList<String> getLaws() {
        ArrayList<String> newLaws = super.getLaws();
        newLaws.add("A robot may not harm humanity, or, by inaction, allow humanity to come to harm.");
        System.out.println(newLaws.get(3));
        return newLaws;
    }

    // override the base "getLaws" method to print this fourth law.

    // add a method called "getName()" that prints "Hello, my name is XXX", where
    // "XXX" is the name of the current class. In this case, Sonny.

    public void getName() {
        System.out.println("Hello, my name is Sonny");
    }
    
}

