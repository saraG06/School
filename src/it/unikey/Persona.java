package it.unikey;

public class Persona implements Comparable<Persona>{
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome) {
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
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }

    @Override
        public int compareTo(Persona o) {
            int res;
            res = cognome.compareTo(o.getCognome());
            if (res == 0) {
                res = nome.compareTo(o.getNome());
            }
            return res;
        }

}
