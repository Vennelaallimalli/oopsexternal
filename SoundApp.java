mkdir sounds
// File: sounds/Dolby.java
package sounds;

public interface Dolby {
    void playDolby();
}
// File: sounds/Podcast.java
package sounds;

public class Podcast {
    public void playPodcast() {
        System.out.println("Playing podcast sound");
    }
}
// File: SoundApp.java
import sounds.Dolby;
import sounds.Podcast;

public class SoundApp implements Dolby {
    public static void main(String[] args) {
        SoundApp soundApp = new SoundApp();

        // Use Dolby interface method
        soundApp.playDolby();

        // Use Podcast class method
        Podcast podcast = new Podcast();
        podcast.playPodcast();
    }

    @Override
    public void playDolby() {
        System.out.println("Playing Dolby sound");
    }
}
