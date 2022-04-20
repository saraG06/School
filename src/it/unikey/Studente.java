package it.unikey;

public class Studente extends Persona{

    private int matricola;

    public Studente(String name, String surname, int matricola) {
        super(name, surname);
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", matricola=" + matricola +
                '}';
    }
}
