package it.unikey;

import java.time.LocalDate;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return tutor.getName().equals(this.getName()) && tutor.getLastname().equals(this.getLastname()) && tutor.getBirth().equals(this.getBirth());
    }

}
