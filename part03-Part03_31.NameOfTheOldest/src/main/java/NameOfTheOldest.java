
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOfOldest = "";
        while (true) {
            String line = scanner.nextLine();
            if ("".equals(line)) {
                break;
            }

            String[] nameAndAge = line.split(",");
            int age = Integer.parseInt(nameAndAge[1]);
            if (oldest < age) {
                oldest = age;
                nameOfOldest = nameAndAge[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOfOldest);

    }
}
