package comparator;

import scuola.Student;
import java.util.Comparator;

public class ComparatorOrdineAlfabetico implements Comparator<Student> {

    public ComparatorOrdineAlfabetico() {
    }

    @Override
    public int compare(Student o1, Student o2) {
        int risultato = 0;
        risultato = o1.getCognome().compareTo(o2.getCognome());
        if (risultato == 0) {
            risultato = o1.getNome().compareTo(o2.getNome());
        }

        return risultato;
    }
}
