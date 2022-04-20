package it.unikey;

import java.time.LocalDate;

public class Tutor extends Persona{

    private LocalDate dataNascita;

    public Tutor(String nome, String cognome, int anno, int mese, int giorno) {
        super(nome, cognome);
        this.dataNascita = LocalDate.of(anno, mese, giorno);
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "dataNascita=" + dataNascita + " cognome=" + getCognome() + " nome=" + getNome() +
                '}';
    }
}
