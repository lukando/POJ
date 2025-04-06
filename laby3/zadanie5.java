package zadania;

import java.util.Scanner;

class konto{
    int ID;
    double iloscPieniedzy;
    void stanKonta(){
        System.out.println(this.iloscPieniedzy);
    }
    void wplacanieSrodkow(double pieniadze){
        this.iloscPieniedzy += pieniadze;
        System.out.println("Stan konta: " + this.iloscPieniedzy);
    }
    void wyplacanieSrodkow(double pieniadze){
        if(pieniadze > this.iloscPieniedzy){
            System.out.println("Kwota przewyższa stan konta, nie można wypłacić");
        }
        else{
            this.iloscPieniedzy -= pieniadze;
            System.out.println("Stan konta: " + this.iloscPieniedzy);
        }
    }
}

public class zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        konto[] konta = new konto[10];
        for(int i = 0; i < 10; i++){
            konta[i] = new konto();
            konta[i].iloscPieniedzy = 100.00;
            konta[i].ID = i;
        }

        while(true){
            System.out.print("Enter an ID:");
            int id = sc.nextInt();

            if(id < 0 && id >= 10){
                System.out.print("Incorrect ID!");
                continue;
            }

            konto wybraneKonto = konta[id];

            while(true){
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");

                System.out.print("Enter a choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                   wybraneKonto.stanKonta();
                } else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    wybraneKonto.wyplacanieSrodkow(amount);
                } else if (choice == 3) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    wybraneKonto.wplacanieSrodkow(amount);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Wrong input!");
                }
            }
        }
    }
}
