import java.util.Scanner;

public class main {
    public static void main( String[] args )
    {

        Scanner keyboard = new Scanner(System.in); //inserting the scanner for user input.
     //declaring variables
        String name;
        String breed;
        int age;



        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next(); //initializing the variable name with the next input from the keyboard

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt(); //initializing the variable age with the next integer input from the keyboard


        System.out.println( name + " is your " + breed + " and it is " + age );

        keyboard.close(); //closing the keyboard.
    }
}