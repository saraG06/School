package it.unikey;

import java.util.HashSet;
import java.util.Scanner;

public class Studente {

    public Studente(String nome, String cognome, String matricola, String username, String password){
      this.nome = nome;
      this.cognome = cognome;
        this.username = username;
        this.password = password;
    }

    public static String username;
    public static String password;
    static public String nome;
    static public String cognome;
    static public String matricola;


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }


    static HashSet<Studente> nomistudente = new HashSet<Studente>();
    public static Studente inserisciStudente() {
        System.out.println("Inserire il nome dello studente: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Inserire il cognome dello studente: ");
        String cognome = new Scanner(System.in).nextLine();
        System.out.println("Inserire la matricola dello studente: ");
        String matricola = new Scanner(System.in).nextLine();
        System.out.println("Inserire l'username dello studente: ");
        String usernamest = new Scanner(System.in).nextLine();
        System.out.println("Inserire la password dello studente: ");
        String passwordst = new Scanner(System.in).nextLine();
        Studente s = new Studente(nome,cognome,matricola,usernamest,passwordst);
        nomistudente.add(s);
        return s;
    }

    public static Studente visualizzaStudente(){
        System.out.println("Inserire username studente: ");
        String usernamest = new Scanner(System.in).nextLine();
        System.out.println("Inserire password studente: ");
        String passwordst = new Scanner(System.in).nextLine();
        Studente s1 = new Studente(nome,cognome,matricola,usernamest,passwordst);
        if(usernamest.equals(s1.username) && passwordst.equals(s1.password)){
            System.out.println(nome);
            System.out.println(cognome);
        }
        return s1;
    }


    @Override
    public String toString() {
        return "Il nome dello studente è: " + nome + "\n" + "Il cognome è: " + cognome;
    }
}
