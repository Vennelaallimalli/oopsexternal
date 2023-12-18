mkdir TV_Remote
// File: TV_Remote/RemoteControl.java
package TV_Remote;

public interface RemoteControl {
    void switchOn();
    void switchOff();
    void playStarSports();
    void playNGC();
    void playDiscovery();
    void playStarMovies();
}
// File: TV_Remote/Television.java
package TV_Remote;

public class Television implements RemoteControl {

    private boolean isOn = false;

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("Welcome to TATA SKY");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("Goodbye! TV switched off.");
    }

    @Override
    public void playStarSports() {
        if (isOn) {
            System.out.println("Playing STAR SPORTS CHANNEL");
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }

    @Override
    public void playNGC() {
        if (isOn) {
            System.out.println("Playing NGC CHANNEL");
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }

    @Override
    public void playDiscovery() {
        if (isOn) {
            System.out.println("Playing DISCOVERY CHANNEL");
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }

    @Override
    public void playStarMovies() {
        if (isOn) {
            System.out.println("Playing STARMOVIES CHANNEL");
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
}
// File: TVApp.java
import TV_Remote.Television;

public class TVApp {
    public static void main(String[] args) {
        Television tv = new Television();

        // Switch on the TV
        tv.switchOn();

        // Tune channels
        tv.playStarSports();
        tv.playNGC();
        tv.playDiscovery();
        tv.playStarMovies();

        // Switch off the TV
        tv.switchOff();
    }
}

