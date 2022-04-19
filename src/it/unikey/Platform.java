package it.unikey;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.TreeSet;

public class Platform {

    private TreeSet<Student> students;
    private TreeSet<Tutor> tutors;

    public Platform(){
        this.students = new TreeSet<>();
        this.tutors = new TreeSet<>();
    }

    public void start(){
        int count = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserire l'username:");
            String user = sc.nextLine();

            System.out.println("Inserire la password");
            String pass = sc.next();

            if (checkAccount(user, pass)) {
                    options();
            } else {
                System.err.println("Credenziali sbagliate!");
                count++;
            }
        } while(count < 3);
        System.err.println("Tentativi finti!");

    }

    public boolean checkAccount(String user, String pass){

        if (user.equals("admin") && pass.equals("admin")) {
            System.out.println("Benvenuto!!");
            return true;
        }
        return false;
    }

    public void options(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - Inserisci Studente\n2 - Inserisci Tutor\n3 - Visualizza Studenti\n4 - Visualizza Tutor\n0 - Esci");
           int number = sc.nextInt();
        switch (number){
            case 0:
                System.out.println("Arrivederci!!");
                return;
            case 1:
                addStudent();
                break;
            case 2:
                addTutor();
                break;
            case 3:
                showStudents();
                break;
            case 4:
                showTutors();
                break;
            default:
                System.err.println("Inserire un numero valido!");
                return;
            }
        }while (true);
    }
    Scanner sc = new Scanner(System.in);
    public void addStudent(){
        System.out.println("Inserisci il nome: ");
        String name = sc.nextLine();
        System.out.println("Inserisci il cognome: ");
        String lastname = sc.nextLine();
        Person s = new Student(name, lastname);
        students.add((Student) s);
    }

    public void addTutor(){
        System.out.println("Inserisci il nome: ");
        String name = sc.nextLine();
        System.out.println("Inserisci il cognome: ");
        String lastname = sc.nextLine();
        System.out.println("Inserisci data di nascita:(dd/mm/yyyy)");
        String date = sc.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(date, dateFormat);

        Person t = new Tutor(name, lastname, birth);
        tutors.add((Tutor) t);
    }

    public void showStudents(){
        for(Student s : students){
            System.out.println(s);
        }
    }

    public void showTutors(){
        for(Tutor t : tutors){
            System.out.println(t);
        }
    }
}
