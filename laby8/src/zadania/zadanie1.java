package zadania;

import java.io.File;
import java.io.IOException;

class InformationProvider{
    void displayInformation(File file){
        System.out.println("Nazwa: " + file.getName());
        System.out.println("Ścieżka: " + file.getAbsolutePath());
        System.out.println("Czy jest plikiem: " + file.isFile());
        System.out.println("Czy jest katalogiem: " + file.isDirectory());
        System.out.println("Czy plik istnieje: " + file.exists());
    }
}

public class zadanie1 {
    public static void main(String[] args) {

        File exerciseKatalog = new File("exercise");
        if(!exerciseKatalog.exists()){
            exerciseKatalog.mkdir();
        }

        File plik1 = new File(exerciseKatalog, "plik1.txt");
        File plik2 = new File(exerciseKatalog, "plik2.txt");
        File plik3 = new File(exerciseKatalog, "plik3.txt");

        try {
            plik1.createNewFile();
            plik2.createNewFile();
            plik3.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        File katalog1 = new File(exerciseKatalog, "katalog1");
        File katalog2 = new File(exerciseKatalog, "katalog2");

        katalog1.mkdir();
        katalog2.mkdir();

        InformationProvider informacja = new InformationProvider();
        File[] pliki = {plik1, plik2, plik3, katalog1, katalog2};

        for(File f : pliki){
            informacja.displayInformation(f);
            System.out.println();
        }
    }
}