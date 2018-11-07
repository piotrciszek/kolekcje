package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie3 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add(Arrays.asList(10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355, 2222, 1111, 3546, 138751, 235912).toString());


        System.out.println("Indeks elementu 138751 to: " + lista.indexOf("138751"));
        System.out.println(lista.contains("67888"));
        System.out.println(lista.contains("67889"));
        lista.remove("67888");
        lista.remove("67889");
        System.out.println(lista.contains("67888"));
        System.out.println(lista.contains("67889"));
        System.out.println("Indeks elementu 138751 to: " + lista.indexOf("138751"));

        System.out.println(lista);
        for(String z: lista){
            System.out.println(z);
        }
    }



}