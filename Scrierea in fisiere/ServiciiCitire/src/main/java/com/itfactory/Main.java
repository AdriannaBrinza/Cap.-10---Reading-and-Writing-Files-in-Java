package com.itfactory;

import java.io.IOException;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String word = "Atlas";

        try {
            System.out.println("It is " + ServiciiCitire.checkIfEmptyFile(fileName) + " that the file \'" + fileName + "\' is empty.");
            System.out.println("It is " + ServiciiCitire.containsSpecificWord(fileName, word) + " the file \'" + fileName + "\' contains the word \'" + word + "\'.");
        } catch (IOException e) {
            System.out.println("The file doesn't exist.");
            e.printStackTrace();
        }
    }

}