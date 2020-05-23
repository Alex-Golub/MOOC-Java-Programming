
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.parseInt(scanner.nextLine());
        
        int sum = start;
        for (int i = start + 1; i <= last; i++) {
            sum += i;
        }
        
        System.out.println("The sum is " + sum);
    }
}
