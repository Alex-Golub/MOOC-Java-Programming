
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        boolean isZero = false;
        
        while (!isZero) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number == 0) {
                isZero = true;
            } else {
                sum += number;
            }
        }
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
