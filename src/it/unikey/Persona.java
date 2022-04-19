package it.unikey;

import java.util.Locale;
import java.util.Objects;

public abstract class Persona implements Comparable<Persona> {

    String nome ;
    String cognome ;

    public Persona(String nome,String cognome){
        this.nome = formatta(nome) ;
        this.cognome = formatta(cognome) ;
    }

    private String formatta(String s){
        return s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()) ;
    }

    @Override
    public int compareTo(Persona o) {
        if(this.equals(o)) return 0 ;
        int res = this.cognome.compareTo(o.getCognome()) ;
        if(res ==0) res= this.nome.compareTo(o.getNome()) ;
        return res ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return this.nome.equals(persona.nome) && this.cognome.equals(persona.cognome);
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
        return
                "nome='" + nome +
                ", cognome='" + cognome ;
    }
}
