package zadania;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj godzinę w Polsce (np. 21:37): ");
        String wprowadzonyCzas = scanner.nextLine();

        LocalTime czasPolska = LocalTime.parse(wprowadzonyCzas);
        LocalDate dataPolska = LocalDate.now();
        LocalDateTime Polska = LocalDateTime.of(dataPolska, czasPolska);

        ZonedDateTime polskaStrefaCzasowa = ZonedDateTime.of(Polska, ZoneId.of("Europe/Warsaw"));

        System.out.println("Wybierz kraj / miasto:");
        System.out.println("1. Nowy Jork");
        System.out.println("2. Tokio");
        System.out.println("3. Sydney");
        int wybor = scanner.nextInt();

        ZoneId targetZone;
        String miasto = "";
        switch (wybor) {
            case 1 -> {
                targetZone = ZoneId.of("America/New_York");
                miasto = "Nowy Jork";
            }
            case 2 -> {
                targetZone = ZoneId.of("Asia/Tokyo");
                miasto = "Tokio";
            }
            case 3 -> {
                targetZone = ZoneId.of("Australia/Sydney");
                miasto = "Sydney";
            }
            default -> {
                System.out.println("Niepoprawny wybór.");
                return;
            }
        }

        ZonedDateTime targetTime = polskaStrefaCzasowa.withZoneSameInstant(targetZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Godzina w " + miasto + ": " + targetTime.format(formatter));
    }
}
