import java.util.Scanner;

public class Months {

    public static void main (String[] args){

        Scanner keyborad = new Scanner(System.in);

        int month;
        String monthName = null;
        
        System.out.println("Enter exact number of days of a month: ");
        month = keyborad.nextInt();


        switch (month) {
            case  31:  monthName = "January March May July August October December ";
                break;
            case  30:  monthName = "September April June November";
              break;
            case 9:  monthName = "No month have exactly 9 days";
              break;
            default: monthName = "No month have exactly" + " " + month + " " + "days";

                break;
       }
        System.out.println(monthName);
    }
}
