package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Let's create an empty HashMap so that we can
        // loop through and see how that works

        // This chapters hash map will contain chapter numbers as keys
        // and chapter titles as values
        HashMap<Integer, String> chapters = new HashMap<>();
        // Let's add in some key/value pairs into this chapters HashMap
        // Chapter 1: Introduction and Setup
        chapters.put(1, "Introduction and Setup");
        chapters.put(2, "Data Types");

        // Let's print out all of the info from our chapters hash map
        // to the console
//        System.out.println(chapters);

        // for each chapter in chapters
        // EntrySet<Map.Entry<Integer, String>
        // ArrayList<Map.Entry<Integer, String>
        for (Map.Entry<Integer, String> chapter : chapters.entrySet()) {
            System.out.println("Chapter " + chapter.getKey() + ": " + chapter.getValue());
        }
    }
}
