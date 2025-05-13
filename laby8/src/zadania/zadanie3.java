package zadania;

import java.io.File;

public class zadanie3 {
    public static void main(String[] args) {
        File glownyKatalog = new File("basedir");
        File[] podKatalogi = glownyKatalog.listFiles(File::isDirectory);
        String katalogZNajwiecejPlikow = null;
        int maksPlikow = -1;

        for (File dir : podKatalogi) {
            File[] pliki = dir.listFiles(File::isFile);
            int licznik;
            if(pliki != null){
                licznik = pliki.length;
            }
            else{
                licznik = 0;
            }

            System.out.println("Katalog: " + dir.getName() + " - Plików: " + licznik);

            if (licznik > maksPlikow) {
                maksPlikow = licznik;
                katalogZNajwiecejPlikow = dir.getName();
            }
        }

        System.out.println();
        System.out.println("Katalog z największą liczbą plików: " + katalogZNajwiecejPlikow);
    }
}