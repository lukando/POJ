package zadania;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj ilość wierszy: ");
        int wiersze = sc.nextInt();
        System.out.print("Podaj ilość kolumn: ");
        int kolumny = sc.nextInt();

        int[][] macierz1 = new int[wiersze][kolumny];
        int[][] macierz2 = new int[wiersze][kolumny];
        int[][] macierz3 = new int[wiersze][kolumny];

        System.out.print("Podaj wartości do macierzy1: ");
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                macierz1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Podaj wartości do macierzy2: ");
        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                macierz2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < wiersze; i++){
            for(int j = 0; j < kolumny; j++){
                macierz3[i][j] = macierz1[i][j] + macierz2[i][j];
                System.out.print(macierz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
