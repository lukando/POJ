package zadania;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int liczba = 0;
        do{
            System.out.print("Podaj liczbę(1-7): ");
            liczba = input.nextInt();
        }while(liczba < 1 || liczba > 7);

        if(liczba == 1){
            System.out.print("Poniedziałek");
        } else if (liczba == 2) {
            System.out.print("Wtorek");
        }else if (liczba == 3) {
            System.out.print("Środa");
        }else if (liczba == 4) {
            System.out.print("Czwartek");
        }else if (liczba == 5) {
            System.out.print("Piątek");
        }else if (liczba == 6) {
            System.out.print("Sobota");
        }else {
            System.out.println("Niedziela");
        }
    }
}
