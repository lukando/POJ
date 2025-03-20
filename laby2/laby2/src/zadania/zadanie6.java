package zadania;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = sc.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = sc.nextInt();

        int max_dzielnik = 0;
        if(liczba1 > liczba2){
            for(int i = 1; i <= liczba2; i++){
                if(liczba1 % i == 0 && liczba2 % i == 0){
                    max_dzielnik = i;
                }
            }
        }
        else{
            for(int i = 1; i <= liczba1; i++){
                if(liczba2 % i == 0 && liczba1 % i == 0){
                    max_dzielnik = i;
                }
            }
        }

        System.out.print("Największy wspólny dzielnik to: " + max_dzielnik);
    }
}
