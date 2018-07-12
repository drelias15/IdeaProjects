import java.util.Scanner;

public class main {
    public static void main( String[] args )
    {

        Scanner keyboard = new Scanner(System.in); //inserting the scanner for user input.
        //declaring variables
        String letter1, letter2, letter3;

        letter1 = keyboard.next(); //initializing the variable name with the next input from the keyboard
        letter2 = keyboard.next(); //initializing the variable name with the next input from the keyboard
        letter3 = keyboard.next(); //initializing the variable name with the next input from the keyboard

        if (letter1 > letter2 && letter1 > letter3 && letter2 > letter3) {
            System.out.println("Letter3 < Letter2 < Letter1");
        } else if (letter2 < letter3) {
            System.out.println("Letter1 < Letter2 < Letter3");
        } else if (letter2 > letter3) {
            System.out.println("Letter1 < Letter3 < Letter2");
        } else {
            System.out.println("All are equal");
        }


        System.out.println( "Your letters are " + letter1 + "" + letter2 + "" + letter3);

        keyboard.close(); //closing the keyboard.
    }
}
