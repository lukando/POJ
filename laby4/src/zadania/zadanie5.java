package zadania;

import java.util.Random;
import java.util.Scanner;

class Zawodnik{
    String imie;
    int predkoscMinimalna, predkoscMaksymalna, pokonanyDystans;

    void stworzZawodnika(String imie, int predkoscMinimalna, int predkoscMaksymalna){
        this.imie = imie;
        this.predkoscMinimalna = predkoscMinimalna;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.pokonanyDystans = 0;
    }

    void przedstawSie(){
        System.out.println("Jestem " + this.imie + ", biegam z prędkością " + this.predkoscMinimalna + "-" + this.predkoscMaksymalna + " km/h");
    }

    void biegnij(){
        Random r = new Random();
        int dystans = r.nextInt(this.predkoscMaksymalna - this.predkoscMinimalna + 1) + this.predkoscMinimalna;
        System.out.println(this.imie + " przebiegł dystans: " + dystans);
        this.pokonanyDystans += dystans;
        System.out.println("Całkowity przebiegnięty dystans " + this.imie + ": " + this.pokonanyDystans);
    }
}

class Wyscig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zawodnik zawodnik1 = new Zawodnik();
        Zawodnik zawodnik2 = new Zawodnik();
        Zawodnik zawodnik3 = new Zawodnik();

        System.out.println("Tworzenie trzech zawodników!");

        System.out.println("Tworzenie pierwszego zawodnika:");
        System.out.println("Podaj imię zawodnika:");
        String imie = sc.nextLine();
        System.out.println("Podaj minimalną prędkość zawodnika:");
        int predkoscMinimalna = sc.nextInt();
        System.out.println("Podaj maksymalną prędkość zawodnika:");
        int predkoscMaksymalna = sc.nextInt();
        sc.nextLine();
        zawodnik1.stworzZawodnika(imie, predkoscMinimalna, predkoscMaksymalna);

        System.out.println("Tworzenie drugiego zawodnika:");
        System.out.println("Podaj imię zawodnika:");
        imie = sc.nextLine();
        System.out.println("Podaj minimalną prędkość zawodnika:");
        predkoscMinimalna = sc.nextInt();
        System.out.println("Podaj maksymalną prędkość zawodnika:");
        predkoscMaksymalna = sc.nextInt();
        sc.nextLine();
        zawodnik2.stworzZawodnika(imie, predkoscMinimalna, predkoscMaksymalna);

        System.out.println("Tworzenie trzeciego zawodnika:");
        System.out.println("Podaj imię zawodnika:");
        imie = sc.nextLine();
        System.out.println("Podaj minimalną prędkość zawodnika:");
        predkoscMinimalna = sc.nextInt();
        System.out.println("Podaj maksymalną prędkość zawodnika:");
        predkoscMaksymalna = sc.nextInt();
        sc.nextLine();
        zawodnik3.stworzZawodnika(imie, predkoscMinimalna, predkoscMaksymalna);

        boolean koniecSymulacji = false;

        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik3.przedstawSie();

        while(!koniecSymulacji){
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();

            if(zawodnik1.pokonanyDystans >= 50){
                System.out.println("Zwyciężył: " + zawodnik1.imie);
                koniecSymulacji = true;
            }
            if(zawodnik2.pokonanyDystans >= 50){
                System.out.println("Zwyciężył: " + zawodnik2.imie);
                koniecSymulacji = true;
            }
            if(zawodnik3.pokonanyDystans >= 50){
                System.out.println("Zwyciężył: " + zawodnik3.imie);
                koniecSymulacji = true;
            }
        }

        System.out.println("\nSTATYSTYKI:");
        System.out.println(zawodnik1.imie + " przebiegł: " + zawodnik1.pokonanyDystans + " km");
        System.out.println(zawodnik2.imie + " przebiegł: " + zawodnik2.pokonanyDystans + " km");
        System.out.println(zawodnik3.imie + " przebiegł: " + zawodnik3.pokonanyDystans + " km");
    }
}