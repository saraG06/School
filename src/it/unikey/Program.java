package it.unikey;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Program {
    TreeSet<Student> students = new TreeSet<>();
    TreeSet<Tutor> tutors = new TreeSet<>();
    Map<Tutor, ArrayList<Student>> mapTutor = new TreeMap<>();

    public void addStudent(Tutor t, String name, String surname){
        UUID matricola = UUID.randomUUID();
        name.toLowerCase();
        surname.toLowerCase();

        String temp = name.substring(0, 1).toUpperCase();
        name = temp + name.substring(1);

        String temp2 = surname.substring(0, 1).toUpperCase();
        surname = temp2 + surname.substring(1);

        Student temp3 = new Student(name, surname, matricola.toString());
        students.add(temp3);

        if(!mapTutor.containsKey(t)){
            mapTutor.put(t, new ArrayList<Student>());
        }
        mapTutor.get(t).add(temp3);

    }

    public void addTutor(String name, String surname, String date){

        try {
            String a = name.toLowerCase();
            String b = surname.toLowerCase();

            String temp = a.substring(0, 1).toUpperCase();
            String name2 = temp + a.substring(1);

            String temp2 = b.substring(0, 1).toUpperCase();
            String surname2 = temp2 + b.substring(1);

            Tutor temp3 = new Tutor(name2, surname2, date);
            tutors.add(temp3);
        }
        catch (Exception e){
            System.out.println("Input errato!");
        }

    }

    public void showStudents(){
        System.out.println(mapTutor);
    }
    public void showTutors(){
        Object[] t = tutors.toArray();
        int numb = 1;

        System.out.println("Tutor:");
        for(Object x : t){
            System.out.println( numb + " " + x);
            numb++;
        }
    }
    public Tutor getTutor(int x){
        Object[] t = tutors.toArray();
        Tutor n = (Tutor) Array.get(t, x-1);
        return n;
    }
}
