
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");
        for (Integer i : numbers) {
            if (i >= lowerLimit && i <= upperLimit) {
                System.out.println(i);
            } 
        }
    }
    
}
