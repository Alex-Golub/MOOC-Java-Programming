
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = getNumber(scanner);
        int to = getNumber(scanner);
        divisibleByThreeInRange(from, to);
    }

    private static int getNumber(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        if (beginning % 3 != 0) {
            beginning += 3 - beginning;
        }

        while (beginning <= end) {
            System.out.println(beginning);
            beginning += 3;
        }

    }

}
