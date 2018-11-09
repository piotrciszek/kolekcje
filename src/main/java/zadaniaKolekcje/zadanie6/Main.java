package zadaniaKolekcje.zadanie6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jacek","Kowalski",18,true);
        Person person2 = new Person("Jacek","Górski",15,true);
        Person person3 = new Person("Andżelika","Dżoli",25,false);
        Person person4 = new Person("Wanda","Ibanda",12,false);
        Person person5 = new Person("Marek","Marecki",17,true);
        Person person6 = new Person("Johny","Brawo",25,true);
        Person person7 = new Person("Stary","Pan",80,true);
        Person person8 = new Person("Newbie","Noob",12,true);
        Person person9 = new Person("Newbies","Sister",19,false);

        List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5,person6,person7,person8,person9);



        List<Person> listMen = new Person().getMale(personList);
        System.out.println(listMen);
        System.out.println("---");

        List<Person> adultWoman = new Person().getAdultWomans(personList);
        System.out.println(adultWoman);
        System.out.println("---");

        Optional<Person> adultJacek = new Person().getAdultJacek(personList);
        System.out.println(adultJacek);
        System.out.println("---");

        List<String> person1519 = new Person().getPersonsYoungerThan19AndOlderThan15(personList);
        System.out.println(person1519);
        System.out.println("---");

        int sumAge = new Person().getSumAllPersonsAge(personList);
        System.out.println(sumAge);
        System.out.println("---");

        double averageAge = new Person().getAvaragePersonsAge(personList);
        System.out.println(averageAge);
        System.out.println("---");

        Person males = new Person().getOldestPerson(personList);
        System.out.println(males);
    }
}
