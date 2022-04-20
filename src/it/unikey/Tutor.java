package it.unikey;

import java.time.LocalDate;

public class Tutor extends Persona{

    private LocalDate dataDiNascita;

    public Tutor(String name, String surname, String data) {
        super(name, surname);
        this.dataDiNascita = LocalDate.parse(data);
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return super.toString() + " Tutor{" +
                "dataDiNascita=" + dataDiNascita +
                '}';
    }
}
