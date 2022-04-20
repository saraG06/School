package scuola;

import javax.swing.*;
import java.util.Scanner;

public class Menu {
    String username = "username";
    String password = "password";
    Scanner sc = new Scanner(System.in);
    Scuola scuola = new Scuola();

    public static String maskPassword(String password) {
        int lengthOfPassword = password.length();
        StringBuilder stringBuilder = new StringBuilder(lengthOfPassword);

        for (int i = 0; i < lengthOfPassword; i++) {
            stringBuilder.append('*');
        }

        return stringBuilder.toString();
    }

    public boolean login() {
        System.out.println("Inserire username:");
        String usIns = sc.nextLine();
        System.out.println("Inserire password:");
        String passIns = sc.nextLine();

        if (usIns.equals(username) && passIns.equals(password)) {
            return true;
        } else
            return false;
    }

    public void menu() {
        int scelta;
        do {

            System.out.println("1 - Inserisci Studente\n" +
                    "2 - Inserisci Tutor\n" +
                    "3 - Visualizza Studenti\n" +
                    "4 - Visualizza Tutor\n" +
                    "0 - Esci");

            scelta = new Scanner(System.in).nextInt();
            switch (scelta) {
                case 0:
                    break;
                case 1:
                    scuola.aggiungiStudente();
                    break;
                case 2:
                    scuola.aggiungiTutor();
                    break;
                case 3:
                    scuola.visualizzaStudentiAlfabetico();
                    break;
                case 4:
                    scuola.visualizzaTutorAlfabetico();
                    break;
            }
        } while (scelta != 0);
    }



}




