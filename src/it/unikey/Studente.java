package it.unikey;

public class Studente extends Persona implements Comparable<Studente>{
    private int matricola;

    public Studente(String nome, String cognome, int matricola) {
        super(nome, cognome);
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
        return "Studente [" + super.toString() +
                ", matricola: " + matricola +
                " ]" ;
    }

    @Override
    public int compareTo(Studente o) {
        int result = 0;
        result = this.getCognome().compareTo(o.getCognome());
        if(result == 0){
            result = this.getNome().compareTo(o.getNome());
        }
        return result;
    }
}
