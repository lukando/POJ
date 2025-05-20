package generyki;

import java.io.*;
import java.util.*;

public class Slownik<K, V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[]) new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc) {
        for (int i = 0; i < klucze.length; i++) {

            if (klucze[i] != null && klucze[i].equals(klucz)) {

                wartosci[i] = wartosc;
                return true;
            }
        }

        int wolny = pierwszyWolnyIndeks();

        if (wolny >= klucze.length) {
            return false;
        }

        klucze[wolny] = klucz;
        wartosci[wolny] = wartosc;
        return true;
    }

    public boolean czyZawiera(K klucz) {

        for (K k : klucze) {
            if (klucz != null && klucz.equals(k)) {
                return true;
            }
        }
        return false;
    }

    public int wielkosc() {
        int count = 0;
        for (K k : klucze) {
            if (k != null) {
                count++;
            }
        }
        return count;
    }

    private int pierwszyWolnyIndeks() {
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] == null) return i;
        }
        return klucze.length;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder("[");
        for (int i = 0; i < klucze.length; i++) {
            if (klucze[i] != null) {
                buffer.append(klucze[i]).append("->").append(wartosci[i]).append(",");
            }
        }
        if (buffer.length() > 1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file) {
        List<String> linie = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linia;

            while ((linia = br.readLine()) != null) {

                if (!linia.trim().isEmpty() && linia.contains("=")) {
                    linie.add(linia.trim());
                }
            }
        }
        catch (IOException e) {
            System.out.println("Błąd podczas czytania pliku: " + e.getMessage());
            return null;
        }

        Slownik<String, String> slownik = new Slownik<>(linie.size());

        for (String l : linie) {
            String[] parts = l.split("=", 2);

            if (parts.length == 2) {
                slownik.dodaj(parts[0].trim(), parts[1].trim());
            }
        }

        return slownik;
    }
}