package it.unikey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyThread extends Thread {

    public void run(){
        boolean exit = true;
        Scanner s1 = new Scanner(System.in);
        Program p = new Program();
        p.addTutor("Andrew", "Peppi", "1995-05-04");
        p.addTutor("Matt", "Fasc", "1990-07-09");



        try {
            do {
                System.out.println("1 - Inserisci Studente\n" +
                        "2 - Inserisci Tutor\n" +
                        "3 - Visualizza Studenti\n" +
                        "4 - Visualizza Tutor\n" +
                        "0 - Esci");
                s1 = new Scanner(System.in);
                switch (s1.nextInt()) {
                    case 0:
                        System.out.println("Arrivederci!");
                        exit = true;
                        return;
                    case 1:
                        s1 = new Scanner(System.in);
                        System.out.println("Inserisci il nome:");
                        String nome = s1.nextLine();
                        System.out.println("Inserisci il cognome:");
                        String cognome = s1.nextLine();
                        System.out.println("Scegli il tutor:");
                        p.showTutors();
                        s1 = new Scanner(System.in);
                        p.addStudent(p.getTutor(s1.nextInt()), nome, cognome);
                        break;
                    case 2:
                        s1 = new Scanner(System.in);
                        System.out.println("Inserisci il nome:");
                        String nomeTutor = s1.nextLine();
                        System.out.println("Inserisci il cognome:");
                        String cognomeTutor = s1.nextLine();
                        System.out.println("Inserisci la data di nascita (yyyy-mm-dd)");
                        String date = s1.nextLine();
                        p.addTutor(nomeTutor, cognomeTutor, date);
                        break;
                    case 3:
                        p.showStudents();
                        break;
                    case 4:
                        p.showTutors();
                        break;
                    default:
                        break;

                }
            }
            while (exit);
        } catch (InputMismatchException e) {
            System.out.println("Inserire un numero!");
        }
    }
}
