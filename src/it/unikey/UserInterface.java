package it.unikey;

import java.util.Scanner;

public class UserInterface {

    private static final String username = "leopro1234";
    private static final String password = "1234";



    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci username");
        String usernameInput =  sc.nextLine();
        System.out.println("Inserisci password");
        String passwordInput =  sc.nextLine();

            if (usernameInput.equals(username) && passwordInput.equals(password)){
                System.out.println("Accesso consentito");
                menuPrincipale();
            }
            else{
                System.out.println("Credenziali sbagliate");
            }
    }

    public static void menuPrincipale(){

        int continua;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Cosa vuoi fare? 1-Inserisci studente 2-Inserisci tutor 3-Visualizza studenti 4-Visualizza tutor 0-Esci");
            int i = sc.nextInt();
            sc.nextLine();


            switch (i){
                case 0:
                    System.out.println("Il programma si sta chiudendo");
                    break;
                case 1:
                    Scuola.inserisciStudente();
                    break;
                case 2:
                    Scuola.inserisciTutor();
                    break;
                case 3:
                    Scuola.stampaStudenti();
                    break;
                case 4:
                    Scuola.stampaTutor();
                    break;
            }

            System.out.println("Vuoi fare altre operazioni? 1-SI  2-NO");
            continua = sc.nextInt();
        }
        while(continua == 1);

    }
}
