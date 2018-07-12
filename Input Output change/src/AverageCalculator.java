import java.util.Scanner;

public class AverageCalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println( "This program will calculate the average of two numbers. " );
        System.out.print( "First number? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second number? " );
        num2 = keyboard.nextDouble();

        num3 = (num1 + num2)/2;

        System.out.println("The average of the two numbers is : " + num3);

        keyboard.close();
    }
}