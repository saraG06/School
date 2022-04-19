package it.unikey;

import it.unikey.comparator.ComparatorCognomeStudente;
import it.unikey.comparator.ComparatorCognomeTutor;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Tutor.inserisciTutor();
        Tutor.visualizzaTutor();

        Studente.inserisciStudente();
        Studente.visualizzaStudente();

    }
}










