package com.itfactory;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ServiciiCitireTest {

    private String word1;
    private String word2;
    private String word3;
    private String fileName1;
    private String fileName2;

    @Before
    public void init() {
        word1 = "Atlas";
        word2 = "Mediterranean";
        word3 = "Java";
        fileName1 = "myFile.txt";
        fileName2 = "myFiles.txt";
    }

    @Test
    public void checkIfEmptyFileTest() {
        try {
            assertFalse(ServiciiCitire.checkIfEmptyFile(fileName1));
            assertTrue(ServiciiCitire.checkIfEmptyFile(fileName2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void containsSpecificWordTest() {
        try {
            assertTrue(ServiciiCitire.containsSpecificWord(fileName1, word1));
            assertFalse(ServiciiCitire.containsSpecificWord(fileName1, word3));
            assertFalse(ServiciiCitire.containsSpecificWord(fileName2, word2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
