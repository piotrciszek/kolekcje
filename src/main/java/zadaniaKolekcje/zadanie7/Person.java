package zadaniaKolekcje.zadanie7;

import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private String surname;
    private int age;
    private boolean isMale;

    public Person(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
    public List<Person> onlyMale(List<Person> personList){
        return personList.stream().filter(u -> u.isMale).collect(Collectors.toList());
    }
}
