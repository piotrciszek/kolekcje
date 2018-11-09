package zadaniaKolekcje.zadanie7;

import java.util.List;

public class Programmer {

    Person person;
    List<String> languageList;

    public Programmer(Person person, List<String> languageList) {
        this.person = person;
        this.languageList = languageList;
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
}
