package comparator;

import scuola.Tutor;
import java.util.Comparator;

public class ComparatorOrdineAlfabeticoTutor implements Comparator<Tutor> {

    public ComparatorOrdineAlfabeticoTutor() {
    }

    @Override
    public int compare(Tutor o1, Tutor o2) {
        int risultato = 0;
        risultato = o1.getCognome().compareTo(o2.getCognome());
        if (risultato == 0) {
            risultato = o1.getNome().compareTo(o2.getNome());
        }

        return risultato;
    }

}