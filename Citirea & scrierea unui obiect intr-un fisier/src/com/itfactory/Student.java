package com.itfactory;

import java.io.Serializable;

public class Student implements Serializable {
    private String nume, prenume;
    private int nota;

    public Student() {
    }

    public Student(String nume, String prenume, int nota) {
        this.nume = nume;
        this.prenume = prenume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + "\n" +
                "Prenume: " + prenume + "\n" +
                "Nota: " + nota;
    }

}