package com.theironyard.clt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ben on 5/16/16.
 */
public class Fruits {

    // 1. Read "fruits.csv" from file
    public void filereading() throws FileNotFoundException{
        File f = new File("fruits.cvs");
        Scanner scanner = new Scanner(f);
        while (scanner.hasNext()) {

        }

    }
    // 2. Get all single-word fruits, sort them by length
    // 3. Print the sorted and filtered list.
}
