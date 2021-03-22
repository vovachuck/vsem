package com.company.module1;
/**
 @author   Volodymyr Lakusta
 @project   vsem
 @class  Harry
 @version  1.0.0
 @since 14.03.2021 - 12.40
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {

    public  static String[] getDistinctWordsFromText(String text){

        // clear from punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // split text by space
        String[] words = text.split(" ");

        String distinctWords = "";

        for (String word : words) {
            if (!distinctWords.contains(word)) {
                distinctWords += word + " ";
            }
        }

        return distinctWords.split(" ");
    }

    public static void main(String[] args) throws IOException {

        // Load harry.txt to a string
        String harryText = new String(Files.readAllBytes(Paths.get("src/com/company/harry.txt")));

        String[] distinctWords = getDistinctWordsFromText(harryText);

        Arrays.sort(distinctWords);

        for (int i = 0; i < 100; i++) {
            System.out.println(distinctWords[i]);
        }

        /* Output:
        'Alohomora
        'Atta
        'Cause
        'Course
        'Dumbledore
        'Harry's
        'Jordan
        'Mr
        'NMat
        'Oh
        'Pig
        'Quidditch'
        'Scuse
        'Snot
        'Up'
        .
        .
        .
        */


    }

}
