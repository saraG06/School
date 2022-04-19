package it.unikey;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Scuola {

    private Map<Tutor, ArrayList<Studente>> tutori ;
    private TreeSet<Studente> studenti ;

    public Scuola(){
        this.tutori = new TreeMap<Tutor, ArrayList<Studente>>() ;
        this.studenti = new TreeSet<>() ;
    }

    public Studente[] listaStudenti(){
        Studente[] st = this.studenti.toArray(new Studente[studenti.size()]);
        return st ;
    }

    public Tutor[] listaTutor(){
        return tutori.keySet().toArray(new Tutor[tutori.keySet().size()]);
    }

    public void addStudente(Tutor t,Studente s){
        if(!tutori.containsKey(t))
            aggiungiTutor(t);
        tutori.get(t).add(s) ;
        studenti.add(s) ;
    }

    public void aggiungiTutor(Tutor t){
        tutori.put(t,new ArrayList<Studente>()) ;
    }



}
