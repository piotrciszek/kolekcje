package zadaniaKolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<Integer> integerList = new ArrayList<Integer>();
        for (int i=0; i<5; i++){
            System.out.println("Podaj " + (int)(i+1) + ". liczbę");
            integerList.add(scanner.nextInt());
        }
        for (int i=0; i<5; i++){
            integerList.add(random.nextInt(100));
        }
        for (Integer z: integerList){
            System.out.println(z);
        }
    }
}
