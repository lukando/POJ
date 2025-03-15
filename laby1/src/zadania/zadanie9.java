package zadania;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2;
        System.out.print("Podaj po kolei x1, y1, x2, y2: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        double odpowiedz = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Odległość pomiędzy punktami wynosi: " + odpowiedz);
    }
}
