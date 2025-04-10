package zadania;

class Ulamek {
    int licznik, mianownik;

    Ulamek(int licznik, int mianownik) {
        if (mianownik != 0) {
            this.licznik = licznik;
            this.mianownik = mianownik;
        } else {
            System.out.println("Błędne dane! Mianownik nie może być zerem.");
            this.licznik = 0;
            this.mianownik = 1; // domyślnie 0/1
        }
    }

    Ulamek dodawanie(Ulamek x) {
        int licznik = this.licznik * x.mianownik + this.mianownik * x.licznik;
        int mianownik = this.mianownik * x.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    Ulamek odejmowanie(Ulamek x) {
        int licznik = this.licznik * x.mianownik - this.mianownik * x.licznik;
        int mianownik = this.mianownik * x.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    Ulamek mnozenie(Ulamek x) {
        int licznik = this.licznik * x.licznik;
        int mianownik = this.mianownik * x.mianownik;
        return new Ulamek(licznik, mianownik);
    }

    Ulamek dzielenie(Ulamek x) {
        int licznik = this.licznik * x.mianownik;
        int mianownik = this.mianownik * x.licznik;
        return new Ulamek(licznik, mianownik);
    }

    void wyswietlanie() {
        System.out.println(this.licznik + "/" + this.mianownik);
    }
}

public class zadanie1 {
    public static void main(String[] args) {

        Ulamek u1 = new Ulamek(5, 5);
        Ulamek u2 = new Ulamek(10, 20);

        u1.wyswietlanie();

        u1 = u1.dodawanie(u2);
        u1.wyswietlanie();

        u1 = u1.mnozenie(u2);
        u1.wyswietlanie();

        u1 = u1.dzielenie(u2);
        u1.wyswietlanie();

        u1 = u1.odejmowanie(u2);
        u1.wyswietlanie();
    }
}