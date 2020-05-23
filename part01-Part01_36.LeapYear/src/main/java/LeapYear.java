
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Give a year: ");
        int year = Integer.parseInt(scan.nextLine());
        
        System.out.print("The year is ");
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("a leap year.");
        } else {
            System.out.println("not a leap year.");
        }
        
    }
}
