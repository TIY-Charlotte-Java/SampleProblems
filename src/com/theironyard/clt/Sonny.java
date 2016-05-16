package com.theironyard.clt;

import java.util.ArrayList;

/**
 * Created by Ben on 5/16/16.
 */
public class Sonny {

    // Use the base "Robot" class
    // Setup Sonny to implement an additional fourth law:
    // "A robot may not harm humanity, or, by inaction, allow humanity to come to harm."

    // override the base "getLaws" method to print this fourth law.

    // add a method called "getName()" that prints "Hello, my name is XXX", where
    // "XXX" is the name of the current class. In this case, Sonny.




    // DO NOT MODIFY THIS CLASS
    abstract class Robot {
        private ArrayList<String> laws = new ArrayList<>();

        Robot() {
            laws.add("A robot may not injure a human being or, through inaction, allow a human being to come to harm.");
            laws.add("A robot must obey the orders given it by human beings except where such orders would conflict with the First Law.");
            laws.add("A robot must protect its own existence as long as such protection does not conflict with the First or Second Laws.");
        }


        protected ArrayList<String> getLaws() {
            return laws;
        }
    }
}

