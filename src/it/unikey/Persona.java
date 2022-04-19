package it.unikey;

public class Persona implements Comparable<Persona>{
    protected String nome;
    protected String cognome;

    public Persona(String nome,String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public int compareTo(Persona o) {
        int result = this.cognome.compareTo(o.cognome);
        if(result==0)
            result = this.nome.compareTo(o.nome);

        return result;
    }
}
