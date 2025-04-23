package zadania;

public class zadanie7 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] c = {6};

        int suma = sumujTablice(a, b, c);
        System.out.println("Suma wszystkich elementów: " + suma);
    }

    public static int sumujTablice(int[]... tablice) {
        int suma = 0;
        for (int[] tablica : tablice) {
            for (int liczba : tablica) {
                suma += liczba;
            }
        }
        return suma;
    }
}
