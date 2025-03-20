package zadania;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ilość wierszy: ");
        int wiersze = sc.nextInt();
        System.out.print("Podaj ilość kolumn: ");
        int kolumny = sc.nextInt();

        int[][] macierz = new int[wiersze][kolumny];
        System.out.print("Podaj wartości do macierzy: ");
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                macierz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < wiersze; i++){
            for(int j = 0; j < kolumny; j++){
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
