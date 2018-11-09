package zadaniaKolekcje.zadanie5;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik();



        List<Double> listaOcen1 = Arrays.asList(2.5, 3.0, 4.0, 3.5);
        List<Double> listaOcen2 = Arrays.asList(3.5, 4.0, 4.0, 4.5);
        List<Double> listaOcen3 = Arrays.asList(2.0, 3.5, 3.0, 3.5);
        List<Double> listaOcen4 = Arrays.asList(4.0, 4.5, 5.0, 3.5);


        Student student1 = new Student(listaOcen1, 3243223, "Piotr", "Dawicki");
        Student student2 = new Student(listaOcen2, 4355521, "Adam", "Bakowski");
        Student student3 = new Student(listaOcen3, 5901322, "Anna", "Nowak");
        Student student4 = new Student(listaOcen4, 6723229, "Beata", "Kawowska");

        dziennik.dodajStudenta(student1);
        dziennik.dodajStudenta(student2);
        dziennik.dodajStudenta(student3);
        dziennik.dodajStudenta(student4);
        System.out.println(dziennik.getStudentList());
        dziennik.usunStudenta(student1);
        System.out.println(dziennik.getStudentList());
        System.out.println(dziennik.zwrocStudenta(0));
        System.out.println(dziennik.podajSredniaStudenta(5901322));
        System.out.println(dziennik.podajStudentowZagrozonych());


        /*dziennik.dodajStudenta(student1);
        dziennik.dodajStudenta(student2);*/
//        dziennik.studentList.add(student3);
//        dziennik.studentList.add(student4);



    }


}
