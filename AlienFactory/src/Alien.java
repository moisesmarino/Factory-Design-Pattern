import java.util.Random;

public class Alien {

    private final String NAME;
    private static Random r = new Random();

    // NAME will consist of type and 1 or 2 digit random number
    public Alien(String type) {
        this.NAME = type + r.nextInt(100);
    }

    public String getName() {
        return this.NAME;
    }

    public String toString() {
        return this.NAME;
    }

}

class SquidAlien extends Alien {
    public SquidAlien() {
        super("Squid");
    }
}

class MonkeyAlien extends Alien {
    public MonkeyAlien() {
        super("Monkey");
    }
}

class TigerAlien extends Alien {
    public TigerAlien() {
        super("Tiger");
    }
}

class RatAlien extends Alien {
    public RatAlien() {
        super("Rat");
    }
}