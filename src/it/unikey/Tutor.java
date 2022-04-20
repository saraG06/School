package it.unikey;

import java.time.LocalDate;

public class Tutor extends Persona implements Comparable<Tutor>{
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
        return "Tutor [" + super.toString() +
                ", data di nascita: " + dataNascita +
                " ]" ;
    }

    @Override
    public int compareTo(Tutor o) {
        int result = 0;
        result = this.getCognome().compareTo(o.getCognome());
        if(result == 0){
            result = this.getNome().compareTo(o.getNome());
        }
        return result;
    }
}
