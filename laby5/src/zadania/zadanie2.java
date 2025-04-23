package zadania;

class Shop {
    String address, size;

    Shop(String address, String size) {
        this.address = address;
        this.size = size;
    }

    String getInformation(){
        return "Address: " + address + ", Size: " + size;
    }
}

class Bookshop extends Shop {
    String[] products;

    Bookshop(String address, String size, String[] products) {
        super(address, size);
        this.products = products;
    }

    String getInformation(){
        StringBuilder build = new StringBuilder(super.getInformation());
        build.append(", Products: ");

        for(int i = 0; i < products.length; i++){
            build.append(products[i]);

            if(i < products.length - 1) {
                build.append(", ");
            }
        }
        return build.toString();
    }
}

class Bakery extends Shop {
    String[] products;

    Bakery(String address, String size, String[] products) {
        super(address, size);
        this.products = products;
    }

    String getInformation(){
        StringBuilder build = new StringBuilder(super.getInformation());
        build.append(", Products: ");

        for(int i = 0; i < products.length; i++){
            build.append(products[i]);

            if(i < products.length - 1) {
                build.append(", ");
            }
        }
        return build.toString();
    }
}

public class zadanie2 {
    public static void main(String[] args) {

        String[] ksiazki = {"Harry Potter", "The Hobbit", "Java"};
        Bookshop bookshop = new Bookshop("Grunwaldzka 1234", "420", ksiazki);

        String[] menu = {"Chleb", "Pączek", "Tiramisu"};
        Bakery bakery = new Bakery("Słowackiego 2121", "80", menu);

        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
