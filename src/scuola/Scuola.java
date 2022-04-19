package scuola;

import comparator.ComparatorOrdineAlfabetico;
import comparator.ComparatorOrdineAlfabeticoTutor;
import exception.TutorStudenteException;

import java.time.LocalDate;
import java.util.*;

public class Scuola {

    public static TreeSet<Student> studenti = new TreeSet<>();
    public static TreeSet <Tutor> tutor = new TreeSet<>();

    public static ComparatorOrdineAlfabetico ordineAlfabetico= new ComparatorOrdineAlfabetico();
    public static ComparatorOrdineAlfabeticoTutor tutorAlfabetico = new ComparatorOrdineAlfabeticoTutor();
    public static TreeSet<Student> studentiOrdine = new TreeSet<>(ordineAlfabetico);
    public static TreeSet<Tutor> tutorOrdine = new TreeSet<>(tutorAlfabetico);

    public static HashMap<Student, Tutor> tutorStudente= new HashMap<>();


    public static void aggiungiStudente (){
        System.out.println("Indicare il nome dello studente da inserire: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Indicare il cognome dello studente da inserire: ");
        String cognome = new Scanner(System.in).nextLine();

        String nome1 = (nome.substring(0,1).toUpperCase().concat(nome.substring(1).toLowerCase()));
        String cognome1 = (cognome.substring(0,1).toUpperCase().concat(cognome.substring(1).toLowerCase()));

        Student s = new Student(nome1, cognome1);
        studenti.add(s);
        studentiOrdine.add(s);
    }

    public static LocalDate addDate(Scanner scan) {
            return LocalDate.parse(scan.next());
        }


    public static void aggiungiTutor() {
        System.out.println("Indicare il nome del tutor da inserire: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Indicare il cognome del tutor da inserire: ");
        String cognome = new Scanner(System.in).nextLine();
        System.out.println("Inserire data (anno-mese-giorno)");
        Scanner anno = new Scanner(System.in);
        LocalDate nascita = addDate(anno);

        String nome1 = (nome.substring(0,1).toUpperCase().concat(nome.substring(1).toLowerCase()));
        String cognome1 = (cognome.substring(0,1).toUpperCase().concat(cognome.substring(1).toLowerCase()));

        Tutor t = new Tutor(nome1, cognome1, nascita);
        tutor.add(t);
        tutorOrdine.add(t);
    }

    public static void visualizzaStudenti() {
        String s = "Gli studenti sono: ";

        for (Student st : studenti) {
            s += (st.getNome() + st.getCognome()) + ", ";
        }
        System.out.println(s);
        System.out.println("\n");
    }

    public static void visualizzaTutor() {
        String s = "I tutor sono: ";

        for (Tutor t : tutor) {
            s += (t.getNome() + t.getCognome() + ", ");
        }
        System.out.println(s);
        System.out.println("\n");
    }

    public void visualizzaStudentiAlfabetico() {
        String s = "Gli studenti sono: ";
        for (Student st : studentiOrdine) {
            s += (st.getCognome() + " " + st.getNome() + "\n");
        }
        System.out.println(s);
    }

    public void visualizzaTutorAlfabetico() {
        String s = "I tutor sono: ";
        for (Tutor t : tutorOrdine) {
            s += (t.getCognome() + " " + t.getNome() + "\n");
        }
        System.out.println(s);
    }

    public void aggiungiTutorStudente (Student s, Tutor t) throws TutorStudenteException {
            if (tutor.contains(t) && studenti.contains(s)) {
                tutorStudente.put(s, t);
            }
            else throw new TutorStudenteException("Studente o tutor non trovato!");
    }






}
