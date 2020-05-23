
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        boolean isZero = false;
        
        while (!isZero) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number == 0) {
                isZero = true;
            } else {
                counter++;
                sum += number;
            }
        }
        
        double avg = sum * 1.0 / counter;
        System.out.println("Average of the numbers: " + avg);
        
    }
}
