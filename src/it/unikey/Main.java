package it.unikey;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static boolean checkTrue(boolean condition){
        if (condition==true)
            return false;
        else
            return true;
    }

    public static void init(){
        String id;
        String pass;
        do {
            System.out.println("Inserisci ID:");
            id = new Scanner(System.in).next();
            System.out.println("Inserisci Password:");
            pass = new Scanner(System.in).next();

            if(checkTrue(id.equalsIgnoreCase("Leonardo") && pass.equals("123456")))
                System.out.println("Dati inseriti non validi!\n");



        }while (checkTrue(id.equalsIgnoreCase("Leonardo") && pass.equals("123456")));

        System.out.println("Login effettuato!");
    }

    public static boolean start(Scuola s){
        String input;
        String nome;
        String cognome;
        int anno;
        int mese;
        int giorno;

        System.out.println("Vuoi inserire un Tutor, uno Studente o Niente?[T-S-N]");

        do {
            input = new Scanner(System.in).next().toUpperCase();
        }while (checkTrue(input.equalsIgnoreCase("T") || input.equalsIgnoreCase("S") || input.equalsIgnoreCase("N")));

        switch(input){
            case "T":
                System.out.println("Inserisci nome:");
                nome = new Scanner(System.in).next();
                System.out.println("Inserisci cognome:");
                cognome = new Scanner(System.in).next();
                System.out.println("Inserisci anno di nascita:");
                anno = new Scanner(System.in).nextInt();
                System.out.println("Inserisci mese di nascita:");
                mese = new Scanner(System.in).nextInt();
                System.out.println("Inserisci giorno di nascita:");
                giorno = new Scanner(System.in).nextInt();

                s.addUtente(new Tutor(nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase(),cognome.substring(0,1).toUpperCase()+cognome.substring(1).toLowerCase(),LocalDate.of(anno,mese,giorno)));
                return true;
            case "S":
                System.out.println("Inserisci nome:");
                nome = new Scanner(System.in).next();
                System.out.println("Inserisci cognome:");
                cognome = new Scanner(System.in).next();

                s.addUtente(new Studente(nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase(),cognome.substring(0,1).toUpperCase()+cognome.substring(1).toLowerCase()));
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scuola s = new Scuola();
        ComparatorPersonaNome cpn = new ComparatorPersonaNome();
        boolean b;
        Main.init();
        do {
            b = Main.start(s);
            /*for(Object p : s.getArrayUtentiCrescente()){
                System.out.println(p);
            }*/
            System.out.println(s.getArrayUtenti(cpn));
        }while (b);

        String input;
        String tutor;
        String studente;
        do{
            System.out.println("Vuoi assegnare un Tutor ad uno studente?[Y-N]");
            do {
                input = new Scanner(System.in).next();
            }while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"));

            if(input.equalsIgnoreCase("Y")){
                System.out.println("Scegli il Tutor dalla lista seguente:");
                System.out.println(s.getTutorList());
                tutor = new Scanner(System.in).next();

                System.out.println("Scegli lo studente dalla lista seguente:");
                System.out.println(s.getStudentList());
                studente = new Scanner(System.in).next();

                s.assegnaTutor(tutor.substring(0,1).toUpperCase()+tutor.substring(1).toLowerCase(),studente.substring(0,1).toUpperCase()+studente.substring(1).toLowerCase());

                b = true;
            } else {
                b = false;
            }
        }while (b);

        System.out.println("Programma Terminato!");


    }
}
