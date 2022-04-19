package Comparator;

import it.unikey.Tutor;

import java.util.Comparator;

public class ComparatorTutorAlfabetico implements Comparator<Tutor> {

    @Override
    public int compare(Tutor o1, Tutor o2) {
        int result= 0;
        result= o1.getCognome().compareTo(o2.getCognome());
        if(result==0)
            result= o1.getNome().compareTo(o2.getNome());
        return result;
    }
}
