
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int longestNameLength = 0;
        String longestName = "";
        
        while (true) {
            String line = scanner.nextLine();
            if ("".equals(line))
                break;
            
            String[] nameAndYear = line.split(",");
            String name = nameAndYear[0];
            int year = Integer.parseInt(nameAndYear[1]);
            
            if (name.length() > longestNameLength) {
                longestNameLength = name.length();
                longestName = name;
            }
            
            sum += year;
            counter++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / counter));
       
    }
}
