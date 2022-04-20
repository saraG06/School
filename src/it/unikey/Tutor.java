package it.unikey;

import java.time.LocalDate;

public class Tutor extends Person{

    private LocalDate date;

    public Tutor(String name, String surname, String date) {
        super(name, surname);
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + "date = " + date;
    }
}
