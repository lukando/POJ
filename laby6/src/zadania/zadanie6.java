package zadania;

public class zadanie6 {
    public static void main(String[] args) {

        String wynik = usunCoNty(2, "Ala", "nie", "ma", "test", "kota", "psa", "i", "papugę", "psa");
        System.out.println(wynik);
    }

    public static String usunCoNty(int nty, String... slowa) {
        StringBuilder wynik = new StringBuilder();

        for (int i = 0; i < slowa.length; i++) {
            if ((i + 1) % nty != 0) {
                wynik.append(slowa[i]);
                wynik.append(" ");
            }
        }

        return wynik.toString();
    }
}
