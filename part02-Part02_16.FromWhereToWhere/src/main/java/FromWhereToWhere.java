
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1
//        System.out.print("Where to? ");
//        int whereTo = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= whereTo; i++) {
//            System.out.println(i);
//        }

        // Part 2
        System.out.print("Where to? ");
        int whereTo = Integer.parseInt(scanner.nextLine());
        System.out.print("Where from? ");
        int whereFrom = Integer.parseInt(scanner.nextLine());

        if (whereFrom <= whereTo) {
            for (int i = whereFrom; i <= whereTo; i++) {
                System.out.println(i);
            }
        }

    }
}
