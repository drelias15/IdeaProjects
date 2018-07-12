import java.util.Scanner;

public class PrintGrades {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        int grade;
        grade = 0;
        System.out.println("Enter your grade ");
        grade = keyboard.nextInt();

        if((grade >=90) && (grade <= 100)){
            System.out.println("Your grade is A.");
        }
        else if ((grade >=80) && (grade <= 89)){
            System.out.println("Your grade is B");
        }
        else if ((grade >=70) && (grade <= 79)){
            System.out.println("Your grade is C");
        }
        else if ((grade >= 60) && (grade <= 69)){
            System.out.println("Your grade is E");
        }
        else if ((grade >=0) && (grade <= 59)){
            System.out.println("Your grade is F");
        }
        else{
            System.out.print("Not valid score");
        }
    }
}
