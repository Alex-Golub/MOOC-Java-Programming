
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            for (String word : line.split(" ")) {
                System.out.println(word);
            }
        }

    }
}
