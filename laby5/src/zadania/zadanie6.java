package zadania;

class Calculator{
    double calculate(double a){
        return Math.pow(a, 2);
    }

    double calculate(double a, double b){
        return a * b;
    }

    double calculate(double a, double b, double c){
        return a + b + c;
    }
}

public class zadanie6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(5));
        System.out.println(calculator.calculate(5, 10));
        System.out.println(calculator.calculate(5, 10, 20));
    }
}
