package zadania;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy: ");
        int rozmiar = sc.nextInt();
        char tablica[] = new char[rozmiar];
        System.out.print("Podawaj po kolei znaki do tablicy: ");
        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < rozmiar; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}
