package com.itfactory.citireDinFisiere;

/* Sa se creeze un program simplu prin care se citesc dintr-un fisier "cuvinte.txt" texte de pe fiecare linie. (Se va citi cu metoda
de la Exemplu1 de la curs). Se cere sa se parcurga lista de cuvinte citita din fisier si sa se afiseze doar cuvintele care contin litera "a". */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Problema1 {

    public static void main(String[] args) throws IOException {

        String numeFisier = "cuvinte.txt";
        Path path = Paths.get(numeFisier);
        List<String> lista = Files.readAllLines(path);

        for (String linie : lista) {
            String[] array = linie.split(" ");
            for (String s : array) {
                if (s.contains("a")) {
                    System.out.println(s);
                }
            }
        }

    }

}