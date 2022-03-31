package com.itfactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> scrieInfoStudenti = new ArrayList<>();
        List<Student> citesteInfoStudenti = new ArrayList<>();

        scrieInfoStudenti.add(new Student("Popescu", "Ionut", 10));
        scrieInfoStudenti.add(new Student("Georgescu", "Marian", 9));
        scrieInfoStudenti.add(new Student("Ionescu", "George", 7));
        scrieInfoStudenti.add(new Student("Marinescu", "Ovidiu", 7));

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.txt", true));
            for (Student student : scrieInfoStudenti) {
                out.writeObject(student);
            }
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Student.txt"));
            for (int i = 0; i < scrieInfoStudenti.size(); i++) {
                Student student = (Student) in.readObject();
                citesteInfoStudenti.add(student);
            }
            in.close();

            for (Student student : citesteInfoStudenti) {
                System.out.println(student + "\n");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}