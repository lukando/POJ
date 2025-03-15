package zadania;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Miles   Kilometers");
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "       " + i * 1.609);
        }
    }
}
