package it.unikey;

public abstract class Person implements Comparable<Person>{
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  "name = '" + getName() + '\'' + ", surname = '" + getSurname() + '\'' + " ";
    }

    @Override
    public int compareTo(Person o) {
        int res;
        res = surname.compareTo(o.surname);
        if (res == 0) {
            res = name.compareTo(o.name);
        }
        return res;
    }
}
