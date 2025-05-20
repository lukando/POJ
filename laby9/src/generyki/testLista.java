package generyki;

public class testLista {
    public static void main(String[] args) {
        // Test dla Integer
        Lista<Integer> listaInt = new Lista<>(5);
        listaInt.dodaj(10);
        listaInt.dodaj(20);
        listaInt.dodaj(30);
        listaInt.dodaj(20);

        System.out.println("Lista int: " + listaInt);
        System.out.println("Czy zawiera 20? " + listaInt.czyZawiera(20));
        System.out.println("Pierwszy indeks 20: " + listaInt.zwrocIndeks(20));
        System.out.println("Ostatni indeks 20: " + listaInt.zwrocOstatniIndeks(20));
        System.out.println("Element na indeksie 2: " + listaInt.zwrocElement(2));
        System.out.println("Podmień indeks 2 na 99: " + listaInt.podmienElement(2, 99));
        System.out.println("Po podmianie: " + listaInt);

        // Test dla String
        Lista<String> listaStr = new Lista<>(3);
        listaStr.dodaj("Ala");
        listaStr.dodaj("Kot");
        listaStr.dodaj("Ala"); // duplikat

        System.out.println("\nLista string: " + listaStr);
        System.out.println("Czy zawiera 'Kot'? " + listaStr.czyZawiera("Kot"));
        System.out.println("Pierwszy indeks 'Ala': " + listaStr.zwrocIndeks("Ala"));
        System.out.println("Ostatni indeks 'Ala': " + listaStr.zwrocOstatniIndeks("Ala"));
        System.out.println("Element na indeksie 1: " + listaStr.zwrocElement(1));
    }
}