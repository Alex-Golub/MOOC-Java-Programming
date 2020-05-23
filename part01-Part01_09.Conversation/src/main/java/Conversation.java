
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        
        System.out.println("Greetings! How are you doing?");
        answer = scanner.nextLine();
        
        System.out.println("Oh, how interesting. Tell me more!");
        answer = scanner.nextLine();
        
        System.out.println("Thanks for sharing!");

    }
}
