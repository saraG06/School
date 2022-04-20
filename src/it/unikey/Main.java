package it.unikey;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                final String user = "abcd";
                final String password = "1234";
                boolean yesno = true;
                Scanner sc1 = new Scanner(System.in);
                UI n1 = new UI();
                n1.addTutor("Franco", "Pallina", "1985-03-02");
                n1.addTutor("Pippo", "Baudo", "1981-10-24");


                System.out.println("Inserire nome utente:");
                String input1 = sc1.nextLine();

                if(input1.equals(user)){
                    System.out.println("Inserire password:");
                    String input2 = sc1.nextLine();
                    if(input2.equals(password)){
                            do {
                                System.out.println("1 - Inserisci Studente\n" +
                                        "2 - Inserisci Tutor\n" +
                                        "3 - Visualizza Studenti\n" +
                                        "4 - Visualizza Tutor\n" +
                                        "0 - Esci");
                                sc1 = new Scanner(System.in);
                                switch (sc1.nextInt()) {
                                    case 0:
                                        System.out.println("Arrivederci!");
                                        yesno = false;
                                        return;
                                    case 1:
                                        sc1 = new Scanner(System.in);
                                        System.out.println("Inserisci il nome:");
                                        String nome = sc1.nextLine();
                                        System.out.println("Inserisci il cognome:");
                                        String cognome = sc1.nextLine();
                                        System.out.println("Inserisci il numero di matricola");
                                        int matricola = sc1.nextInt();
                                        System.out.println("Scegli il tutor:");
                                        n1.showTutors();
                                        sc1 = new Scanner(System.in);
                                        n1.addStudent(n1.getTutor(sc1.nextInt()), nome, cognome, matricola);
                                        break;
                                    case 2:
                                        sc1 = new Scanner(System.in);
                                        System.out.println("Inserisci il nome:");
                                        String nomeTutor = sc1.nextLine();
                                        System.out.println("Inserisci il cognome:");
                                        String cognomeTutor = sc1.nextLine();
                                        System.out.println("Inserisci la data di nascita (yyyy-mm-dd)");
                                        String data = sc1.nextLine();
                                        n1.addTutor(nomeTutor, cognomeTutor, data);
                                        break;
                                    case 3:
                                        n1.showStudents();
                                        break;
                                    case 4:
                                        n1.showTutors();
                                        break;
                                    default:
                                        break;

                                }
                            }
                            while (yesno);
                        }
                    }
                }
    }
