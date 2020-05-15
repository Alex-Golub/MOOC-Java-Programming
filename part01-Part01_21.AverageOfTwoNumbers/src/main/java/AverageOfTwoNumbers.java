
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(sc.nextLine());
        
        System.out.println("The average is " + ((a + b) / 2.0));

    }
}
