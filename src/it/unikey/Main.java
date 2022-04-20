package it.unikey;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tutor t1= new Tutor("Mario", "Rossi", LocalDate.parse("1974-12-03"), "mariorossi74");
        Tutor t2= new Tutor("Giorgio", "Verdi", LocalDate.parse("1948-07-24"), "giorgioverdi48");
        Tutor t3= new Tutor("Pluto", "Bianchi", LocalDate.parse("1927-11-24"), "plutobianchi27");
        Studente s1= new Studente("Franco", "Blu", t1);
        Studente s2= new Studente("Gigi", "Viole", t2);
        Studente s3= new Studente("Bambi", "Neri", t3);

        HashSet<Tutor> listaTutor= new HashSet<>();
        HashSet<Studente> listaStudente= new HashSet<>();

        listaTutor.add(t1);
        listaTutor.add(t2);
        listaTutor.add(t3);
        listaStudente.add(s1);
        listaStudente.add(s2);
        listaStudente.add(s3);

        Scuola scuola= new Scuola(listaTutor, listaStudente);

        Scanner sc= new Scanner(System.in);
        int risposta= 1;
        if(scuola.login()) {
            do {
                System.out.println("1 -> Inserisci studente");
                System.out.println("2 -> Inserisci tutor");
                System.out.println("3 -> Visualizza studenti");
                System.out.println("4 -> Visualizza tutor");
                System.out.println("5 -> Esci");
                risposta = sc.nextInt();
                switch (risposta) {
                    case 1:
                        scuola.addStudente();
                        break;
                    case 2:
                        scuola.addTutor();
                        break;
                    case 3:
                        scuola.listaStudentiArray();
                        System.out.println('\n');
                        scuola.listaStudentiTreeSet();
                        break;
                    case 4:
                        scuola.listaTutorArray();
                        System.out.println('\n');
                        scuola.listaTutorTreeSet();
                        break;
                    case 5:
                        System.out.println("Arrivederci");
                        break;
                    default:
                        System.out.println("Valore non valido");
                }
            } while(risposta<1 || risposta>5);
        } else
            System.out.println("Username o password errati");
    }
}
