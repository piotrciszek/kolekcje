package zadaniaKolekcje.zadanie7;

import java.util.List;
import java.util.Set;
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
    public List<Programmer> cobolMinor(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getLanguageList().
                contains("Cobol")).collect(Collectors.toList());
    }

    public List<Programmer> moreThanOneLanguage(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getLanguageList().size() > 1)
                .collect(Collectors.toList());
    }

    public List<Programmer> femaleWhosWriteInJavaAndCpp(List<Programmer> programmers){
        return programmers.stream().filter(u -> !u.getPerson().isMale()).
                filter(u -> u.getLanguageList().contains("Java") && u.getLanguageList().contains("Cpp"))
                .collect(Collectors.toList());
    }

    public List<String> getMaleNames(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale())
                .map(u -> u.getPerson().getName())
                .collect(Collectors.toList());
    }
    public Set<List<String>> getAllLanguages(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.getPerson().isMale())
                .map(u -> u.languageList)
                .collect(Collectors.toSet());
    }

    public List<String> getLastNameProgrammersWithMoreThanTwoLanguages(List<Programmer> programmers){
        return programmers.stream().filter(u -> u.languageList.size() > 2)
                .map(u -> u.getPerson().getSurname())
                .collect(Collectors.toList());
    }

    public boolean isExistAnyPersonWhosDoesnyKnowAnyLanguage(List<Programmer> programmers){
        return programmers.stream().anyMatch(u -> u.getLanguageList().size() == 0);
    }

    public int  getAllLanguagesKnownByFamales(List<Programmer> programmers){
        return programmers.stream().filter(u -> !u.getPerson().isMale())
                .mapToInt(u -> u.getLanguageList().size()).sum();
    }
}