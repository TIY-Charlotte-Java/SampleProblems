package com.theironyard.clt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Ben on 5/16/16.
 */
public class Fruits {

    // 1. Read "fruits.csv" from file
    public static String fileReading() throws FileNotFoundException{
        ArrayList<String> fruits = new ArrayList<>();
        File f = new File("fruits.csv");
        FileReader fr = new FileReader(f);
        Scanner scanner = new Scanner(fr);
        while (scanner.hasNext()) {
            fruits.add(scanner.next());
        }

        return fruits.stream().distinct().filter(t -> !t.trim().contains("[^\\w]")).collect(Collectors.joining(","));

    }
    // 2. Get all single-word fruits, sort them by length
    // 3. Print the sorted and filtered list.
}
