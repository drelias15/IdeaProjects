import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int firstScore, secondScore, thirdScore, fourthScore, fifthScore, sixthScore, seventhScore, eigthScore, ninthScore, tenthScore;
        int average;
        System.out.println("Enter the first score");
        firstScore = keyboard.nextInt();

        System.out.println("Enter the Second score");
        secondScore = keyboard.nextInt();

        System.out.println("Enter the Third score");
        thirdScore = keyboard.nextInt();

        System.out.println("Enter the Fourth Score");
        fourthScore = keyboard.nextInt();

        System.out.println("Enter the Fifth score");
        fifthScore = keyboard.nextInt();

        System.out.println("Enter the Sixth score");
        sixthScore = keyboard.nextInt();

        System.out.println("Enter the Seventh score");
        seventhScore = keyboard.nextInt();

        System.out.println("Enter the Eigth score");
        eigthScore = keyboard.nextInt();

        System.out.println("Enter the Ninth score");
        ninthScore = keyboard.nextInt();

        System.out.println("Enter the Tenth score");
        tenthScore = keyboard.nextInt();

       int scoreSum = firstScore + secondScore + thirdScore + fourthScore + fifthScore + sixthScore + seventhScore + eigthScore + ninthScore + tenthScore;
       average = scoreSum/10;

       System.out.println("The average of the scores is " + average);


    }
}