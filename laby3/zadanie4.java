package zadania;

class Wiatrak{
    int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;

    Wiatrak(){
        this.speed = SLOW;
        this.on = true;
        this.radius = 20;
        this.color = "white";
    }
    Wiatrak(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    void informacje(){
        System.out.print("Prędkość: " + speed + " Włączony: " + on + " Radius: " + radius + " Kolor: " + color);
    }
}

public class zadanie4 {
    public static void main(String[] args) {
        Wiatrak w = new Wiatrak();
        w.informacje();
        Wiatrak w2 = new Wiatrak(2, true, 0, "red");
        w2.informacje();
    }
}
