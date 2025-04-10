package zadania;

public class karta {
    final kolor k;
    final figura f;

    public karta(kolor k, figura f) {
        this.k = k;
        this.f = f;
    }

    @Override
    public String toString() {
        return f + " " + k;
    }
}
