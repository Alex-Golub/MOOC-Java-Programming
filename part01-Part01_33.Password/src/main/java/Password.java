
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String password = scan.nextLine();
        System.out.println("Caput Draconis".equals(password) ? "Welcome!" : "Off with you!");
    }
}
