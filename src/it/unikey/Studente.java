package it.unikey;

public class Studente extends Persona{

    private int count = 1;
    private int matricola;

    public Studente(String nome,String cognome){
        super(nome,cognome);
        this.matricola = count++;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}
