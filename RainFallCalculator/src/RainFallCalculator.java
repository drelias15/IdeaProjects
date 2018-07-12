import java.util.Scanner;

public class RainFallCalculator {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        double dimension1, dimension2, rainFall, amountOfRainfall;

        System.out.println("Enter the first dimension of your roof ");
        dimension1 = keyboard.nextDouble();

        System.out.println("Enter the second dimension of your roof ");
        dimension2 = keyboard.nextDouble();

        System.out.println("Enter the rain fall in inches ");
        rainFall = keyboard.nextDouble();

        double dimension1Inch = dimension1*12;
        double dimension2Inch = dimension2*12;

        amountOfRainfall = dimension1Inch*dimension2Inch*rainFall;
        double gallons = amountOfRainfall/231;

        System.out.println("The rain fall amount is " + amountOfRainfall + " cubic inches");
        System.out.println("The rain fall amount is " + gallons + " gallons");

    }
}
