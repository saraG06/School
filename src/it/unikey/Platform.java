package it.unikey;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Platform {

    private TreeSet<Student> students;
    private TreeSet<Tutor> tutors;
    private Map<Tutor, List<Student>> tutorMap;

    public Platform(){
        this.students = new TreeSet<>();
        this.tutors = new TreeSet<>();
        this.tutorMap = new TreeMap<>();
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
        Student[] array = new Student[students.size()];
        int index = 0;
        for(Student s : students){
            array[index++] = s;
        }
        for(Student s : array){
            System.out.println(s.toString());
        }
    }

    public void showTutors(){
        Tutor[] array = new Tutor[tutors.size()];
        int index = 0;
        for(Tutor t : tutors){
           array[index++] = t;
        }
        for(Tutor t : array){
            System.out.println(t.toString());
        }
    }

    public void setStudentToTutor(Tutor t, Student s){
        List<Student> list;
        if(tutorMap.size() == 0){
            list = new ArrayList<>();
            list.add(s);
            tutorMap.put(t,list);
        }else{
            for(Map.Entry tm : tutorMap.entrySet()) {
                if (tm.equals(t)) {
                    list = new ArrayList<>();
                    list.addAll((Collection<Student>) tm.getValue());
                    list.add(s);
                    tutorMap.put(t, list);
                }
            }
        }

    }

    public void getTutorMap(Tutor t){
        for(Map.Entry tm : tutorMap.entrySet()){
            if(tm.getKey().equals(t)){
                System.out.println(tm.getValue());
            }
        }
    }
}
