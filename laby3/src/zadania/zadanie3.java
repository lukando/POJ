package zadania;

class TV{
    int channel, volume;
    boolean on;

    TV(){
        this.channel = 1;
        this.volume = 1;
        this.on = false;
    }
}

class Remote{
    TV tv;

    Remote(TV tv){
        this.tv = tv;
    }

    void power(){
        if(tv.on){
            System.out.println("TV power off");
            tv.on = false;
        }
        else{
            System.out.println("TV power on");
            tv.on = true;
        }
    }

    void channelUp(){
        if(tv.on && tv.channel < 20){
            tv.channel++;
        }
    }

    void channelDown(){
        if(tv.on && tv.channel > 1){
            tv.channel--;
        }
    }

    void volumeUp(){
        if(tv.on && tv.volume < 20){
            tv.volume++;
        }
    }

    void volumeDown(){
        if(tv.on && tv.volume > 1){
            tv.volume--;
        }
    }

    void showStatus() {
        System.out.println("Channel: " + tv.channel + ", Volume: " + tv.volume + ", Power: " + tv.on);
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);
        remote.showStatus();
        remote.power();
        remote.channelUp();
        remote.volumeUp();
        remote.volumeUp();
        remote.channelUp();
        remote.showStatus();
        remote.power();
        remote.channelUp();
        remote.volumeDown();
        remote.showStatus();
    }
}
