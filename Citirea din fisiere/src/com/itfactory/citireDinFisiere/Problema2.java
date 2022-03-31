package com.itfactory.citireDinFisiere;

/* Sa se creeze un program simplu prin care se citesc numere de tip int dintr-un fisier "numere.txt", si se afiseaza suma lor. */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problema2 {
    public static void main(String[] args) throws IOException {
        String numeFisier = "numere.txt";
        Path path = Paths.get(numeFisier);

        BufferedReader bufferedReader = Files.newBufferedReader(path);
        String line;
        int suma = 0;

        while ((line = bufferedReader.readLine()) != null) {
            String[] array = line.split(" ");
            for (String s : array) {
                if (s.matches("[0-9]+")) {
                    suma += Integer.parseInt(s);
                }
            }
        }
        System.out.println("Suma numerelor din fisier este: " + suma);
    }
}
