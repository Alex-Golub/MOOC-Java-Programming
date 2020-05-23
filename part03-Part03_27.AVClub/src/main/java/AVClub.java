
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            
            for (String s : line.split(" ")) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
        }

    }
}
