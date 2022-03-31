package com.itfactory.debug;

/* Se cere sa se creeze un program simplu in care se citesc de la tastatura doua numere de tip int si se afiseaza suma lor.
Se cere sa se faca debug pe fiecare linie pentru exercitiu (Incercati de mai multe ori folosind si F8 si F9 ca la curs). */

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti valoarea numarului a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduceti valoarea numarului b: ");
        int b = Integer.parseInt(scanner.nextLine());
        int suma = a + b;
        System.out.println("Suma numerelor a si b este: " + suma);
    }

}