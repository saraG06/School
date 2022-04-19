package Comparator;

import it.unikey.Studente;

import java.util.Comparator;

public class ComparatorStudenteAlfabetico implements Comparator<Studente> {

    @Override
    public int compare(Studente o1, Studente o2) {
        int result= 0;
        result= o1.getCognome().compareTo(o2.getCognome());
        if(result==0)
            result= o1.getNome().compareTo(o2.getNome());
        return result;
    }
}
