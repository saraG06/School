package scuola;

import scuola.Person;

public class Student extends Person {

    private int matricola;
    private static int count = 0;

    public Student(String nome, String cognome) {
        super(nome, cognome);
        this.matricola = count++;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
