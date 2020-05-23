
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String in = scanner.nextLine();
            if ("end".equals(in))
                break;
            
            int num = Integer.parseInt(in);
            System.out.println((int) Math.pow(num, 3.0));
        }
    }
}
