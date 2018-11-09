package zadaniaKolekcje.zadanie7;

import java.util.List;
import java.util.stream.Collectors;

public class Programmer {

    Person person;
    List<String> languageList;

    public Programmer(Person person, List<String> languageList) {
        this.person = person;
        this.languageList = languageList;
    }

    public Programmer() {
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "person=" + person +
                ", languageList=" + languageList +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    public List<Programmer> maleProgrammer(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale()).collect(Collectors.toList());
    }
}
