
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        List<Integer> list = new ArrayList<>();
        int index = 0;
        
        // Get numbers from user and add them to List
        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number.equals(9999)) {
                break;
            }
            
            list.add(number);
        }
        
        System.out.println("");
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int minValue = findMinValue(list);
        System.out.println("Smallest number: " + minValue);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(minValue)) {
                System.out.println("Found at index: " + i);
            }
        }
       
    }
    
    private static int findMinValue(List<Integer> list) {
        int minValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(minValue) < 0) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }
}
