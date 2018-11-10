package zadaniaKolekcje.Zadanie8;

import java.time.LocalDate;

public class Car {
    private CarBrand marka;
    private String nazwa;
    private CarType typ;
    private double spalanie;
    private double pojemnosc;
    private int iloscMiejsc;
    private int mocSilnika;
    private LocalDate rokProdukcji;
    private boolean automat;

    public Car(CarBrand marka, String nazwa, CarType typ, double spalanie, double pojemnosc, int iloscMiejsc, int mocSilnika, LocalDate rokProdukcji, boolean automat) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.typ = typ;
        this.spalanie = spalanie;
        this.pojemnosc = pojemnosc;
        this.iloscMiejsc = iloscMiejsc;
        this.mocSilnika = mocSilnika;
        this.rokProdukcji = rokProdukcji;
        this.automat = automat;
    }

    public CarBrand getMarka() {
        return marka;
    }

    public void setMarka(CarBrand marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public CarType getTyp() {
        return typ;
    }

    public void setTyp(CarType typ) {
        this.typ = typ;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(double spalanie) {
        this.spalanie = spalanie;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(int mocSilnika) {
        this.mocSilnika = mocSilnika;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(LocalDate rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public boolean isAutomat() {
        return automat;
    }

    public void setAutomat(boolean automat) {
        this.automat = automat;
    }
}
