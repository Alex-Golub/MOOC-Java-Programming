
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int positiveSum = 0;
        boolean isZero = false;
        
        while (!isZero) {
            int num = Integer.parseInt(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                counter++;
                positiveSum += num;
            }
            
        }
        
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * positiveSum / counter);
        }
        
    }
}
