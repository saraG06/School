package it.unikey;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	Scuola scuola = new Scuola();
    Studente s1 = new Studente("Leonardo", "Prearo", 666);
    Studente s2 = new Studente("Martina", "Bovarona", 551);
    Studente s3 = new Studente("Matteo", "Giovanale", 111);
    Studente s4 = new Studente("Chiara", "Tortoronona", 333);
    Tutor t1 = new Tutor("Gabriele", "MarabittiI", 1994, 07, 07);
    Tutor t2 = new Tutor("Leonardo", "Paolini", 1889, 12, 18);
    Tutor t3 = new Tutor("Giovanna", "Esposito", 1965, 10,11);

        ArrayList<Studente> listaStudenti1 = new ArrayList<>();
        ArrayList<Studente> listaStudenti2 = new ArrayList<>();
        listaStudenti1.add(s1);
        listaStudenti1.add(s2);
        listaStudenti2.add(s3);
        listaStudenti2.add(s4);

        HashMap<Tutor, ArrayList<Studente>> studentiETutor = new HashMap<>();
        studentiETutor.put(t1,listaStudenti1);
        studentiETutor.put(t2,listaStudenti2);

    //InterfacciaUtente.accedi();
        InterfacciaUtente.programma();

    }
}
