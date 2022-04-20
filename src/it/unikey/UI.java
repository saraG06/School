package it.unikey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class UI {
    TreeSet<Studente> studenti = new TreeSet<>();
    TreeSet<Tutor> tutor = new TreeSet<>();
    Map<Tutor, ArrayList<Studente>> mapTutor = new TreeMap<>();

    public void addStudent(Tutor t, String nome, String cognome, int matricola){
        nome.toLowerCase();
        cognome.toLowerCase();

        String temp = nome.substring(0, 1).toUpperCase();
        nome = temp + nome.substring(1);

        String temp2 = cognome.substring(0, 1).toUpperCase();
        cognome = temp2 + cognome.substring(1);

        Studente s = new Studente(nome, cognome, matricola);
        studenti.add(s);

        if(!mapTutor.containsKey(t)){
            mapTutor.put(t, new ArrayList<Studente>());
        }
        mapTutor.get(t).add(s);

    }

    public void addTutor(String name, String surname, String data){
            String nome = name.toLowerCase();
            String cognome = surname.toLowerCase();
            String temp = nome.substring(0, 1).toUpperCase();
            String nomeMaiuscolo = temp + nome.substring(1);
            String temp2 = cognome.substring(0, 1).toUpperCase();
            String cognomeMaiuscolo= temp2 + cognome.substring(1);
            Tutor t = new Tutor(nomeMaiuscolo, cognomeMaiuscolo, data);
            tutor.add(t);
    }

    public void showStudents(){
        System.out.println(mapTutor);
    }
    public void showTutors(){
        Object[] array = tutor.toArray();
        int count = 1;

        System.out.println("Tutor:");
        for(Object a : array){
            System.out.println(count + " " + a);
            count++;
        }
    }
    public Tutor getTutor(int x){
        Object[] array = tutor.toArray();
        return (Tutor) Array.get(array, x-1);
    }
}
