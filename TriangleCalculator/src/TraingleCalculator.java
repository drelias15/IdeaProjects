import java.util.Scanner;

public class TraingleCalculator {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        int side1, side2, side3;

        System.out.println("Enter the side one of your triangle ");
        side1 = keyboard.nextInt();

        System.out.println("Enter the side two of your triangle ");
        side2 = keyboard.nextInt();

        System.out.println("Enter the side three of your triangle ");
        side3 = keyboard.nextInt();

        if (side1 == side2 && side1==side3){
            System.out.println("This triangle is equilateral triangle.");
        }
        else if (side1 > side2 && side1 > side3 && (side1*side1 == (side2*side2) + (side3*side3))){
            System.out.println("This triangle is right angle triangle.");
        }
        else if (side2 > side1 && side2 > side3 && (side2*side2 == (side1*side1) + (side3*side3))){
            System.out.println("This triangle is right angle triangle.");
        }
        else if (side3 > side1 && side3 > side2 && (side3*side3 == (side1*side1) + (side2*side2))){
            System.out.println("This triangle is right angle triangle.");
        }
        else{
            System.out.println(" Your triangle is not equilateral or right angle traingle.");
        }
    }
}
