package zadania;

import java.util.Scanner;

class Osoba{
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        if (imie == null || imie.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe imię!");
        }
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new Exception("Podano niewłaściwe nazwisko!");
        }
        if (rokUrodzenia < 1900 || rokUrodzenia > 2020) {
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }

    public String toString() {
        return "Osoba: " + imie + " " + nazwisko + ", Rok urodzenia: " + rokUrodzenia;
    }



}

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Osoba osoba = null;

        while (osoba == null) {
            try {
                System.out.print("Podaj imię: ");
                String imie = scanner.nextLine();

                System.out.print("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine();

                System.out.print("Podaj rok urodzenia: ");
                int rok = Integer.parseInt(scanner.nextLine());

                osoba = new Osoba(imie, nazwisko, rok);
                System.out.println("Utworzono osobę: " + osoba);

            } catch (Exception e) {
                System.out.println("Błąd: " + e.getMessage());
                System.out.println("Spróbuj ponownie.\n");
            }
        }

        scanner.close();
    }
}