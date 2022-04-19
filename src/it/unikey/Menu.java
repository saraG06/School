package it.unikey;

import it.unikey.comparator.ComparatorCognomeStudente;
import it.unikey.comparator.ComparatorCognomeTutor;

import java.util.Scanner;
import java.util.TreeSet;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public boolean login() {
        System.out.println("Inserire username:");
        String username = sc.nextLine();
        System.out.println("Inserire password:");
        String password = sc.nextLine();

        if (username.equals(username) && password.equals(password)) {
            return true;
        } else
            return false;
    }

    public void scelte() {
        int scelta;
        do {
            System.out.println();
            System.out.println("1 - Inserisci Studente" + "\n" +
                    "2 - Inserisci Tutor" + "\n" +
                    "3 - Visualizza Studenti" + "\n" +
                    "4 - Visualizza Tutor" + "\n" +
                    "0 - Esci");
            int number = sc.nextInt();

            scelta = new Scanner(System.in).nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    return;
                case 1:
                    System.out.println("Inserisci nome,cognome e matricola:");
                    ComparatorCognomeStudente ccs = new ComparatorCognomeStudente();
                    TreeSet<Studente> studenti = new TreeSet<Studente>(ccs);
                    studenti.add(Studente.inserisciStudente());
                    break;
                case 2:
                    System.out.println("Inserisci nome,cognome e data di nascita:");
                    ComparatorCognomeTutor cct = new ComparatorCognomeTutor();
                    TreeSet<Tutor> tutor = new TreeSet<Tutor>(cct);
                    tutor.add(Tutor.inserisciTutor());
                    break;
                case 3:
                    System.out.println("Inserisi credenziali tutor:");

                    break;
                case 4:
                    System.out.println("Inserisci credenziali studente:");

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

