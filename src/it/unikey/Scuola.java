package it.unikey;

import java.time.LocalDate;
import java.util.*;

public class Scuola {

    private HashSet<Tutor> listaTutor;
    private HashSet<Studente> listaStudenti;

    public Scuola(HashSet<Tutor> listaTutor, HashSet<Studente> listaStudente) {
        this.listaTutor = listaTutor;
        this.listaStudenti = listaStudente;
    }

    public HashSet<Tutor> getListaTutor() {
        return listaTutor;
    }

    public void setListaTutor(HashSet<Tutor> listaTutor) {
        this.listaTutor = listaTutor;
    }

    public HashSet<Studente> getListaStudente() {
        return listaStudenti;
    }

    public void setListaStudente(HashSet<Studente> listaStudente) {
        this.listaStudenti = listaStudente;
    }

    public boolean login(){
        boolean log= false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Accesso menu");
        System.out.println("Username");
        String username= sc.nextLine();
        System.out.println("Password");
        String password= sc.nextLine();
        for(Tutor t: listaTutor) {
            if (t.getUsername().equals(username) && t.getPassword().equals(password)) {
                log = true;
                System.out.println("Accesso eseguito!");
            }
            if(log)
                break;
        }
        return log;
    }

    public Studente addStudente(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nome studente:");
        String nome = sc.nextLine().toLowerCase().trim();
        nome= formattaString(nome);
        System.out.println("Cognome studente:");
        String cognome = sc.nextLine().toLowerCase().trim();
        cognome= formattaString(cognome);
        System.out.println("Tutor studente:");
        String cognomeTutor= sc.nextLine().toLowerCase().trim();
        Tutor tutor= null;
        for(Tutor t: listaTutor)
            if(t.getCognome().equals(cognomeTutor))
                tutor= t;
        Studente sAdd = new Studente(nome, cognome, tutor);
        listaStudenti.add(sAdd);
        return sAdd;
    }

    public Tutor addTutor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nome tutor:");
        String nome = sc.nextLine().toLowerCase().trim();
        System.out.println("Cognome tutor:");
        String cognome = sc.nextLine().toLowerCase().trim();
        System.out.println("Data di nascita tutor (YYYYY-MM-DD):");
        LocalDate nascita = LocalDate.parse(sc.nextLine().trim());
        System.out.println("Username tutor:");
        String username = sc.nextLine().trim();
        Tutor tAdd = new Tutor(nome, cognome, nascita, username);
        listaTutor.add(tAdd);
        return tAdd;
    }

    public void listaStudentiArray(){
        ArrayList<Studente> newListaStudenti= new ArrayList<>();
        newListaStudenti.addAll(listaStudenti);
        System.out.println("Lista studenti (ArrayList): ");
        for (Studente s : listaStudenti) {
            System.out.print(newListaStudenti);
        }
    }

    public void listaTutorArray(){
        TreeSet<Tutor> newListaTutor= new TreeSet<>();
        newListaTutor.addAll(listaTutor);
        System.out.println("Lista tutor (ArrayList): ");
        for (Tutor tutor : listaTutor) {
            System.out.print(tutor.toString());
        }
    }

    public void listaStudentiTreeSet(){
        TreeSet<Studente> newListaStudenti= new TreeSet<>();
        newListaStudenti.addAll(listaStudenti);
        System.out.println("Lista studenti (TreeSet): ");
        for (Studente s : listaStudenti) {
            System.out.print(newListaStudenti);
        }
    }

    public void listaTutorTreeSet(){
        TreeSet<Tutor> newListaTutor= new TreeSet<>();
        newListaTutor.addAll(listaTutor);
        System.out.println("Lista tutor (TreeSet): ");
        for (Tutor tutor : listaTutor) {
            System.out.print(tutor.toString());
        }
    }

    public String formattaString(String parola){
        char[] lettere= parola.toCharArray();
        lettere[0]= Character.toUpperCase(lettere[0]);
        for(int i=0; i<lettere.length; i++){
            if(lettere[i]==' ')
                lettere[i+1]= Character.toUpperCase(lettere[i+1]);
        }
        parola= lettere.toString();
        return parola;
    }
}
