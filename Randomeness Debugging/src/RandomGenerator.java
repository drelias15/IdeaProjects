import java.util.Random;


public class RandomGenerator{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random rnd = new Random(); //rnd variable initiated.

        for (int i = 1; i <= 10; ++i) //the termination changed to 10.
        {
            int randomInt = 1 + rnd.nextInt(6); //made changes here.
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}