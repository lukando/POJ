package zadania;

import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int losowa_liczba = (int)(Math.random()*3);
        System.out.println("0 - kamień");
        System.out.println("1 - papier");
        System.out.println("2 - nożyce");
        System.out.println("Podaj liczbę 0-2: ");
        int liczba_uzytkownika = sc.nextInt();

        if(liczba_uzytkownika == 0){
            if(losowa_liczba == 0){
                System.out.println("Remis!");
            }
            else if(losowa_liczba == 1){
                System.out.println("Przegrałeś!");
            }
            else{
                System.out.print("Wygrałeś!");
            }
        }
        else if(liczba_uzytkownika == 1){
            if(losowa_liczba == 0){
                System.out.println("Wygrałeś!");
            }
            else if(losowa_liczba == 1){
                System.out.print("Remis!");
            }
            else{
                System.out.print("Przegrałeś!");
            }
        }
        else{
            if(losowa_liczba == 0){
                System.out.println("Przegrałeś!");
            }
            else if(losowa_liczba == 1){
                System.out.print("Wygrałeś!");
            }
            else{
                System.out.print("Remis!");
            }
        }
    }
}
