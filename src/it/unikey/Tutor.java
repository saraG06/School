package it.unikey;

import java.time.LocalDate;

public class Tutor extends Persona{

    private LocalDate nascita;
    private String username;
    private final String password= "school";

    public Tutor(String nome, String cognome, LocalDate nascita, String username) {
        super(nome, cognome);
        this.nascita= nascita;
        this.username= username;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                super.toString() +
                "nascita='" + nascita + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
