package zadania;

import java.util.Scanner;

class Gracz{
    int health, damage;

    void wybieranieBroni(int wybor){
        switch(wybor){
            case 1:
                this.damage = 1;
                break;
            case 2:
                this.damage = 2;
                break;
            case 3:
                this.damage = 4;
                break;
            case 4:
                this.damage = 6;
                break;
            case 5:
                this.damage = 10;
                break;
        }
    }

    void wybranieZbroi(int wybor){
        switch(wybor){
            case 1:
                this.health = 10;
                break;
            case 2:
                this.health = 20;
                break;
            case 3:
                this.health = 40;
                break;
        }
    }

    void rozgrywkaWalki(Przeciwnik przeciwnik){
        boolean koniecWalki = false;

        while(!koniecWalki){
            System.out.println("Gracz atakuje!");
            przeciwnik.health -= this.damage;

            if(przeciwnik.health > 0) {
                System.out.println("Przeciwnik atakuje!");
                this.health -= przeciwnik.damage;
            }

            if(this.health <= 0 || przeciwnik.health <= 0){
                koniecWalki = true;
            }
        }

        if(przeciwnik.health <= 0){
            System.out.println("Gracz wygrał!");
        }
        else{
            System.out.println("Przeciwnik wygrał!");
        }
    }
}

class Przeciwnik{
    int health, damage, poziomTrudnosci;

    void wybieraniePoziomTrudnosci(int wybor){
        switch(wybor){
            case 1:
                this.health = 3;
                this.damage = 1;
                break;
            case 2:
                this.health = 15;
                this.damage = 1;
                break;
            case 3:
                this.health = 20;
                this.damage = 3;
            case 4:
                this.health = 30;
                this.damage = 5;
        }
    }
}

public class zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gracz gracz = new Gracz();
        Przeciwnik przeciwnik = new Przeciwnik();
        boolean wybranoBron = false, wybranoZbroje = false, wybranoPoziomTrudnosci = false;

        while(!wybranoBron){
            System.out.println("Wybieranie Broni");
            System.out.println("1 - Patyk");
            System.out.println("2 - Pałka");
            System.out.println("3 - Młot");
            System.out.println("4 - Miecz");
            System.out.println("5 - Pistolet");
            int wybor = sc.nextInt();
            if(wybor >= 1 && wybor <= 5){
                gracz.wybieranieBroni(wybor);
                wybranoBron = true;
            }
        }

        while(!wybranoZbroje){
            System.out.println("Wybieranie Zbroi!");
            System.out.println("1 - Brak");
            System.out.println("2 - Wykonana ze skóry");
            System.out.println("3 - Wykonana z żelaza");
            int wybor = sc.nextInt();

            if(wybor >= 1 && wybor <= 3){
                gracz.wybranieZbroi(wybor);
                wybranoZbroje = true;
            }
        }

        while(!wybranoPoziomTrudnosci){
            System.out.println("Wybieranie poziomu trudności!");
            System.out.println("1 - Samouczek");
            System.out.println("2 - Łatwy");
            System.out.println("3 - Średni");
            System.out.println("4 - Trudny");
            int wybor = sc.nextInt();

            if(wybor >= 1 && wybor <= 4){
                przeciwnik.wybieraniePoziomTrudnosci(wybor);
                wybranoPoziomTrudnosci = true;
            }
        }

        gracz.rozgrywkaWalki(przeciwnik);
    }
}
