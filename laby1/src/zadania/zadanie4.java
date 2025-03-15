package zadania;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String imie = "";
        int punkty_studenta = -1;
        int liczba_studentow = 0;

        System.out.println("Podaj liczbę studentów:");
        liczba_studentow = input.nextInt();
        for(int i = 0; i < liczba_studentow; i++){
            System.out.println("Podaj imię studenta:");
            String magazyn_imie = input.next();
            System.out.println("Podaj liczbę uzyskanych punktów studenta:");
            int magazyn_punktów = input.nextInt();

            if(magazyn_punktów > punkty_studenta){
                punkty_studenta = magazyn_punktów;
                imie = magazyn_imie;
            }
        }
        System.out.println("Najlepszy student to: " + imie + ", który zdobył " + punkty_studenta + " punktów!");
    }
}
