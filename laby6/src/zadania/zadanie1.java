package zadania;

import java.util.AbstractCollection;

class pracownik{
    String imie, nazwisko;
    double dzienneWynagrodzenie;

    pracownik(String imie, String nazwisko, double dzienneWynagrodzenie){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dzienneWynagrodzenie = dzienneWynagrodzenie;
    }
}

class firma{
    pracownik[] pracownicy;

    firma(pracownik[] pracownicy){
        this.pracownicy = pracownicy;
    }

    double obliczMiesiecznyKosztFirmy(){
        double odp = 0;
        for(int i=0; i<pracownicy.length; i++){
            odp += pracownicy[i].dzienneWynagrodzenie;
        }
        return odp * 20;
    }

    double obliczRocznyKosztFirmy(){
        double odp = 0;
        for(int i=0; i<pracownicy.length; i++){
            odp += pracownicy[i].dzienneWynagrodzenie;
        }
        return odp * 20 * 12;
    }

    double obliczKosztFirmy(czas Czas){
        double dni = 0, miesiace = 0, lata = 0;

        for(int i=0; i<pracownicy.length; i++){
            lata += pracownicy[i].dzienneWynagrodzenie;
            miesiace += pracownicy[i].dzienneWynagrodzenie;
            dni += pracownicy[i].dzienneWynagrodzenie;
        }
        lata *= 20 * 12 * Czas.rok;
        miesiace *= 20 * Czas.miesiac;
        dni *= Czas.dzien;

        return dni + miesiace + lata;
    }
}

class czas{
    int rok, miesiac, dzien;

    czas(int rok, int miesiac, int dzien){
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }
}

public class zadanie1 {
    public static void main(String[] args) {
        pracownik[] Pracownicy = new pracownik[5];
        Pracownicy[0] = new pracownik("Anna", "Kowalska", 300);
        Pracownicy[1] = new pracownik("Jan", "Kowalski", 250);
        Pracownicy[2] = new pracownik("Aleksander", "Kowalski", 230);
        Pracownicy[3] = new pracownik("Adam", "Jankowski", 200);
        Pracownicy[4] = new pracownik("Otylia", "Wojciechowska", 600);

        firma ABC = new firma(Pracownicy);
        System.out.println(ABC.obliczMiesiecznyKosztFirmy());
        System.out.println(ABC.obliczRocznyKosztFirmy());

        czas time1 = new czas(3, 3, 3);
        czas time2 = new czas(0, 7, 19);
        czas time3 = new czas(10, 11, 13);

        System.out.println(ABC.obliczKosztFirmy(time1));
        System.out.println(ABC.obliczKosztFirmy(time2));
        System.out.println(ABC.obliczKosztFirmy(time3));
    }
}