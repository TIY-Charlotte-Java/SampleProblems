package com.theironyard.clt;

import java.util.ArrayList;

// Write code to reverse a String. Do not use
// Any java language features that will perform this action for you.
public class Reverse {

    public static String stringReverse(String string) {
        String results;
        ArrayList<Character> list = new ArrayList<>();
        char[] work = string.toCharArray();

        for (int i = 0; i < work.length; i++) {
            list.add(work[work.length - (i + 1)]);
        }
        results = list.toString();

        return results;
    }
}
