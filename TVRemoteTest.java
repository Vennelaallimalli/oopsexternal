import TVRemote.*;

public class TVRemoteTest {
    public static void main(String[] args) {
        TV tv = new TV();

        // Test the TV remote system
        tv.switchOn();
        tv.tuneChannel(new StarSportsChannel());
        tv.tuneChannel(new NGCChannel());
        tv.tuneChannel(new DiscoveryChannel());
        tv.tuneChannel(new StarMoviesChannel());
        tv.switchOff();
    }
}
//
package TVRemote;

public class StarMoviesChannel implements Channel {
    @Override
    public void playChannel() {
        System.out.println("Playing Star Movies Channel");
    }
}
//
package TVRemote;

public class DiscoveryChannel implements Channel {
    @Override
    public void playChannel() {
        System.out.println("Playing Discovery Channel");
    }
}
//
package TVRemote;

public class NGCChannel implements Channel {
    @Override
    public void playChannel() {
        System.out.println("Playing NGC Channel");
    }
}
//
package TVRemote;

public class StarSportsChannel implements Channel {
    @Override
    public void playChannel() {
        System.out.println("Playing Star Sports Channel");
    }
}
//
package TVRemote;

public class TV implements Remote {
    private boolean isSwitchedOn;

    public TV() {
        this.isSwitchedOn = false;
    }

    @Override
    public void switchOn() {
        if (!isSwitchedOn) {
            System.out.println("Welcome to TATA SKY");
            isSwitchedOn = true;
        } else {
            System.out.println("TV is already switched on.");
        }
    }

    @Override
    public void switchOff() {
        if (isSwitchedOn) {
            System.out.println("TV is switching off. Goodbye!");
            isSwitchedOn = false;
        } else {
            System.out.println("TV is already switched off.");
        }
    }

    @Override
    public void tuneChannel(Channel channel) {
        if (isSwitchedOn) {
            channel.playChannel();
        } else {
            System.out.println("Please switch on the TV first.");
        }
    }
}
//
package TVRemote;

public interface Remote {
    void switchOn();
    void switchOff();
    void tuneChannel(Channel channel);
}
//
package TVRemote;

public interface Channel {
    void playChannel();
}

