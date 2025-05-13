package zadania;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class zadanie4 {
    public static void main(String[] args) {
        File inbound = new File("inbound");
        File outbound = new File("outbound");

        if (!inbound.exists() || !outbound.exists()) {
            System.out.println("Katalogi 'inbound' i 'outbound' muszą istnieć!");
            return;
        }
        File[] pliki = inbound.listFiles();
        if (pliki == null || pliki.length == 0) {
            System.out.println("Brak plików w katalogu 'inbound'.");
            return;
        }
        DateTimeFormatter formatowanieDaty = DateTimeFormatter.ofPattern("yyyyMMdd");

        for (File plik : pliki) {
            if (plik.isFile()) {
                try {
                    String zawartosc = new String(Files.readAllBytes(plik.toPath()));
                    zawartosc = zawartosc.replace(" ", "_");

                    zawartosc = przesuwanieLiterO3(zawartosc);

                    String bazowaNazwa = plik.getName();

                    String nazwa = bazowaNazwa + "_" + LocalDate.now().format(formatowanieDaty) + ".out";

                    File outputFile = new File(outbound, nazwa);

                    Files.write(outputFile.toPath(), zawartosc.getBytes());
                    Files.delete(plik.toPath());

                    System.out.println("Przetworzono plik: " + bazowaNazwa);

                }
                catch (IOException e) {
                    System.out.println("Błąd przetwarzania pliku: " + plik.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    static String przesuwanieLiterO3(String wyraz) {
        StringBuilder wynik = new StringBuilder();

        for(int i = 0; i < wyraz.length(); i++){
            char litera = wyraz.charAt(i);
            if (litera >= 'a' && litera <= 'z') {
                char literaPo = (char)(litera + 3);
                if (literaPo > 'z') {
                    literaPo = (char)(literaPo - 26);
                }
                wynik.append(literaPo);
            }

            else if (litera >= 'A' && litera <= 'Z') {
                char literaPo = (char)(litera + 3);
                if (literaPo > 'Z') {
                    literaPo = (char)(literaPo - 26);
                }
                wynik.append(literaPo);
            }
            else {
                wynik.append(litera);
            }
        }

        return wynik.toString();
    }
}
