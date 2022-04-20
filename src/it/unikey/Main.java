package it.unikey;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.Console;
import java.util.Scanner;

public class Main {

    private final static String user = "Mario" ;
    private final static String pass = "password" ;


    public static void main(String[] args) {
	// write your code here

        Scuola scuola = new Scuola() ;


        Tutor t1 = new Tutor("topo","gigio","1933-03-21");
        Tutor t2 = new Tutor("popo","pipio","1993-03-21");
        scuola.aggiungiTutor(t1);
        scuola.aggiungiTutor(t2);
        Studente s1 = new Studente("ajeje","brazorf") ;
        scuola.addStudente(t1,s1);
        Studente s2 = new Studente("mario","rossi") ;
        scuola.addStudente(t2,s2);


        Scanner sc = new Scanner(System.in) ;
        boolean accesso = false ;
        do{
            System.out.println("inserisci user : ");
            String us = sc.nextLine() ;
//            System.out.println("inserisci pass : ");
//           // String ps = sc.nextLine() ;
//            Console con = System.console() ;
//            char[] cp =con.readPassword("[%s]", "Password:") ;
//            String ps = new String(cp) ;

            final JPasswordField jpf = new JPasswordField();
            JOptionPane jop = new JOptionPane(jpf, JOptionPane.QUESTION_MESSAGE,
                    JOptionPane.OK_CANCEL_OPTION);
            JDialog dialog = jop.createDialog("Password:");
            dialog.addComponentListener(new ComponentAdapter() {
                @Override
                public void componentShown(ComponentEvent e) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            jpf.requestFocusInWindow();
                        }
                    });
                }
            });
            dialog.setVisible(true);
            int result = (Integer) jop.getValue();
            dialog.dispose();
            char[] password = null;
            if (result == JOptionPane.OK_OPTION) {
                password = jpf.getPassword();
            }


            String ps = new String(password) ;
            accesso = us.equals(user) && ps.equals(pass) ;
        }while (!accesso);

        boolean esci = false ;
        do {
            System.out.println("1 - Inserisci Studente\n" +
                    "2 - Inserisci Tutor\n" +
                    "3 - Visualizza Studenti\n" +
                    "4 - Visualizza Tutor\n" +
                    "0 - Esci");
            sc=new Scanner(System.in) ;
            int scelta = sc.nextInt() ;
            switch (scelta){
                case 1 : inserisciStud(scuola);
                    break;
                case 2 : inserisciTutor( scuola) ;
                    break;
                case 3: stampaLista(scuola.listaStudenti());
                    break;
                case 4: stampaLista(scuola.listaTutor());
                    break;
                case 0 :
                    System.out.println("addio");
                    esci=true ;
                    break;
                default:
                    System.out.println("inserisci scelta corretta");
            }
        }while(!esci) ;
    }

    private static void stampaLista(Persona[] per){
        for(Persona p : per){
            System.out.println(p.toString());
        }
    }

    private static void inserisciTutor(Scuola scuola) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("inserisci nome : ");
        String nome = sc.nextLine() ;
        System.out.println("inserisci cognome : ");
        String cognome = sc.nextLine() ;
        System.out.println("inserisci data di nascita(YYYY-MM-DD) : ");
        String data = sc.nextLine() ;
        scuola.aggiungiTutor(new Tutor(nome,cognome,data));
    }

    private static void inserisciStud(Scuola scuola){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("inserisci nome : ");
        String nome = sc.nextLine() ;
        System.out.println("inserisci cognome : ");
        String cognome = sc.nextLine() ;
        System.out.println("scegli tutor : ");
        Tutor[] tutori = scuola.listaTutor() ;
        for(int i =0; i<tutori.length; i++){
            System.out.println((i+1) +"- "+tutori[i].toString());
        }
        int n = sc.nextInt() ;
        scuola.addStudente(tutori[n-1],new Studente(nome,cognome));
    }
}
