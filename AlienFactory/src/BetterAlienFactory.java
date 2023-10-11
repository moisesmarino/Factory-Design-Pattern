public class BetterAlienFactory {

    private enum Types { SquidAlien, MonkeyAlien, TigerAlien, RatAlien };

    private static Random r = new Random();    

    public Alien getAlien()  {        

        Alien alien = null;

        int rand = r.nextInt(Types.values().length);
        Types alienType = Types.values()[rand];

        // System.out.println("Alien Type = " + alienType);

        try {
            alien = (Alien)(Class.forName(alienType.toString()).getDeclaredConstructor().newInstance());  
        } catch (Exception e) {
            System.out.println("Unknown class type.");
        }

        return alien;
    }
}
