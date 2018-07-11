
import java.util.Scanner;

public class main {

    public static void main( String[] args ){

        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print( "Greetings. What is your name? " );
        name = keyboard.next(); //initializing the variable name with the next input from the keyboard

        System.out.print( "My name is " + name);

        keyboard.close();

    }
}
