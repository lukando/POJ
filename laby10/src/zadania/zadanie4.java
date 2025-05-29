package zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class zadanie4 {
    public static Map<String, Set<Integer>> skorowidzLiterowy(String tekst){
        Map<String, Set<Integer>> mapa = new HashMap<>();
        String[] litery = tekst.split("");
        for(int i = 0; i < litery.length; i++){
            String litera = litery[i];
            mapa.computeIfAbsent(litera, k -> new HashSet<>());
            mapa.get(litera).add(i);
        }
        return mapa;
    }
    public static void main(String[] args) {
        String tekst1 = "Hello";
        Map<String, Set<Integer>> wynik1 = skorowidzLiterowy(tekst1);
        for(Map.Entry<String, Set<Integer>> entry1 : wynik1.entrySet()){
            System.out.println(entry1.getKey() + " -> " + entry1.getValue());
        }

        System.out.println();
        System.out.println();


        String tekst2 = "Hello World! This is Lukasz speaking!";
        Map<String, Set<Integer>> wynik2 = skorowidzLiterowy(tekst2);
        for(Map.Entry<String, Set<Integer>> entry2 : wynik2.entrySet()){
            System.out.println(entry2.getKey() + " -> " + entry2.getValue());
        }
    }
}
