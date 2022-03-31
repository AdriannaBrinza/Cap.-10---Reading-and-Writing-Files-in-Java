package com.itfactory.citireDinFisiere;

/* Sa se creeze un program prin care se citesc dintr-un fisier liniile acestuia, "problema3.txt".
Se cere ca sa se introduca intr-o lista doar cuvintele din fisier care nu contin litere mari. */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Problema3 {

    public static void main(String[] args) {
        String numeFisier = "problema3.txt";
        Path path = Paths.get(numeFisier);
        String line;
        List<String> listaLitereMici = new ArrayList<>();

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(" ");
                for (String s : array) {
                    if (s.equals(s.toLowerCase())) {
                        listaLitereMici.add(s);
                    }
                }
            }
            System.out.println(listaLitereMici);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}