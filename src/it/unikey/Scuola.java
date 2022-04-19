package it.unikey;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Scuola {
    private TreeSet<Persona> utenti;
    private TreeMap<String, ArrayList<String>> assegnazioneTutor;
    private ArrayList<String> studenti;

    public Scuola(){
        this.utenti = new TreeSet<>();
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
        utentiOrdinati = this.utenti;
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
                listaStudenti.add(o);
        }
        return listaStudenti;
    }

    public void assegnaTutor(String tutor, String studente){
        this.studenti.add(studente);
        this.assegnazioneTutor.put(tutor,studenti);
    }
}
