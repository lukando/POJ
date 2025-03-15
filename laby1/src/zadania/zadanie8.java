package zadania;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int liczba1;
        int liczba2;
        int liczba3;

        System.out.print("Podaj liczbę 1, 2 oraz 3: ");
        liczba1 = sc.nextInt();
        liczba2 = sc.nextInt();
        liczba3 = sc.nextInt();
        int[] tablica = new int[3];
        tablica[0] = liczba1;
        tablica[1] = liczba2;
        tablica[2] = liczba3;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 1; j < tablica.length; j++) {
                if(tablica[j - 1] < tablica[j]){
                    int magazyn = tablica[j - 1];
                    tablica[j - 1] = tablica[j];
                    tablica[j] = magazyn;
                }
            }
        }

        for(int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
    }
}
