package it.unikey;

import it.unikey.comparator.ComparatorCognomeStudente;
import it.unikey.comparator.ComparatorCognomeTutor;

import java.util.Scanner;
import java.util.TreeSet;

public class Menu {

    static public boolean login() {
        System.out.println("Inserire username:");
        String username = new Scanner(System.in).nextLine();
        System.out.println("Inserire password:");
        String password = new Scanner(System.in).nextLine();


        if (username.equals(username) && password.equals(password)) {
            System.out.println();
            System.out.println("Accesso consentito,scegli una delle opzioni: ");
            System.out.println("1 - Inserisci Studente" + "\n" +
                    "2 - Inserisci Tutor" + "\n" +
                    "3 - Visualizza Studenti" + "\n" +
                    "4 - Visualizza Tutor" + "\n" +
                    "0 - Esci");
            int scelta = new Scanner(System.in).nextInt();

            scelte(scelta);
            return true;
        } else
            System.out.println("Credenziali errate!");
            return false;
    }

    public static void scelte(int scelta) {
        do {
            ComparatorCognomeStudente ccs = new ComparatorCognomeStudente();
            TreeSet<Studente> studenti = new TreeSet<Studente>(ccs);

            ComparatorCognomeTutor cct = new ComparatorCognomeTutor();
            TreeSet<Tutor> tutor = new TreeSet<Tutor>(cct);

            scelta = new Scanner(System.in).nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    return;
                case 1:
                    studenti.add(Studente.inserisciStudente());
                    break;
                case 2:
                    tutor.add(Tutor.inserisciTutor());
                    break;
                case 3:
                    Tutor.visualizzaTutor();
                    break;
                case 4:
                    Studente.visualizzaStudente();
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.err.println("Inserire un valore valido!");
            }
        } while (scelta != 0);
    }
}

