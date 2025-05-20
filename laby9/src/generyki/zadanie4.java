package generyki;

import java.util.Comparator;
import java.util.*;

class Zawodnik {
    String imie;
    String nazwisko;
    int numer;
    double predkoscMax;

    public Zawodnik(String imie, String nazwisko, int numer, double predkoscMax) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
        this.predkoscMax = predkoscMax;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumer() {
        return numer;
    }

    public double getPredkoscMax() {
        return predkoscMax;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", nr: " + numer + ", max: " + predkoscMax;
    }
}

class ImieComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return z1.getImie().compareToIgnoreCase(z2.getImie());
    }
}

class NumerComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return Integer.compare(z1.getNumer(), z2.getNumer());
    }
}

class PredkoscComparator implements Comparator<Zawodnik> {
    @Override
    public int compare(Zawodnik z1, Zawodnik z2) {
        return Double.compare(z1.getPredkoscMax(), z2.getPredkoscMax());
    }
}

public class zadanie4 {
    public static void main(String[] args) {
        List<Zawodnik> zawodnicy = new ArrayList<>();
        zawodnicy.add(new Zawodnik("Adam", "Nowak", 10, 32.5));
        zawodnicy.add(new Zawodnik("Bartosz", "Kowalski", 7, 30.1));
        zawodnicy.add(new Zawodnik("Cezary", "Malinowski", 15, 33.8));

        System.out.println("Oryginalna lista:");
        zawodnicy.forEach(System.out::println);

        System.out.println();

        System.out.println("Sortowanie po imieniu:");
        zawodnicy.sort(new ImieComparator());
        zawodnicy.forEach(System.out::println);

        System.out.println();

        System.out.println("Sortowanie po numerze:");
        zawodnicy.sort(new NumerComparator());
        zawodnicy.forEach(System.out::println);

        System.out.println();

        System.out.println("Sortowanie po prędkości max:");
        zawodnicy.sort(new PredkoscComparator());
        zawodnicy.forEach(System.out::println);
    }
}
