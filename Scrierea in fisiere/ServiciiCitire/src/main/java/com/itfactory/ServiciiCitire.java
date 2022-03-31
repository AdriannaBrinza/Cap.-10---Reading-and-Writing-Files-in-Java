package com.itfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServiciiCitire {

    public static boolean checkIfEmptyFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        String line;
        int contor = 0;
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        while ((line = bufferedReader.readLine()) != null) {
            if (!line.isEmpty()) {
                contor += 1;
            }
        }
        if (contor == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containsSpecificWord(String fileName, String word) throws IOException {
        Path path = Paths.get(fileName);
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if(line.contains(word)){
                return true;
            }
        }
        return false;
    }
}