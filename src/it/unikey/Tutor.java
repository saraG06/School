package it.unikey;

import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class Tutor {

    Scanner sc1 = new Scanner(System.in);

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static String username = "Chiara2001";
    public static String password = "1234";
    static public String nome;
    static public String cognome;
    static public DateTimeFormatter dataNascita;

    public Tutor(String nome, String cognome, String username, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    static HashSet<Tutor> nomitutor = new HashSet<Tutor>();

    public static Tutor inserisciTutor() {
        System.out.println("Inserire il nome del tutor: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Inserire il cognome del tutor: ");
        String cognome = new Scanner(System.in).nextLine();
        System.out.println("Inserire la data di nascita del tutor: ");

        System.out.println("Inserire l'username del tutor: ");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Inserire la password del tutor: ");
        String password = new Scanner(System.in).nextLine();
        Tutor t = new Tutor(nome, cognome,username,password);
        nomitutor.add(t);
        return t;
    }

    public static Tutor visualizzaTutor(){
        System.out.println("Inserire username tutor: ");
        String usernametutor = new Scanner(System.in).nextLine();
        System.out.println("Inserire password tutor: ");
        String passwordtutor = new Scanner(System.in).nextLine();
        Tutor t1 = new Tutor(nome,cognome,username,password);
        if(usernametutor.equals(t1.username) && passwordtutor.equals(t1.password)){
            System.out.println(nome);
            System.out.println(cognome);
        }
        return t1;
    }

    @Override
    public String toString() {
        return "Il nome del tutor è: " + nome + "\n" + "Il cognome è: " + cognome + "\n" + "Nato il: " + dataNascita;
    }
}
