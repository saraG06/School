package it.unikey.Comparators;

import it.unikey.Studenti;

import java.util.Comparator;

public class StudenteBySurnameComparator implements Comparator<Studenti> {


    @Override
    public int compare(Studenti o1, Studenti o2) {
        int result = 0;
        result = o1.getCognome().compareTo(o2.getCognome());
        if (result==0){
            result = o1.getNome().compareTo(o2.getNome());
        }
        return result;
    }
}
