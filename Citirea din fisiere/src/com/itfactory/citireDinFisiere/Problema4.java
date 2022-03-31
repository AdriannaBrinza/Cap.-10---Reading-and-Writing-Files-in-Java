package com.itfactory.citireDinFisiere;

/* Sa se creeze un program prin care se citesc dintr-un fisier liniile acestuia, "problema4.txt".
Se cere ca sa se introduca intr-o lista doar liniile din fisier care nu contin litere mari. */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Problema4 {

    public static void main(String[] args) {

        String numeFisier = "problema4.txt";
        Path path = Paths.get(numeFisier);
        String line;
        List<String> listaLiniiMici = new ArrayList<>();

        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(line.toLowerCase())) {
                    listaLiniiMici.add(line);
                }
            }
            System.out.println("Lista liniilor care contin doar litere mici este: ");
            for (String linie : listaLiniiMici) {
                System.out.println("[" + linie + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}