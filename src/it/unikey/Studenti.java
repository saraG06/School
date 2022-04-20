package it.unikey;

public class Studenti extends Persona{

    private int matricola;

    public Studenti(String nome, String cognome, int matricola) {
        super(nome, cognome);
        this.matricola=matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "matricola=" + matricola + " cognome=" + getCognome() + " nome=" + getNome() +
                '}';
    }
}
