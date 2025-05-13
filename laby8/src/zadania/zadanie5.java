package zadania;

import java.time.LocalDate;

public class zadanie5 {
    public static void main(String[] args) {

        LocalDate teraz = LocalDate.now();
        int licznik = 0, rok = teraz.getYear();
        do{
            if(rok % 4 == 0){
                System.out.println(rok);
                licznik++;
            }
            rok++;
        }while(licznik != 100);
    }
}
