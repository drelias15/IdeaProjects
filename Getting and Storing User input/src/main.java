import java.util.Scanner;


public class main {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        String firstInitial, lastName, streetName, city, state;
        int zipCode, houseNumber;

        System.out.println("What is your first initial " );
        firstInitial = keyboard.next();

        System.out.println("What is your last name " );
        lastName = keyboard.next();

        System.out.println("What is your house number " );
        houseNumber = keyboard.nextInt();

        System.out.println("What is your street name " );
        streetName = keyboard.next(); //If user tries to input multiple words it will display an error (

        System.out.println("What is your zipcode " );
        zipCode = keyboard.nextInt();

        System.out.println("What is your city " );
        city = keyboard.next(); //If user tries to input multiple words it will display an error

        System.out.println("What is your state " );
        state = keyboard.next();

        System.out.println("Your order will be shipped to \n" + firstInitial + lastName + "\n" + houseNumber + " " + streetName + "\n"   + city + ", " + state + ", " + zipCode + "\n" + "USA");

        keyboard.close();

    }

}
