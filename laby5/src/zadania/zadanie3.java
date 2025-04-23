package zadania;

import org.w3c.dom.ranges.Range;

class Car{
    String kolor, marka;

    Car(String kolor, String marka) {
        this.kolor = kolor;
        this.marka = marka;
    }

    String getInformation(){
        return kolor + " " + marka;
    }
}

class Supersamochod extends Car{
    int predkoscMaksymalna;

    Supersamochod(String kolor, String marka, int predkoscMaksymalna) {
        super(kolor, marka);
        this.predkoscMaksymalna = predkoscMaksymalna;
    }
}

class klasyk extends Car{
    int rocznik;

    klasyk(String kolor, String marka, int rocznik) {
        super(kolor, marka);
        this.rocznik = rocznik;
    }
}

class SUV extends Car{
    boolean naped4X4;

    SUV(String kolor, String marka, boolean naped4X4) {
        super(kolor, marka);
        this.naped4X4 = naped4X4;
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        Car[] samochody = new Car[3];
        samochody[0] = new Supersamochod("Czerwony", "Ferrari", 324);
        samochody[1] = new SUV("Czarny", "Range Rover", true);
        samochody[2] = new klasyk("żółty", "Aston Martin", 1965);

        for (Car car : samochody) {
            System.out.println(car.getInformation());
        }
    }
}
