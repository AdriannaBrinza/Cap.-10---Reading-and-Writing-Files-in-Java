package com.itfactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numele fisierului pentru care doriti sa faceti o copie: ");
        String numeFisier = scanner.nextLine();

        if (Paths.get(numeFisier).toFile().exists()) {
            List<String> lista = Files.readAllLines(Paths.get(numeFisier));
            String continut = "";
            for (String s : lista) {
                continut += s + "\n";
            }

            String numeFisierNou = "Copy " + numeFisier;
            while (Paths.get(numeFisierNou).toFile().exists()) {
                numeFisierNou = "Copy " + numeFisierNou;
            }
            Files.write(Paths.get(numeFisierNou), continut.getBytes());

        } else {
            throw new NoSuchFileException("Acest fisier nu exista, nu putem crea o copie a lui. ");
        }
    }

}