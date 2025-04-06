package zadania;

class kwadrat {
    double bok;

    kwadrat(double bok){
        this.bok = bok;
    }

    double obliczPole(){
        return bok * bok;
    }

    double obliczObwod(){
        return 4 * bok;
    }
}
public class zadanie1 {
    public static void main(String[] args) {
        kwadrat kwadrat = new kwadrat(5);
        System.out.println(kwadrat.obliczPole());
        System.out.println(kwadrat.obliczObwod());
    }
}