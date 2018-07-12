import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0
        int counter = 0;
        secretNumber = 123;

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();
        counter++;

        while ( counter < 5)
        {
            if (guess != secretNumber) {
                System.out.println("\nYou are wrong. Try again.");
                System.out.println("Enter the number: ");
                guess = keyboard.nextInt();
                counter++;
            }
            else if (guess == secretNumber){
                break;
            }
        }

        if(guess == secretNumber){
            System.out.println("You are correct. You win a prize! Your number of trials were " + counter);
        }else {
            System.out.println("You have exceeded the allowed attempts." + "\n Your number of attempts were " + counter);
        }
        keyboard.close();
    }
}