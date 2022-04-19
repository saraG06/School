package it.unikey;

public class Studente extends Persona{

    private static int count = 10 ;
    private Integer matricola ;

    public Studente(String nome, String cognome) {
        super(nome, cognome);
        matricola = count++ ;
    }

    public Integer getMatricola() {
        return matricola;
    }

    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return
                "matricola=" + matricola + " "+super.toString();
    }
}
