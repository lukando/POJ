package zadania;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy, a następnie pierwszy element: ");
        int rozmiar = sc.nextInt();
        int pierwszy_element = sc.nextInt();
        int elementy = 0;

        if(pierwszy_element % 2 == 0) {
            elementy = pierwszy_element + 2;
        }
        else{
            elementy = pierwszy_element + 1;
        }

        int tablica[] = new int[rozmiar];
        for (int i = 0; i < rozmiar; i++) {
            if(i == 0){
                tablica[i] = pierwszy_element;
            }
            else{
                tablica[i] = elementy;
                elementy += 2;
            }
        }

        for(int i = 0; i < rozmiar; i++){
            System.out.print(tablica[i] + " ");
        }

        int suma = 0;
        for(int i = 0; i < rozmiar; i++){
            suma += tablica[i];
        }

        double srednia = 0;
        for(int i = 0; i < rozmiar; i++){
            srednia += tablica[i];
        }

        double mediana = 0;
        int indeks = 0;
        if(rozmiar % 2 == 0){
            indeks = rozmiar/2;
            mediana += tablica[indeks];
            indeks--;
            mediana += tablica[indeks];
            mediana /= 2;
        }
        else{
            indeks = (rozmiar - 1) / 2;
            mediana += tablica[indeks];
        }

        System.out.print("\n" + "min: " + tablica[0] + "\n");
        System.out.print("max: " + tablica[rozmiar-1] + "\n");
        System.out.print("suma: " + suma + "\n");
        System.out.print("średnia: " + srednia / rozmiar + "\n");
        System.out.print("mediana: " + mediana + "\n");
    }
}
