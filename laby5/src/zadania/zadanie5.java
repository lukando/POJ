package zadania;

class A{
    void present(String abc){
        System.out.println(abc);
    }
}

class B extends A{
    void present(String abc){
        super.present(abc);
    }
}

class C extends B{
    void present(String abc){
        super.present(abc);
    }
}

class D extends C{
    void present(String abc){
        super.present(abc);
    }
}

class E extends D{
    void present(String abc){
        super.present(abc);
    }
}

public class zadanie5 {
    public static void main(String[] args) {
        E e = new E();
        e.present("Komunikat z klasy A wywołany przez klasę E!");
    }
}
