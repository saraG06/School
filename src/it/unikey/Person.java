package it.unikey;

import java.util.Locale;

public class Person  implements Comparable<Person>{

    private String name;
    private String lastname;

    public Person(String name, String lastname){
        this.setName(name);
        this.setLastname(lastname);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().charAt(0) + name.toLowerCase().substring(1, name.length());
    }

    public void setLastname(String lastname) {
        this.lastname = lastname.toUpperCase().charAt(0) + lastname.toLowerCase().substring(1, lastname.length());
    }

    @Override
    public String toString() {
        return  name + " " + lastname;
    }

    @Override
    public int compareTo(Person o) {
        int result = 0;
        result = this.getLastname().compareTo(o.getLastname());
        if(result == 0){
            result = this.getName().compareTo(o.getName());
        }
        return result;
    }
}
