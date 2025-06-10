import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class biblioteka{
    ArrayList<String>  Ksiazki = new ArrayList<>();
    ArrayList<String>  Autorzy = new ArrayList<>();
    ArrayList<Integer> Lata = new ArrayList<>();
    String nazwaPliku = "biblioteka.txt";
    File plik = new File(nazwaPliku);

    void initializeBiblioteka(){
        try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                String[] czesci = linia.split(";");

                if (czesci.length == 3) {
                    Ksiazki.add(czesci[0].trim());
                    Autorzy.add(czesci[1].trim());
                    try {
                        Lata.add(Integer.parseInt(czesci[2].trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Nieprawidłowy rok: " + czesci[2]);
                        Lata.add(0);  // lub inna domyślna wartość
                    }
                } else {
                    System.out.println("Błąd formatu w linii: " + linia);
                }
            }

        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    void pokazBiblioteke(){
        System.out.println();
        System.out.println("---  Zawartość biblioteki  ---");
        for (int i = 0; i < Ksiazki.size(); i++) {
            System.out.println(Ksiazki.get(i) + " — " + Autorzy.get(i) + " (" + Lata.get(i) + ")");
        }
    }

    void dodajKsiazke(){
        String nazwa, autor, rok_input;
        Scanner sc = new Scanner(System.in);
        System.out.println();

        boolean warunekNazwy = false;
        do{
            System.out.println("Podaj UNIKATOWĄ nazwę książki:");
            nazwa = sc.nextLine();
            nazwa.trim();
            boolean wystepuje = false;

            for(int i = 0; i < Ksiazki.size(); i++){

                if(Ksiazki.get(i).equalsIgnoreCase(nazwa)){
                    wystepuje = true;
                }
            }

            if(!wystepuje){
                warunekNazwy = true;
            }
            else{
                System.out.println("--------------------------------------------");
                System.out.println("Książka już występuje w naszej bibliotece!");
                System.out.println("--------------------------------------------");
            }
        }while(!warunekNazwy);

        System.out.println("Podaj autora:");
        autor = sc.nextLine();
        autor.trim();

        int rok = 0;
        boolean czyInputInt = false;
        while (!czyInputInt) {
            System.out.println("Podaj rok:");
            rok_input = sc.nextLine();
            rok_input.trim();

            if(czyInt(rok_input)){
                czyInputInt = true;
                rok = Integer.parseInt(rok_input);
            }
            else{
                System.out.println("To nie jest rok! Spróbuj jeszcze raz!");
            }
        }

        Ksiazki.add(nazwa);
        Autorzy.add(autor);
        Lata.add(rok);

        System.out.println("Dodano książkę: " + Ksiazki.get(Ksiazki.size() -1) +  " - " +  Autorzy.get(Autorzy.size() -1) + " (" + Lata.get(Lata.size() -1) + ")");
        System.out.println();
    }

    void usunKsiazke(){
        boolean ksiazkaWystepuje = false;
        int indeks = -1;
        String nazwa;
        Scanner sc = new Scanner(System.in);
        System.out.println();

        do{
            System.out.println("Podaj nazwę książki, którą chcesz usunąć:");
            nazwa = sc.nextLine();

            for(int i = 0; i < Ksiazki.size(); i++){
                if(Ksiazki.get(i).equalsIgnoreCase(nazwa)){
                    ksiazkaWystepuje = true;
                    indeks = i;
                }
            }

            if(!ksiazkaWystepuje){
                System.out.println("Nie posiadamy takiej książki!");
                System.out.println("Spróbuj jeszcze raz - 1");
                System.out.println("Przejdź dalej - 2");

                String input = sc.nextLine();
                if(!input.equals("1")){
                    ksiazkaWystepuje = true;
                }
            }
        }while(!ksiazkaWystepuje);

        if(indeks != -1){
            Ksiazki.remove(nazwa);
            Autorzy.remove(indeks);
            Lata.remove(indeks);
        }

        System.out.println("Pomyślnie usunięto książkę!");
    }

    boolean czyInt(String tekst){
        try {
            Integer.parseInt(tekst);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    void aktualizacjaBiblioteki() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(plik, false))) {
            for (int i = 0; i < Ksiazki.size(); i++) {
                String linia = Ksiazki.get(i) + ";" + Autorzy.get(i) + ";" + Lata.get(i);
                writer.write(linia);
                writer.newLine();
            }
            System.out.println("Zaktualizowano plik: " + nazwaPliku);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}

class uzytkownicy {
    ArrayList<String> listaUzytkownikow = new ArrayList<>();
    String nazwaPliku = "uzytkownicy.txt";
    File plik = new File(nazwaPliku);
    String zalogowany_uzytkownik;

    void initializeUzytkownicy(){
        try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                linia = linia.trim();
                if (!linia.isEmpty()) {
                    listaUzytkownikow.add(linia);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania użytkowników: " + e.getMessage());
        }
    }

    void wyswietlUzytkownikow(){
        System.out.println();
        System.out.println("Lista użytkowników:");

        for(int i = 0; i < listaUzytkownikow.size(); i++){
            System.out.println(listaUzytkownikow.get(i));
        }
    }

    void stworzNowegoUzytkownika(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        boolean czyNazwaZapisana = false;
        do{
            boolean nazwaWystepuje = false;

            System.out.println("Podaj unikatową nazwę użytkownika: ");
            String nazwaUzytkownika = sc.nextLine();
            nazwaUzytkownika.trim();

            for(int i = 0; i < listaUzytkownikow.size(); i++){
                if(listaUzytkownikow.get(i).equals(nazwaUzytkownika)){
                    nazwaWystepuje = true;
                }
            }

            if(nazwaWystepuje){
                System.out.println("-----------------------------------------");
                System.out.println("Podana nazwa użytkownika już jest zajęta!");
                System.out.println("Spróbuj jeszcze raz!");
                System.out.println("-----------------------------------------");
            }
            else{
                listaUzytkownikow.add(nazwaUzytkownika);
                czyNazwaZapisana = true;
            }
        }while(!czyNazwaZapisana);

        System.out.println("Pomyślnie dodano " + listaUzytkownikow.get(listaUzytkownikow.size()-1) + " do listy użytkowników!");
    }

    void usunUzytkownika(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        boolean usunietoUzytkownika = false;
        int indeks = -1;

        do{
            System.out.println("Podaj nazwę użytkownika:");
            String nazwaUzytkownika = sc.nextLine();

            for(int i = 0; i < listaUzytkownikow.size(); i++){
                if(listaUzytkownikow.get(i).equals(nazwaUzytkownika)){
                    indeks = i;
                }
            }

            if(indeks != -1){
                listaUzytkownikow.remove(indeks);
                usunietoUzytkownika = true;
                System.out.println("Pomyślnie usunięto użytkownika!");
            }
            else{
                System.out.println("Użytkownik nie istnieje!");
                System.out.println("Spróbuj jeszcze raz - 1");
                System.out.println("Przejdź dalej - 2");

                String input = sc.nextLine();
                if(!input.equals("1")){
                    usunietoUzytkownika = true;
                }
            }
        }while(!usunietoUzytkownika);
    }

    void aktualizacjaUzytkownikow() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(plik, false))) {
            for (String uzytkownik : listaUzytkownikow) {
                writer.write(uzytkownik);
                writer.newLine();
            }
            System.out.println("Zapisano użytkowników do pliku.");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu: " + e.getMessage());
        }
    }

    void logowanieLubRejestracja(){
        Scanner sc = new Scanner(System.in);
        boolean zalogowano = false;
        String input12;

        do{
            boolean InputJedenLubDwa = false;
            do{
                System.out.println("1 - Rejestracja");
                System.out.println("2 - Zaloguj się");
                input12 = sc.nextLine();

                if(input12.equals("1") ||  input12.equals("2")){
                    InputJedenLubDwa = true;
                }
            }while(!InputJedenLubDwa);

            if(input12.equals("1")){
                stworzNowegoUzytkownika();
                zalogowany_uzytkownik = listaUzytkownikow.get(listaUzytkownikow.size()-1);
                System.out.println("Witaj - " + zalogowany_uzytkownik);
            }
            else{
                boolean wybranoKonto = false;

                do{
                    wyswietlUzytkownikow();
                    System.out.println("Wybierz konto do którego chcesz się zalogować:");
                    String nazwa = sc.nextLine();
                    nazwa.trim();

                    boolean wystepuje = false;
                    for(int i = 0; i < listaUzytkownikow.size(); i++){
                        if(listaUzytkownikow.get(i).equals(nazwa)){
                            wystepuje = true;
                        }
                    }

                    if(wystepuje){
                        zalogowany_uzytkownik = nazwa;
                        System.out.println("Witaj - " + zalogowany_uzytkownik);
                        wybranoKonto = true;
                    }

                }while(!wybranoKonto);

            }
            zalogowano = true;
        }while(!zalogowano);
    }
}

class listaUlubionychKsiazek{
    String pathUzytkownika;
    ArrayList<String> listaUlubionychKsiazek = new ArrayList<>();
    File plik;

    void ogarnijPlik(String username){
        File folder = new File("uzytkownicy");
        if (!folder.exists()) {
            folder.mkdirs(); // tworzy folder jeśli nie istnieje
        }

        File plikUzytkownika = new File(folder, username + ".txt");

        try {
            if (!plikUzytkownika.exists()) {
                if (plikUzytkownika.createNewFile()) {
                    System.out.println("Utworzono plik dla użytkownika: " + plikUzytkownika.getPath());
                    pathUzytkownika =  plikUzytkownika.getPath();
                    plik =  new File(pathUzytkownika);
                } else {
                    System.out.println("Nie udało się utworzyć pliku.");
                }
            } else {
                System.out.println("Plik już istnieje: " + plikUzytkownika.getPath());
                pathUzytkownika =  plikUzytkownika.getPath();
                plik =  new File(pathUzytkownika);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas tworzenia pliku: " + e.getMessage());
        }
    }

    void InitializeListaUlubionychKsiazek(){
        try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                linia = linia.trim();
                if (!linia.isEmpty()) {
                    listaUlubionychKsiazek.add(linia);
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas wczytywania ulubionych książek: " + e.getMessage());
        }
    }

    void aktualizacjaUlubionychKsiazek(biblioteka b){
        ArrayList<String> usunieteKsiazki = new ArrayList<>();
        for(int i = 0; i < listaUlubionychKsiazek.size(); i++){
            String ulubionaKsiazka =  listaUlubionychKsiazek.get(i);
            boolean wystepuje = false;

            for(int j = 0; j < b.Ksiazki.size(); j++){
                if(ulubionaKsiazka.equals(b.Ksiazki.get(j))){
                    wystepuje = true;
                }
            }

            if(!wystepuje){
                usunieteKsiazki.add(ulubionaKsiazka);
            }
        }

        for(int i = 0; i < usunieteKsiazki.size(); i++){
            listaUlubionychKsiazek.remove(usunieteKsiazki.get(i));
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(plik, false))) {
            for (String uzytkownik : listaUlubionychKsiazek) {
                writer.write(uzytkownik);
                writer.newLine();
            }
            System.out.println("Zapisano listę ulubionych książek użytkownika do pliku.");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu: " + e.getMessage());
        }
    }

    void wyswietlUlubioneKsiazki(){
        System.out.println();
        if(listaUlubionychKsiazek.isEmpty()){
            System.out.println("Nie masz żadnych ulubionych książek");
        }
        else{
            System.out.println("Twoje ulubione książki:");

            for(int i = 0; i < listaUlubionychKsiazek.size(); i++){
                System.out.println(listaUlubionychKsiazek.get(i));
            }
        }
    }

    void DodajUlubionaKsiazke(biblioteka b){
        boolean dodanoKsiazke = false;
        System.out.println();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Podaj nazwę książki: ");
            String nazwa =  sc.nextLine();

            boolean wystepuje = false;
            for(int i = 0; i < b.Ksiazki.size(); i++){
                if(b.Ksiazki.get(i).equals(nazwa)){
                    wystepuje = true;
                }
            }

            if(wystepuje){
                listaUlubionychKsiazek.add(nazwa);
                System.out.println("Pomyślnie dodano: " + listaUlubionychKsiazek.get(listaUlubionychKsiazek.size()-1) + " do twojej listy ulubionych książek");
                dodanoKsiazke = true;
            }
            else{
                System.out.println("Nie posiadamy takiej książki!");
                System.out.println("Spróbuj jeszcze raz!");
            }
        }while(!dodanoKsiazke);
    }

    void UsunUlubionaKsiazke(){
        boolean usunietoKsiazke = false;
        System.out.println();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Podaj nazwę książi którą chcesz usunąć:");
            String nazwa =  sc.nextLine();

            boolean wystepuje = false;
            for(int i = 0; i < listaUlubionychKsiazek.size(); i++){
                if(listaUlubionychKsiazek.get(i).equals(nazwa)){
                    wystepuje = true;
                }
            }

            if(wystepuje){
                listaUlubionychKsiazek.remove(nazwa);
                System.out.println("Pomyślnie usunięto książkę!");
            }
            else{
                System.out.println("Nie posiadamy książki z wprowadzoną nazwą!");
                usunietoKsiazke = true;
            }
        }while(!usunietoKsiazke);
    }
}

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        biblioteka b = new biblioteka();
        b.initializeBiblioteka();
        uzytkownicy u = new uzytkownicy();
        u.initializeUzytkownicy();

        u.logowanieLubRejestracja();
        listaUlubionychKsiazek LUK = new listaUlubionychKsiazek();
        LUK.ogarnijPlik(u.zalogowany_uzytkownik);
        LUK.InitializeListaUlubionychKsiazek();
        do{
            System.out.println();

            System.out.println("1 - UŻYTKOWNICY");
            System.out.println("2 - BIBLIOTEKA");
            System.out.println("3 - LISTA ULUBIONYCH KSIĄŻEK");
            System.out.println("4 - KONIEC PROGRAMU");

            String mainInput =  scanner.nextLine();
            switch (mainInput) {
                case "1":
                    System.out.println();
                    System.out.println("1 - Wyświetlanie użytkowników");
                    System.out.println("2 - Stwórz nowego użytkownika");
                    System.out.println("3 - Usuń Użytkownika");
                    System.out.println("ANYTHING ELSE -  powrót do menu");
                    String secondInput1 = scanner.nextLine();

                    switch (secondInput1) {
                        case "1":
                            u.wyswietlUzytkownikow();
                            break;
                        case "2":
                            u.stworzNowegoUzytkownika();
                            break;
                        case "3":
                            u.usunUzytkownika();
                            break;
                        default:
                            break;
                    }

                    break;
                case "2":
                    System.out.println();
                    System.out.println("1 - Wyświetlanie biblioteki");
                    System.out.println("2 - Dodaj nową książkę");
                    System.out.println("3 - Usuń książkę");
                    System.out.println("ANYTHING ELSE -  powrót do menu");

                    String secondInput2 = scanner.nextLine();
                    switch (secondInput2) {
                        case "1":
                            b.pokazBiblioteke();
                            break;
                        case "2":
                            b.dodajKsiazke();
                            break;
                        case "3":
                            b.usunKsiazke();
                            break;
                        default:
                            break;
                    }

                    break;
                case "3":
                    System.out.println();
                    System.out.println("1 - Wyświetlanie listy ulubionych książek");
                    System.out.println("2 - Dodaj nową ulubioną książkę");
                    System.out.println("3 - Usuń ulubioną książkę");
                    System.out.println("ANYTHING ELSE -  powrót do menu");

                    String secondInput3 = scanner.nextLine();

                    switch (secondInput3) {
                        case "1":
                            LUK.wyswietlUlubioneKsiazki();
                            break;
                        case "2":
                            LUK.DodajUlubionaKsiazke(b);
                            break;
                        case "3":
                            LUK.UsunUlubionaKsiazke();
                            break;
                        default:
                            break;
                    }

                    break;
                case "4":
                    b.aktualizacjaBiblioteki();
                    u.aktualizacjaUzytkownikow();
                    LUK.aktualizacjaUlubionychKsiazek(b);

                    System.out.println();
                    System.out.println("Dziękujemy za skorzystanie z programu!");
                    System.out.println("Do zobaczenia!");

                    run = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Podano złe dane!");

                    break;
            }
        }while(run);
    }
}