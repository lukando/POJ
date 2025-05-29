package zadania;

import java.util.*;

public class zadanie1 {
    public static <T> void wyswietlanieDuplikacji(List<T> list) {
        Set<T> widziane = new HashSet<>();
        Set<T> powtorki = new HashSet<>();

        for(T element : list){
            if(!widziane.add(element)){
                powtorki.add(element);
            }
        }

        System.out.println("Zduplikowane elementy: " + powtorki);
    }


    public static <T> List<T> usuwanieDuplikacji(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args)
    {
        List<Integer> test = Arrays.asList(1,2,2,2,3,4,5,5,6,7,7,8,9,10);
        wyswietlanieDuplikacji(test);
        List<Integer> test2 = usuwanieDuplikacji(test);
        System.out.println(test2);
    }
}