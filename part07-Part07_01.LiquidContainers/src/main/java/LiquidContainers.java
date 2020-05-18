
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c1 = 0;
        int c2 = 0;
        final int MAX_AMOUNT = 100;

        while (true) {

            // Print
            System.out.printf("First: %d/100%n", c1);
            System.out.printf("Second: %d/100%n", c2);

            // Get input from user
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Proccess command
            String[] split = input.split(" ");
            int amount = Integer.parseInt(split[1]);

            if (amount < 0) {
                continue;
            }

            switch (split[0]) {
                case "add":
                    c1 = c1 + amount > MAX_AMOUNT ? MAX_AMOUNT : c1 + amount;
                    break;

                case "move":
                    if (amount > c1) {
                        amount = c1;
                    }
                    
                    c1 -= amount;
                    c2 += amount;
                    
                    if (c2 > MAX_AMOUNT) {
                        c2 = MAX_AMOUNT;
                    }
                    
                    break;

                case "remove":
                    c2 -= amount;
                    if (c2 < 0) 
                        c2 = 0;
                    break;
            }

            System.out.println();
        }

    }

}
