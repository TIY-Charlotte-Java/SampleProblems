package com.theironyard.clt;

import java.util.ArrayList;

// DO NOT MODIFY THIS CLASS
abstract class Robot {
    private static ArrayList<String> laws = new ArrayList<>();

    Robot() {
        laws.add("A robot may not injure a human being or, through inaction, allow a human being to come to harm.");
        laws.add("A robot must obey the orders given it by human beings except where such orders would conflict with the First Law.");
        laws.add("A robot must protect its own existence as long as such protection does not conflict with the First or Second Laws.");
    }


    protected static ArrayList<String> getLaws() {
        return laws;
    }
}