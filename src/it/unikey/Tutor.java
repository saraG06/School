package it.unikey;

import java.time.LocalDate;
import java.util.Objects;

public class Tutor extends Persona{

    private LocalDate dataNascita ;

    public Tutor(String nome, String cognome,String dataNascita) {
        super(nome, cognome);
        this.dataNascita = LocalDate.parse(dataNascita) ;
    }


    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return
                "data di nascita =" + dataNascita + " "+super.toString();
    }
}
