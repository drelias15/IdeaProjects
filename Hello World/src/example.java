public class example {

    public static void main(String[] args) {
        //declare variables here before we use them
        int age, y, answer;
        //all three variables will be declared as integers
        double temperature;
        float Temperature;
        //a float uses less memory than a double
        String firstName, lastName;
        String lGpa, UlGpa, favoriteMovie;
        String question = "unknown";     //question is initialized</p>
        //assign values to the variables here
        age = 29;
         //you could also use the constant Integer.MAX_VALUE
        favoriteMovie = "Paul";
        firstName = "Elias";
        lastName = "Adhanom";
        lGpa = "I do like my GPA";
        UlGpa = "I don't like my GPA";
        // String question = "unknown"; //question is initialized


        //Use the variables here
        System.out.println("My name is " + firstName +" " + lastName + "and my age is " + age);
        System.out.println("My favorite movie is " + favoriteMovie);
        System.out.println(lGpa);
        System.out.println(UlGpa);
    }
}