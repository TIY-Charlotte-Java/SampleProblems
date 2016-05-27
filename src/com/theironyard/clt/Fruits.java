package com.theironyard.clt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by Ben on 5/16/16.
 */
public class Fruits {

    // 1. Read "fruits.csv" from file
    public static Object[] filereading() throws FileNotFoundException{
        ArrayList<String> fruits = new ArrayList<>();
        File f = new File("fruits.cvs");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {
            fruits.add(scanner.next());
        }

        return fruits.stream().distinct().filter(Predicate.isEqual("[^\\w]")).toArray();

    }
    // 2. Get all single-word fruits, sort them by length
    // 3. Print the sorted and filtered list.
}
