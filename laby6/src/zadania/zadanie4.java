package zadania;

class Czas{
    int godziny, minuty;

    Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    public String toString(){
        return godziny + "h " + minuty + "min";
    }

    Czas dodaj(Czas czas){
        int noweGodziny = 0, noweMinuty = 0;

        noweMinuty += this.minuty + czas.minuty;
        noweMinuty += (czas.godziny * 60) + (this.godziny * 60);

        while(noweMinuty >= 60){
            noweMinuty -= 60;
            noweGodziny++;
        }

        Czas odpowiedz = new Czas(noweGodziny, noweMinuty);
        return odpowiedz;
    }

    Czas odejmij(Czas czas){
        int noweGodziny, noweMinuty;
        noweGodziny = this.godziny - czas.godziny;
        noweMinuty = this.minuty - czas.minuty;

        if(noweMinuty < 0 && noweGodziny > 0){
            noweMinuty += 60;
            noweGodziny--;
        }

        Czas odpowiedz = new Czas(noweGodziny, noweMinuty);
        return odpowiedz;
    }

    Czas pomnoz(int mnoznik){
        int noweMinuty = 0, noweGodziny = 0;
        noweMinuty += this.minuty + (this.godziny * 60);
        noweMinuty *= mnoznik;

        while(noweMinuty >= 60){
            noweMinuty -= 60;
            noweGodziny++;
        }

        Czas odp = new Czas(noweGodziny, noweMinuty);
        return odp;
    }
}

public class zadanie4 {
    public static void main(String[] args) {
        Czas czas1 = new Czas(60,10);
        Czas czas2 = new Czas(20,20);

        System.out.println(czas1.dodaj(czas2));
        System.out.println(czas1.odejmij(czas2));
        System.out.println(czas1.pomnoz(20));
    }
}
