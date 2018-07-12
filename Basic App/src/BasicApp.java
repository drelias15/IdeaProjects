import java.util.Scanner;

public class BasicApp {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        int firstInput, addedNum, multNum, result;

        System.out.println("Please enter your number ");
        firstInput = keyboard.nextInt();

        addedNum = firstInput + 5;
        multNum = addedNum*2;
        result = multNum - 7;

        System.out.println("Your result is " + result);


    }
}
