package zadania;

class Animal {
    String name, color;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class Cat extends Animal {
    Cat(String name, String color) {
        super(name, color);
    }

    void makeSound() {
        System.out.println("Miau!");
        System.out.println("Imie: " + this.name);
        System.out.println("Kolor: " + this.color);
    }
}

class Dog extends Animal {
    Dog(String name, String color) {
        super(name, color);
    }

    void makeSound() {
        System.out.println("Hau!");
        System.out.println("Imie: " + this.name);
        System.out.println("Kolor: " + this.color);
    }
}

public class zadanie1 {
    public static void main(String[] args) {
        Cat kot = new Cat("Adam", "Rudy");
        Dog pies = new Dog("Tobi", "Beżowy");

        pies.makeSound();
        kot.makeSound();
    }
}
