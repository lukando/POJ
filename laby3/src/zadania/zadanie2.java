package zadania;

class Punkt{
    double x, y;

    Punkt(){
        this.x = 0;
        this.y = 0;
    }

    Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    double odleglosc(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    double odleglosc(Punkt innyPunkt){
        return Math.sqrt(Math.pow(this.x - innyPunkt.x, 2) + Math.pow(this.y - innyPunkt.y, 2));
    }
}

public class zadanie2 {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(10, 20);
        Punkt p2 = new Punkt(9, 20);

        System.out.println("Odległość p1 do (0,0): " + p1.odleglosc(0, 0));
        System.out.println("Odległość p1 do p2: " + p1.odleglosc(p2));
    }
}
