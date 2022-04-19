package it.unikey;

import java.util.UUID;

public class Studente extends Persona{

    private UUID matricola;
    private Tutor tutor;

    public Studente(String nome, String cognome, Tutor tutor) {
        super(nome, cognome);
        this.matricola= UUID.randomUUID();
        this.tutor= tutor;
    }

    public UUID getMatricola() {
        return matricola;
    }

    public void setMatricola(UUID matricola) {
        this.matricola = matricola;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Studente{" + super.toString() +
                "matricola=" + matricola +
                "tutor=" + tutor +
                '}';
    }
}
