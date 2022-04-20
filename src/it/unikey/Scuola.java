package it.unikey;



import it.unikey.Comparators.StudenteBySurnameComparator;

import java.util.*;

public class Scuola {

    private Studenti studente;
    private Tutor tutor;
    private static List<Studenti> listaStudenti;
    private static List<Tutor> listaTutor;
    private static Map<Tutor, Set<Studenti>> scuola;
    static StudenteBySurnameComparator sbs = new StudenteBySurnameComparator();

    public Scuola() {
        this.listaStudenti = new ArrayList<>();
        this.listaTutor = new ArrayList<>();
        this.scuola = new HashMap<>();
    }

    public Studenti getStudente() {
        return studente;
    }

    public void setStudente(Studenti studente) {
        this.studente = studente;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public static void inserisciStudente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome dello studente da aggiungere");
        String nome = sc.nextLine();
        System.out.println("Inserisci il cognome dello studente da aggiungere");
        String cognome = sc.nextLine();
        System.out.println("Inserisci la matricola dello studente da aggiungere");
        int matrice = sc.nextInt();

        Studenti studente = new Studenti(nome, cognome, matrice);

        listaStudenti.add(studente);

        System.out.println("Studente inserito");
    }

    public static void stampaStudenti(){
        Studenti[] arrayStudenti = listaStudenti.toArray(new Studenti[0]);

        for (Studenti s : listaStudenti) {
            for (int i = 0; i < arrayStudenti.length; i++) {
                if (arrayStudenti[i] == null)
                arrayStudenti[i] = s;
            }
        }
        Arrays.sort(arrayStudenti, sbs);
        for (Studenti s:arrayStudenti) {
            System.out.println(s.toString());
        }
    }

    public static void inserisciTutor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome del tutor da aggiungere");
        String nome = sc.nextLine();
        System.out.println("Inserisci il cognome del tutor da aggiungere");
        String cognome = sc.nextLine();
        System.out.println("Inserisci l'anno di nascita del tutor da aggiungere");
        int anno = sc.nextInt();
        sc.nextLine();
        System.out.println("Inserisci il mese di nascita del tutor da aggiungere");
        int mese = sc.nextInt();
        sc.nextLine();
        System.out.println("Inserisci il giorno di nascita del tutor da aggiungere");
        int giorno = sc.nextInt();


        Tutor tutor = new Tutor(nome, cognome, anno, mese, giorno);

        listaTutor.add(tutor);

        System.out.println("Tutor inserito");
    }

    public static void stampaTutor(){
        for (Tutor t : listaTutor) {
            System.out.println(t.toString());
        }
    }

    public static void associaStudentiATutor(){

        Set<Studenti> setStudenti = new HashSet<>();
        for (Studenti s: listaStudenti) {
            setStudenti.add(s);
        }

        scuola.put(listaTutor.get(0), setStudenti);

        System.out.println(scuola);
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "listaStudenti=" + listaStudenti +
                ", scuola=" + scuola;
    }
}
