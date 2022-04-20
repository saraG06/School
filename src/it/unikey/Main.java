package it.unikey;

public class Main {

    public static void main(String[] args) {
        Scuola scuola = new Scuola();

        UserInterface.login();

        Scuola.associaStudentiATutor();
    }
}
