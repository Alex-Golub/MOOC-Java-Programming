
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = 0;
        
        while (value != 4) {
            System.out.println("Give a number:"); 
            value = Integer.parseInt(scanner.nextLine());
        }
    }
}
