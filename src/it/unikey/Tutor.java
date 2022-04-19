package it.unikey;

import java.time.LocalDate;

public class Tutor extends Person{

    private LocalDate birth;

    public Tutor(String name, String lastname, LocalDate birth) {
        super(name, lastname);
        this.birth = birth;
    }

    public LocalDate getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return super.toString() + " " + birth;
    }

}
