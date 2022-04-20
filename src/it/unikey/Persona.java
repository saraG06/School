package it.unikey;

abstract public class Persona {
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome){
        setNome(nome);
        setCognome(cognome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.substring(0,1).toUpperCase().concat(nome.substring(1).toLowerCase());
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome.substring(0,1).toUpperCase().concat(cognome.substring(1).toLowerCase());
    }

    @Override
    public String toString() {
        return "nome: " + nome +
                ", cognome: " + cognome;
    }
}
