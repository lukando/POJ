package zadania;

import java.util.regex.*;

class Lokal{
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private Integer numerDomu;
    private Integer numerLokalu;

    public Lokal(String nazwaLokalu, String adres){
        this.nazwaLokalu = nazwaLokalu;

        String regex = "(.+?)\\s(\\d+)(?:/(\\d+))?,\\s(\\d{2}-\\d{3})\\s(.+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(adres);

        if (matcher.matches()) {
            this.ulica = matcher.group(1).trim();
            this.numerDomu = Integer.parseInt(matcher.group(2));
            this.numerLokalu = matcher.group(3) != null ? Integer.parseInt(matcher.group(3)) : null;
            this.kodPocztowy = matcher.group(4);
            this.miejscowosc = matcher.group(5).trim();
        }
        else {
            throw new IllegalArgumentException("Nieprawidłowy format adresu!");
        }

    }

    public String toString(){
        String adres = this.nazwaLokalu;
        adres += "\n";
        adres += "Miasto: " + this.miejscowosc;
        adres += "\n";
        adres += "Ulica: " + this.ulica;
        adres += "\n";
        adres += "Numer domu/lokalu: " + this.numerDomu;
        adres += "\n";
        adres += "Kod pocztowy: " + this.kodPocztowy;

        return adres;
    }
}

public class zadanie5 {
    public static void main(String[] args) {
        String adres = "Jana Kilińskiego 4, 80-452 Gdańsk";
        String nazwa = "Mąka i kawa";
        Lokal lokal = new Lokal(nazwa, adres);
        System.out.println(lokal);
    }
}
