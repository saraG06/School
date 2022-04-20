package it.unikey;

public class Studente extends Persona{

    private int matricola = 0;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
}
