package zadania;

enum Znak {
    SPOLGLOSKA,
    SAMOGLOSKA,
    SPACJA,
    LICZBA,
    ZNAK_SPECJALNY
}

public class zadanie6 {
    public static String usunZnaki(String tekst, Znak znak){
        StringBuilder wynik = new StringBuilder();
        for(char c : tekst.toCharArray()){
            if(!czyZnak(c, znak)) {
                wynik.append(c);
            }
        }

        return wynik.toString();
    }

    public static String podmienZnaki(String tekst, Znak znak, String podmien){
        StringBuilder wynik = new StringBuilder();
        for(char c : tekst.toCharArray()){
            if(czyZnak(c, znak)) {
                wynik.append(podmien);
            }
            else{
                wynik.append(c);
            }
        }

        return wynik.toString();
    }

    public static String pozostawZnaki(String tekst, Znak znak){
        StringBuilder wynik = new StringBuilder();
        for(char c : tekst.toCharArray()){
            if(czyZnak(c, znak)) {
                wynik.append(c);
            }
        }
        return wynik.toString();
    }

    public static boolean czyZnak(char c, Znak znak){
        switch(znak){
            case SPOLGLOSKA:
            return Character.isLetter(c) && !"AEIOUYĄĘaeiouyąę".contains(String.valueOf(c));
            case SAMOGLOSKA:
                return "AEIOUYĄĘaeiouyąę".contains(String.valueOf(c));
            case SPACJA:
                return Character.isWhitespace(c);
            case LICZBA:
                return Character.isDigit(c);
            case ZNAK_SPECJALNY:
                return !Character.isLetterOrDigit(c) && !Character.isWhitespace(c);
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String tekst = "123 Test!@#";

        System.out.println("Usuń liczby: " + zadanie6.usunZnaki(tekst, Znak.LICZBA));
        System.out.println("Podmień liczby: " + zadanie6.podmienZnaki(tekst, Znak.LICZBA, "$"));
        System.out.println("Pozostaw tylko liczby: " + zadanie6.pozostawZnaki(tekst, Znak.LICZBA));
        System.out.println("Pozostaw tylko samogłoski: " + zadanie6.pozostawZnaki(tekst, Znak.SAMOGLOSKA));
    }
}
