
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(sc.nextLine());
        
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (1.0 * a / b));

    }
}
