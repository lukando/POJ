package zadania;

class koszykarz{
    String imie, nazwisko, pozycja;
    int wzrost, waga;

    koszykarz(String imie, String nazwisko, String pozycja, int wzrost, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pozycja = pozycja;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public String toString(){
        return imie + " " + nazwisko + " " + pozycja + " " + wzrost + " " + waga;
    }
}

public class zadanie4 {
    public static void main(String[] args) {
        koszykarz Koszykarz = new koszykarz("Lebron", "James", "SF", 206, 113);
        System.out.println(Koszykarz);
    }
}
