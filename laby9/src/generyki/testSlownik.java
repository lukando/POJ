package generyki;

import java.io.File;
import java.io.IOException;

public class testSlownik {
    public static void main(String[] args) {
        Slownik<Integer, String> s1 = new Slownik<>(5);
        s1.dodaj(1, "jeden");
        s1.dodaj(2, "dwa");
        s1.dodaj(3, "trzy");
        System.out.println("Slownik 1: " + s1);
        System.out.println("Czy zawiera klucz 2? " + s1.czyZawiera(2));
        System.out.println("Wielkość: " + s1.wielkosc());

        Slownik<String, Osoba> s2 = new Slownik<>(3);
        s2.dodaj("Ala", new Osoba("Ala", 21));
        s2.dodaj("Ola", new Osoba("Ola", 30));
        s2.dodaj("Ala", new Osoba("Alicja", 22)); // nadpisanie
        System.out.println("Slownik 2: " + s2);

        System.out.println("--------------------");
        System.out.println("-- Test Zadanie 3 --");
        System.out.println("--------------------");


        File plik = new File("C:\\Users\\swiec\\Desktop\\laby9\\src\\generyki\\słownik.txt");

        Slownik<String, String> slownik = Slownik.wczytajSlownik(plik);

        if (slownik != null) {
            System.out.println("Wczytany słownik: " + slownik);
            System.out.println("Czy zawiera 'kot'? " + slownik.czyZawiera("kot"));
            System.out.println("Wielkość: " + slownik.wielkosc());
        }
        else {
            System.out.println("Nie udało się wczytać słownika.");
        }
    }
}

class Osoba {
    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie + " (" + wiek + ")";
    }
}
