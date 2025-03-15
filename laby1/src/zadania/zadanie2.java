package zadania;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double stopniecelsjusza;
        System.out.println("Podaj stopnie celsjusza: ");
        stopniecelsjusza = input.nextInt();
        double Fahrenheity = ((9.0 / 5.0) * stopniecelsjusza) + 32.0;
        System.out.println("Fahrenheity: " + Fahrenheity);
    }
}
