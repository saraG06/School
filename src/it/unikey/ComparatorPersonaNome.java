package it.unikey;

import java.util.Comparator;

public class ComparatorPersonaNome implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int result = o1.nome.compareTo(o2.nome);
        if (result==0)
            result = o1.cognome.compareTo(o2.cognome);
        return result;
    }
}
