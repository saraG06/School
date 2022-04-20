package it.unikey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Scuola {
    private TreeSet<Persona> utenti;
    private TreeMap<Tutor, ArrayList<Studente>> assegnazioneTutor;
    private ArrayList<Studente> studenti;

    public Scuola(){
        this.utenti = new TreeSet<>();
        this.studenti = new ArrayList<>();
        this.assegnazioneTutor = new TreeMap<>();
    }

    public void addUtente(Persona p){
        this.utenti.add(p);
    }

    public Object[] getArrayUtentiCrescente(){   // cognome crescente
        Object[] resultSet = this.utenti.toArray();
       return resultSet;
    }


    public TreeSet<Persona> getArrayUtenti(Comparator<Persona> T){ //overload per scegliere l'ordinamento
        TreeSet<Persona> utentiOrdinati = new TreeSet<>(T);
        for(Persona p : this.utenti){
            utentiOrdinati.add(p);
        }
        return utentiOrdinati;
    }

    public TreeSet<Persona> getUtenti() {
        return utenti;
    }

    public void setUtenti(TreeSet<Persona> utenti) {
        this.utenti = utenti;
    }

    public ArrayList<Object> getTutorList(){
        Object[] lista = getArrayUtentiCrescente();
        ArrayList<Object> listaTutor = new ArrayList<>();
        for(Object o : lista){
            if(o instanceof Tutor)
                listaTutor.add(((Tutor) o).cognome);
        }
        return listaTutor;
    }

    public ArrayList<Object> getStudentList(){
        Object[] lista = getArrayUtentiCrescente();
        ArrayList<Object> listaStudenti = new ArrayList<>();
        for(Object o : lista){
            if(o instanceof Studente)
                listaStudenti.add(((Studente) o).cognome);
        }
        return listaStudenti;
    }

    public void assegnaTutor(Tutor t, Studente s){
        this.studenti.add(s);
        this.assegnazioneTutor.put(t,studenti);
    }

    public Tutor getSpecificTutor(String cognome){
        Object[] arrayUtenti = this.utenti.toArray();
        Tutor tutor = null;

        for (Object p : arrayUtenti){
            if(p instanceof Tutor && ((Tutor) p).getCognome().equalsIgnoreCase(cognome))
                tutor = (Tutor) p;
        }
        return tutor;
    }

    public Studente getSpecificStudent(String cognome){
        Object[] arrayUtenti = this.utenti.toArray();
        Studente studente = null;

        for (Object p : arrayUtenti){
            if(p instanceof Studente && ((Studente) p).getCognome().equalsIgnoreCase(cognome))
                studente = (Studente) p;
        }
        return studente;
    }

    public TreeMap<Tutor, ArrayList<Studente>> getAssegnazioneTutor() {
        return assegnazioneTutor;
    }
}
