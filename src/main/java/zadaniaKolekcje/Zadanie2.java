package zadaniaKolekcje;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        int suma = 0;
        System.out.println("Wylsowane liczby to: ");
        for (Integer z: list) {
            System.out.print(z+ " ");
            suma += z;
        }
        System.out.println("");
        System.out.println("Suma wylosowany liczb to: " + suma);
        System.out.println("Srednia wylosowanych liczb to: " + (double)suma/list.size());
        System.out.println("Mediana wylosowanych liczb to: " + (double)list.get(list.size()/2));
        int min = list.get(0);
        int max = list.get(0);
        for (Integer z: list) {
            if (z <min) min = z;
            if (z >max) max = z;
        }
        System.out.println("Najwieksza liczba to: " + max + " i ma Indeks: " + list.indexOf(max));
        System.out.println("Najmniejsza liczba to: " + min + " i ma Indeks: " + list.indexOf(min));
    }
}
