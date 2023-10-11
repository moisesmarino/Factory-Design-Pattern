import java.util.Arrays;
import java.util.Random;

public class AlienFactory {

    private enum Types { SquidAlien, MonkeyAlien, TigerAlien, RatAlien };

    private Alien getAlien() {
        Alien alien = null;

        int howManyTypes = Types.values().length;
        int randomIndex = (int)(Math.random()*howManyTypes);

        Types t = Types.values()[randomIndex]; // back to enum

        switch (t) {
            case SquidAlien -> alien = new SquidAlien();
            case MonkeyAlien -> alien = new MonkeyAlien();
            case TigerAlien -> alien = new TigerAlien();
            case RatAlien -> alien = new RatAlien();
            default -> alien = new Alien("Unknown");
        }
        return alien;
    }

    public static void main(String [] args) {

        AlienFactory af = new AlienFactory();
        Alien[] aliens = new Alien[10];

        for (int i=0; i<10; ++i) {
            Alien x = af.getAlien();
            aliens[i] = x;
        }

        System.out.println(Arrays.toString(aliens));

    }

}