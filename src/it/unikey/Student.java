package it.unikey;

import java.util.UUID;

public class Student extends Person{

    private final UUID matricola;


    public Student(String name, String surname, String matricola) {
        super(name, surname);
        this.matricola = UUID.randomUUID();
    }

    public UUID getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return super.toString() + "matricola = " + getMatricola();
    }
}
