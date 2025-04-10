package zadania;

import java.util.Random;
import java.util.Scanner;

class Moneta{
    Random random = new Random();

    String rzut(){
        if(random.nextBoolean()){
            return "Orzeł";
        }
        else{
            return "Reszka";
        }
    }
}

class Symulacja{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moneta moneta = new Moneta();

        System.out.println("Podaj ilość rzutów:");
        int liczba = sc.nextInt();

        int licznikOrzel = 0, licznikReszka = 0;

        for(int i = 0; i < liczba; i++){
            String rzut = moneta.rzut();
            if(rzut == "Orzeł"){
                licznikOrzel++;
            }
            else{
                licznikReszka++;
            }
        }

        double procentOrzel = (licznikOrzel * 100.0) / liczba;
        double procentReszka = (licznikReszka * 100.0) / liczba;

        System.out.println("Orzeł: " + procentOrzel + "%");
        System.out.println("Reszka: " + procentReszka + "%");
    }
}

