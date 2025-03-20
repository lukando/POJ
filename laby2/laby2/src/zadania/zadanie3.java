package zadania;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablic: ");
        int rozmiar_tablic = sc.nextInt();

        int tablica1[] = new int[rozmiar_tablic];
        int tablica2[] = new int[rozmiar_tablic];
        int tablica3[] = new int[rozmiar_tablic];

        for(int i = 0; i < rozmiar_tablic; i++){
            tablica1[i] = sc.nextInt();
        }
        for(int i = 0; i < rozmiar_tablic; i++){
            tablica2[i] = sc.nextInt();
        }
        System.out.print("\n");
        for(int i = 0; i < rozmiar_tablic; i++){
            tablica3[i] = tablica1[i] + tablica2[i];
            System.out.print(tablica3[i] + " ");
        }
    }
}
