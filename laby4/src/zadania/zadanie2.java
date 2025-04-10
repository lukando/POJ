package zadania;

import java.util.Random;
import java.util.Scanner;

class Gra{
    int liczba;

    void losowanieLiczby(int zakres){
        Random r = new Random();
        this.liczba = r.nextInt(zakres);
    }

    boolean odgadywanieLiczby(int pytanie){
        if(pytanie == liczba){
            System.out.println("Brawo! Odgadłeś liczbę!");
            return true;
        }
        else{
            if(pytanie > liczba){
                System.out.println("Za duża!");
            }
            else{
                System.out.println("Za mała!");
            }
        }
        return false;
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj zakres: ");
        int zakres = sc.nextInt();

        Gra gra = new Gra();
        gra.losowanieLiczby(zakres);

        int licznik = 0;
        boolean wygrana = false;

        while(licznik < 5 && wygrana == false){
            System.out.println("Zgadnij jaką liczbę wylosowałem:");
            int pytanie = sc.nextInt();
            wygrana = gra.odgadywanieLiczby(pytanie);
            licznik++;
        }

        if(!wygrana){
            System.out.println("Nie udało ci się odgadnąć liczby!");
            System.out.println("Liczba: " + gra.liczba);
        }
    }
}
