import java.util.Scanner;

public class SortingLetters {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        char letter1, letter2, letter3;

        System.out.println(" Enter your first letter ");
        letter1 = keyboard.next().charAt(0);

        System.out.println(" Enter your second letter ");
        letter2 = keyboard.next().charAt(0);

        System.out.println(" Enter your third letter ");
        letter3 = keyboard.next().charAt(0);


        if (letter1 > letter2 && letter1 > letter3 && letter2 > letter3) {
            System.out.println(letter3 + "\n" + letter2 + "\n" + letter1);
        } else if (letter2 < letter3) {
            System.out.println(letter1 + "\n" + letter2 + "\n" + letter3);
        } else if (letter2 > letter3) {
            System.out.println(letter1 + "\n" + letter3 + "\n" + letter2);
        } else {
            System.out.println("All are equal");
        }

    }
}
