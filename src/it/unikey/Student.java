package it.unikey;

public class Student extends Person {

    private static int id = 1000;
    private int serialNumber;

    public Student(String name, String lastname) {
        super(name, lastname);
        this.serialNumber = ++id;
    }

    @Override
    public String toString() {
        return serialNumber + " " + super.toString();
    }
}
