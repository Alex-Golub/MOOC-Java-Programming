
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String line = scanner.nextLine();
            if ("".equals(line)) 
                break;
            
            int age = Integer.parseInt(line.split(",")[1]);
            if (oldest < age) {
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
