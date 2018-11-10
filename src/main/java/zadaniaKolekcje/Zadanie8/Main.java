package zadaniaKolekcje.Zadanie8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarBrand.AUDI, "A3", CarType.HATCHBACK, 6.5, 2.0, 5, 95, LocalDate.of(2015, 1, 1), false);
        Car car2 = new Car(CarBrand.BMW, "730", CarType.SEDAN, 13.0, 3.0, 4, 125, LocalDate.of(2003, 1, 1), false);
        Car car3 = new Car(CarBrand.HONDA, "Accord", CarType.CABRIO, 7.5, 1.8, 4, 85, LocalDate.of(2010, 1, 1), false);
        Car car4 = new Car(CarBrand.HYUNDAI, "Tuscon", CarType.SUV, 9.5, 1.9, 5, 90, LocalDate.of(2018, 1, 1), true);
        Car car5 = new Car(CarBrand.FORD, "Fiesta", CarType.HATCHBACK, 5.5, 1.1, 4, 70, LocalDate.of(2012, 1, 1), false);
        Car car6 = new Car(CarBrand.FIAT, "Tipo", CarType.SEDAN, 10.0, 2.4, 5, 100, LocalDate.of(2009, 1, 1), false);
        Car car7 = new Car(CarBrand.MERCEDES, "Klasa E", CarType.KOMBI, 9.0, 2.8, 5, 110, LocalDate.of(2014, 1, 1), true);
        Car car8 = new Car(CarBrand.MAZDA, "6", CarType.SEDAN, 11.5, 2.2, 5, 80, LocalDate.of(2009, 1, 1), true);


        CarOffert carOffert1 = new CarOffert(car1, 60000.00, 300.00);
        CarOffert carOffert2 = new CarOffert(car2, 25000.00, 250.00);
        CarOffert carOffert3 = new CarOffert(car3, 10000.00, 100.00);
        CarOffert carOffert4 = new CarOffert(car4, 65000.00, 300.00);
        CarOffert carOffert5 = new CarOffert(car5, 12000.00, 120.00);
        CarOffert carOffert6 = new CarOffert(car6, 13000.00, 150.00);
        CarOffert carOffert7 = new CarOffert(car7, 55000.00, 280.00);
        CarOffert carOffert8 = new CarOffert(car8, 34000.00, 200.00);

        List<CarOffert> carOffertList = Arrays.asList(carOffert1, carOffert2, carOffert3, carOffert4, carOffert5, carOffert6, carOffert7, carOffert8);

        CarShop carShop = new CarShop("Lista", carOffertList);





    }
}
