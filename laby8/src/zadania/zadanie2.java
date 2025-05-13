package zadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class zadanie2 {
    public static void main(String[] args) {

        File plik = new File("input.txt");

        int suma = 0, nrLinijki = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(plik))) {
            String line;

            while ((line = br.readLine()) != null) {


                if (nrLinijki % 2 == 1) {
                    try {
                        int liczba = Integer.parseInt(line.trim());
                        suma += liczba;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Niepoprawna liczba w linii " + nrLinijki + ": " + line);
                    }
                }

                nrLinijki++;
            }


            System.out.println("Suma co drugiej linijki: " + suma);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}