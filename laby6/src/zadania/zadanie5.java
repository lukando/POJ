package zadania;

class Samochod{
    int predkosc, rocznik;
    String kolor, marka;

    Samochod(String kolor, String marka, int rocznik){
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.predkosc = 0;
    }

    void przyspiesz(){
        predkosc += 20;
        if(predkosc > 140){
            predkosc = 140;
        }
    }

    public String toString(){
        return kolor + " " + marka + " rocznik " + rocznik;
    }

    boolean equals(Samochod samochod){
        if(this.kolor == samochod.kolor && marka == samochod.marka && rocznik == samochod.rocznik){
            return true;
        }
        return false;
    }
}

class SuperSamochod extends Samochod{
    SuperSamochod(String kolor, String marka, int rocznik){
        super(kolor, marka, rocznik);
    }

    void przyspiesz(){
        predkosc += 20;
        if(predkosc > 200){
            predkosc = 200;
        }
    }
}

public class zadanie5 {
    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("Biały", "Mercedes", 2018);
        Samochod samochod2 = new Samochod("Biały", "Mercedes", 2018);
        Samochod samochod3 = new Samochod("Czarny", "Mercedes", 1994);

        samochod1.przyspiesz();
        samochod1.przyspiesz();
        System.out.println(samochod1.predkosc);
        System.out.println(samochod1.toString());
        System.out.println(samochod1.equals(samochod2));
        System.out.println(samochod1.equals(samochod3));

        SuperSamochod SuperCar = new SuperSamochod("Czerwony", "Ferrari", 2006);
        for(int i = 0; i < 12; i++){
            System.out.println(SuperCar.predkosc);
            SuperCar.przyspiesz();
        }

        SuperSamochod samochod4 = new SuperSamochod("Biały", "Mercedes", 1994);
        System.out.println(samochod3.equals(samochod4));
    }
}
