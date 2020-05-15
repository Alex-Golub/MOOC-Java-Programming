
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int intValue = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double doubleValue = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleanValue = Boolean.parseBoolean(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + intValue);
        System.out.println("You gave the double " + doubleValue);
        System.out.println("You gave the boolean " + booleanValue);

    }
}
