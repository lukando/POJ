package zadania;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        try {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę:");
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik:");

            int licznik = convertToInteger(number);
            int dzielnik = convertToInteger(divider);

            int result = licznik / dzielnik;
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd: Wprowadź poprawne liczby całkowite!");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Błąd: Nie można dzielić przez zero!");
        }
    }

    private static int convertToInteger(String number) {
        return Integer.parseInt(number);
    }
}