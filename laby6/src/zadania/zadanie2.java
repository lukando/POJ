package zadania;

class Pozycja{
    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;

    Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    double obliczWartosc(){
        return iloscSztuk * cenaSztuki;
    }

    public String toString(){
        return "Nazwa towaru: " + nazwaTowaru + ", Ilość Sztuk: " + iloscSztuk + ", Cena Sztuki: " + cenaSztuki;
    }
}

class Zamowienie{
    Pozycja[] pozycje;
    int maksRozmiar;
    private int liczbaPozycji;

    Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
        this.liczbaPozycji = 0;
        this.pozycje = new Pozycja[maksRozmiar];
    }

    Zamowienie() {
        this(10);
    }

    void dodajPozycje(Pozycja pozycja) {
        if(liczbaPozycji < maksRozmiar){
            pozycje[liczbaPozycji] = pozycja;
            liczbaPozycji++;
        }
        else{
            System.out.println("Nie można dodać więcej pozycji!");
        }
    }

    double obliczWartosc(){
        double odp = 0;
        for(int i = 0; i < liczbaPozycji; i++){
            odp += pozycje[i].obliczWartosc();
        }
        return odp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Zamówienie:\n");
        for (int i = 0; i < liczbaPozycji; i++) {
            sb.append(pozycje[i].toString()).append("\n");
        }
        sb.append(String.format("Razem: %.2f zł", obliczWartosc()));
        return sb.toString();
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        Zamowienie zamowienie1 = new Zamowienie();

        zamowienie1.dodajPozycje(new Pozycja("Chleb", 2, 2));
        zamowienie1.dodajPozycje(new Pozycja("Banany", 1, 6));

        System.out.println(zamowienie1);
    }
}
