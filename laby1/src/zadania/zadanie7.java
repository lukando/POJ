package zadania;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char litera1;
        char litera2;
        System.out.print("Podaj po kolei literę 1 oraz 2: ");
        litera1=sc.next().charAt(0);
        litera2=sc.next().charAt(0);

        if(litera1 > litera2){
            System.out.print(litera1);
        }
        else if(litera2 > litera1){
            System.out.print(litera2);
        }
        else{
            System.out.print(litera1 + ": Występuje 2 razy");
        }

    }
}
