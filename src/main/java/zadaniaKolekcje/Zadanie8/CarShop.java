package zadaniaKolekcje.Zadanie8;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String nazwa;
    private List<CarOffert> carOfferts = new ArrayList<>();

    public CarShop(String nazwa, List<CarOffert> carOfferts) {
        this.nazwa = nazwa;
        this.carOfferts = carOfferts;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<CarOffert> getCarOfferts() {
        return carOfferts;
    }

    public void setCarOfferts(List<CarOffert> carOfferts) {
        this.carOfferts = carOfferts;
    }
}
