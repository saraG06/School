package it.unikey.comparator;

import it.unikey.Studente;

import java.util.Comparator;

public class ComparatorCognomeStudente implements Comparator<Studente> {
    @Override
    public int compare(Studente s1, Studente s2) {
        int risultato = 0;
        risultato = (s1.getCognome()).compareTo(s2.getCognome());
        if (risultato == 0) {
            risultato = s1.getNome().compareTo(s2.getNome());
        }
        return risultato;
    }
}
