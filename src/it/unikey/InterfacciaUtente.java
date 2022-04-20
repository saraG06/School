package it.unikey;


import java.util.Scanner;

public class InterfacciaUtente {
    private static String username = "username";
    private static String password = "password";


    public static boolean accedi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci Username");
        String user = sc.nextLine();
        System.out.println("Inserisci Passwoird");
        String pass = sc.nextLine();
        if(user.equals(username) && pass.equals(password)){
            System.out.println("Bentornato!");
            return true;
        }
        else{
            System.out.println("Email o Password Errati");
            return false;
        }
    }

    public static void menu() {
        int opzione;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Scegli un opzione:");
            System.out.println("1 - Inserisci Studente");
            System.out.println("2 - Iserisci Tutor");
            System.out.println("3 - Visualizza Studenti");
            System.out.println("4 - Visualizza Tutors");
            System.out.println("0 - Esci");
            opzione = sc.nextInt();
            sc.nextLine();
            switch (opzione) {
                case 1:
                    System.out.println("Nome Stduente:");
                    String name = sc.nextLine();
                    System.out.println("Cognome Studente:");
                    String lastName = sc.nextLine();
                    System.out.println("Matricola Studente:");
                    int matrix = sc.nextInt();
                    Scuola.insersciStudente(new Studente(name, lastName, matrix));
                    break;
                case 2:
                    System.out.println("Nome Tutor:");
                    String nameTutor = sc.nextLine();
                    System.out.println("Cognome Tutor:");
                    String lastNameTutor = sc.nextLine();
                    System.out.println("Anno nascita Tutor:");
                    int year = sc.nextInt();
                    System.out.println("Mese nascita Tutor:");
                    int month = sc.nextInt();
                    System.out.println("Giorno nascita Tutor:");
                    int day = sc.nextInt();
                    Scuola.inserisciTutor(new Tutor(nameTutor, lastNameTutor, year, month, day));
                    break;
                case 3:
                    Scuola.visualizzaStudenti();
                    break;
                case 4:
                    Scuola.visualizzaTutors();
                    break;
            }

        } while (opzione != 0);

    }

    public static void programma(){
        if(accedi()){
            menu();
        }
    }

}
