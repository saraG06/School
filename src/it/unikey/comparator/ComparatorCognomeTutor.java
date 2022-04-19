package it.unikey.comparator;

import it.unikey.Tutor;

import java.util.Comparator;

public class ComparatorCognomeTutor implements Comparator<Tutor> {
        @Override
        public int compare(Tutor t1, Tutor t2) {
            int risultato = 0;
            risultato = (t1.getCognome()).compareTo(t2.getCognome());
            if (risultato == 0) {
                risultato = t1.getNome().compareTo(t2.getNome());
            }
            return risultato;
        }
    }

