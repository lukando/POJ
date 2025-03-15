package zadania;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A, B, C;
        System.out.println("Podaj po kolei długości boków A, B, C:");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();

        boolean odp = true;
        if(A + B < C){
            odp = false;
        }
        if(A + C < B){
            odp = false;
        }
        if(B + C < A){
            odp = false;
        }

        if(odp){
            System.out.println("tak");
        }
        else{
            System.out.println("nie");
        }
    }
}
