package it.unikey;

import javax.swing.*;
import java.io.Console;
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
        String password;
        final String message= "Enter password";
        if(System.console()==null){
            final JPasswordField pf= new JPasswordField();
            pf.getPassword();
            pf.setEchoChar('*');
            password= JOptionPane.showConfirmDialog(null, pf, message, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE ) == JOptionPane.OK_OPTION ? new String(pf.getPassword() ) : "";
        } else {
            password= new String(System.console().readPassword("%s> ", message));
        }
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

    public void addStudente(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nome studente:");
        String nome = sc.nextLine().toLowerCase().trim();
        nome= formattaString(nome);
        System.out.println("Cognome studente:");
        String cognome = sc.nextLine().toLowerCase().trim();
        cognome= formattaString(cognome);
        System.out.println("Cognome tutor studente:");
        String cognomeTutor= sc.nextLine().toLowerCase().trim();
        nome= formattaString(nome);
        cognome= formattaString(cognome);
        cognomeTutor= formattaString(cognomeTutor);
        Tutor tutor= null;
        for(Tutor t: listaTutor)
            if(t.getCognome().equals(cognomeTutor))
                tutor= t;
        Studente sAdd = new Studente(nome, cognome, tutor);
        listaStudenti.add(sAdd);
        System.out.println("Studente "+nome+" "+cognome+" aggiunto");
    }

    public void addTutor(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nome tutor:");
        String nome = sc.nextLine().toLowerCase().trim();
        System.out.println("Cognome tutor:");
        String cognome = sc.nextLine().toLowerCase().trim();
        System.out.println("Data di nascita tutor (YYYY-MM-DD):");
        LocalDate nascita = LocalDate.parse(sc.nextLine().trim());
        System.out.println("Username tutor:");
        String username = sc.nextLine().trim();
        nome= formattaString(nome);
        cognome= formattaString(cognome);
        Tutor tAdd = new Tutor(nome, cognome, nascita, username);
        listaTutor.add(tAdd);
        System.out.println("Tutor "+nome+" "+cognome+" aggiunto");
    }

    public void listaStudentiArray(){
        ArrayList<Studente> newListaStudenti= new ArrayList<>();
        newListaStudenti.addAll(listaStudenti);
        System.out.println("Lista studenti (ArrayList): ");
        System.out.print(newListaStudenti);
    }

    public void listaTutorArray(){
        ArrayList<Tutor> newListaTutor= new ArrayList<>();
        newListaTutor.addAll(listaTutor);
        System.out.println("Lista tutor (ArrayList): ");
        System.out.print(newListaTutor);
    }

    public void listaStudentiTreeSet(){
        TreeSet<Studente> newListaStudenti= new TreeSet<>();
        for(Studente x: listaStudenti)
            newListaStudenti.add(x);
        System.out.println("Lista studenti (TreeSet): ");
        System.out.print(newListaStudenti);
    }

    public void listaTutorTreeSet(){
        TreeSet<Tutor> newListaTutor= new TreeSet<>();
        newListaTutor.addAll(listaTutor);
        System.out.println("Lista tutor (TreeSet): ");
        System.out.print(newListaTutor);
    }

    public String formattaString(String parola){
        parola = parola.toLowerCase();
        String temp = parola.substring(0, 1).toUpperCase();
        String nomeMaiuscolo = temp + parola.substring(1);
        return nomeMaiuscolo;
    }
}
