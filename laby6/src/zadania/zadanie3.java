package zadania;

class MojaData{
    int dzien, miesiac, rok;

    MojaData(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    void metodaA(){
        System.out.println(dzien + "." + miesiac + "." + rok);
    }

    void metodaB(){
        if(dzien < 10){
            System.out.print("0");
        }
        System.out.print(dzien + ".");
        if(miesiac < 10){
            System.out.print("0");
        }
        System.out.println(miesiac + "." + rok);
    }

    void metodaC(){
        String month;
        switch(miesiac){
            case 1:
                month = "sty";
                break;
            case 2:
                month = "lut";
                break;
            case 3:
                month = "mar";
                break;
            case 4:
                month = "kwi";
                break;
            case 5:
                month = "maj";
                break;
            case 6:
                month = "cze";
                break;
            case 7:
                month = "lip";
                break;
            case 8:
                month = "sie";
                break;
            case 9:
                month = "wrz";
                break;
            case 10:
                month = "paź";
                break;
            case 11:
                month = "lis";
                break;
            case 12:
                month = "gru";
                break;
            default:
                month = "NIEPOPRAWNE DANE";
                break;
        }
        System.out.println(dzien + " " + month + " " + rok);
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        MojaData A = new MojaData(3, 4, 2022);
        A.metodaA();
        A.metodaB();
        A.metodaC();
    }
}
