package it.unikey;

import java.time.LocalDate;

public class Tutor extends Persona{

    private LocalDate dataNascita;

    public Tutor(String nome,String cognome,LocalDate dataNascita){
        super(nome,cognome);
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
