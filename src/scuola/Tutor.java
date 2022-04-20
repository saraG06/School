package scuola;

import scuola.Person;

import java.time.LocalDate;

public class Tutor extends Person {

    private LocalDate dataNascita;

    public Tutor(String nome, String cognome, LocalDate dataNascita) {
        super(nome, cognome);
        this.dataNascita = dataNascita;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
