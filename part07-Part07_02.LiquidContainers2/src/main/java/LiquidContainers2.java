
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        LiquidContainers2 lc = new LiquidContainers2();

        Scanner scan = new Scanner(System.in);

        Container c1 = new Container();
        Container c2 = new Container();

        while (true) {
            System.out.println("First: " + c1);
            System.out.println("Second: " + c2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            lc.proccessCommand(input.split(" "), c1, c2);
            System.out.println();
        }
    }

    private void proccessCommand(String[] input, Container c1, Container c2) {
        String command = input[0];
        int amount = Integer.parseInt(input[1]);
        switch (command) {
            case "add":
                c1.add(amount);
                break;
            case "move":
                if (amount >= c1.contains())
                    c2.add(c1.contains());
                else 
                    c2.add(amount);
                c1.remove(amount);
                break;
            case "remove":
                c2.remove(amount);
                break;
        }
    }

}
