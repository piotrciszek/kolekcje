package zadaniaKolekcje.Zadanie8;

public class CarOffert {
    private Car car;
    private double cenaZakupu;
    private double cenaNajmu;

    public CarOffert(Car car, double cenaZakupu, double cenaNajmu) {
        this.car = car;
        this.cenaZakupu = cenaZakupu;
        this.cenaNajmu = cenaNajmu;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getCenaZakupu() {
        return cenaZakupu;
    }

    public void setCenaZakupu(double cenaZakupu) {
        this.cenaZakupu = cenaZakupu;
    }

    public double getCenaNajmu() {
        return cenaNajmu;
    }

    public void setCenaNajmu(double cenaNajmu) {
        this.cenaNajmu = cenaNajmu;
    }

    @Override
    public String toString() {
        return "CarOffert{" +
                "car=" + car +
                ", cenaZakupu=" + cenaZakupu +
                ", cenaNajmu=" + cenaNajmu +
                '}';
    }
}
