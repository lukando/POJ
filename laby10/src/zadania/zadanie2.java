package zadania;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> liczbyUzytkownika = new HashSet<>();
        Set<Integer> liczbyWylosowane = new HashSet<>();

        System.out.println("Musisz wybrać 6 różnych liczb z zakresu (1-49):");

        while(liczbyUzytkownika.size() < 6) {
            System.out.println("Stan wybranych liczb: " + liczbyUzytkownika.size() + "/6");
            System.out.println("Wybierz liczbę(1-49):");
            String input = sc.nextLine();
            System.out.println();
            try{
                int liczba = Integer.parseInt(input);
                if(liczba < 1 || liczba > 49) {
                    System.out.println("Liczba nie znajduje sie w zakresie 1-49!");
                }
                else if(liczbyUzytkownika.contains(liczba)) {
                    System.out.println("Liczba juz zostala podana! Wybierz inna!");
                }
                else{
                    liczbyUzytkownika.add(liczba);
                }
            }
            catch(NumberFormatException e) {
                System.out.println("To nie jest liczba!");
            }
        }

        Random rand = new Random();
        while(liczbyWylosowane.size() < 6){
            int wylosowanaLiczba = rand.nextInt(49) + 1;
            liczbyWylosowane.add(wylosowanaLiczba);
        }

        System.out.println("Twoje liczby: " + liczbyUzytkownika);
        System.out.println("Wylosowane liczby: " + liczbyWylosowane);

        Set<Integer> trafienia = new HashSet<>(liczbyUzytkownika);
        trafienia.retainAll(liczbyWylosowane);
        System.out.println("Trafienia: " + trafienia.size());
        System.out.println(trafienia);
    }
}
