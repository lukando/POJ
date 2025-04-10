package zadania;

import java.util.Random;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        karta[] talia = new karta[52];
        int indeks = 0;

        for (kolor kolor : kolor.values()) {
            for (figura figura : figura.values()) {
                talia[indeks] = new karta(kolor, figura);
                indeks++;
            }
        }

        System.out.println("Twoja talia kart:");
        for (karta karta : talia) {
            System.out.println(karta);
        }
    }
}