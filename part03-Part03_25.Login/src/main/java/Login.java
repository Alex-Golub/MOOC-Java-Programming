
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        if ("alex".equals(username) && "sunshine".equals(pass)
                || "emma".equals(username) && "haskell".equals(pass)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    
    
}
