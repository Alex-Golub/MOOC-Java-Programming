
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        List<Integer> list = new ArrayList<>();
        Integer sum = 0;
        
        while (true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num.equals(-1)) {
                break;
            }
            
            list.add(num);
            sum += num;
        }
        
        System.out.println("");

        // Then it computes the average of the numbers on the list
        // and prints it.
        System.out.println("Average: " + (1.0 * sum / list.size()));
        
    }
}
