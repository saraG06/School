package it.unikey;



import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Scuola {
    static TreeSet<Tutor> tutorsSet;
    static TreeSet<Studente> studentiSet;


    public Scuola(){
        this.tutorsSet = new TreeSet<>();
        this.studentiSet = new TreeSet<>();
    }


    public static void insersciStudente(Studente s){
        studentiSet.add(s);
    }

    public static void inserisciTutor(Tutor t){
        tutorsSet.add(t);
    }

    public static void visualizzaStudenti(){
        Object[] studentiArray = studentiSet.toArray();
        Arrays.sort(studentiArray);
        for(Object s : studentiArray)
            System.out.println(s);
    }

    public static void visualizzaTutors(){
        Object[] tutorsArray = tutorsSet.toArray();
        Arrays.sort(tutorsArray);
        for(Object t : tutorsArray){
            System.out.println(t);
        }
    }
}
