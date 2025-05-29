package zadania;

import java.util.HashMap;
import java.util.Map;

public class zadanie3 {
    public static Map<String, Integer> liczenieWystapienSlow(String tekst){
        Map<String, Integer> mapa = new HashMap<>();

        String[] slowa = tekst.replaceAll("[^\\p{L}\\p{Z}]", "").split("\\s+");

        for(String slowo : slowa){
            if(!slowo.isEmpty()){
                mapa.put(slowo, mapa.getOrDefault(slowo, 0) + 1);
            }
        }
        return mapa;
    }
    public static void main(String[] args) {
        String tekst1 = "Ala ma kota, kot ma Alę";
        Map<String, Integer> wynik = liczenieWystapienSlow(tekst1);
        for(Map.Entry<String, Integer> entry : wynik.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println();

        String tekst2 = "Nie będzie Niemiec pluł nam w twarz, Ni dzieci nam germanił, Orężny wstanie hufiec nasz, Duch będzie nam hetmanił. Pójdziem, gdy zabrzmi złoty róg. Tak nam dopomóż Bóg!";
        Map<String, Integer> wynik2 = liczenieWystapienSlow(tekst2);
        for(Map.Entry<String, Integer> entry2 : wynik2.entrySet()){
            System.out.println(entry2.getKey() + " : " + entry2.getValue());
        }
    }
}
