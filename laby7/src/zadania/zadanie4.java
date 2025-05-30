package zadania;

import static java.lang.Character.toLowerCase;

public class zadanie4 {
    public static void analizaTekstu(String tekst){
        int liczbaLiter = 0;
        int liczbaSamoglosek = 0;
        int liczbaSpolglosek = 0;
        int liczbaBialychZnakow = 0;
        int liczbaLiczb = 0;
        int liczbaInnychZnakow = 0;

        for(int i = 0; i < tekst.length(); i++){
            char litera = tekst.charAt(i);

            if(Character.isLetter(litera)){
                liczbaLiter++;

                litera = toLowerCase(litera);
                if(litera=='i' || litera == 'a' || litera == 'e' || litera == 'u' || litera == 'y' || litera == 'o'){
                    liczbaSamoglosek++;
                }
                else{
                    liczbaSpolglosek++;
                }
            }
            else if(Character.isDigit(litera)){
                liczbaLiczb++;
            }
            else if(Character.isWhitespace(litera)){
                liczbaBialychZnakow++;
            }
            else{
                liczbaInnychZnakow++;
            }

        }
        System.out.println("Podany tekst: " + tekst + ", zawiera:");
        System.out.println(liczbaLiter + " liter, w tym " + liczbaSamoglosek + " samogłosek oraz " + liczbaSpolglosek + " spółgłosek");
        System.out.println(liczbaBialychZnakow + " bialych znakow");
        System.out.println(liczbaLiczb + " liczb");
        System.out.println(liczbaInnychZnakow + " innych znakow");
    }

    public static void main(String[] args) {

        String slowo1 = "arbuz", slowo2 = "Ala ma 57 czarnych *+- kotow";
        analizaTekstu(slowo1);
        System.out.println();
        analizaTekstu(slowo2);
        System.out.println();
    }
}
