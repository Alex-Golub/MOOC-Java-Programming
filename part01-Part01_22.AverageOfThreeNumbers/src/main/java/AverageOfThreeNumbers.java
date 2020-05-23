
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Give the third number:");
        int c = Integer.parseInt(sc.nextLine());

        System.out.println("The average is " + ((a + b + c) / 3.0));

    }
}
