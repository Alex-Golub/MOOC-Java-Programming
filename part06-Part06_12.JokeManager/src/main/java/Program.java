
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager jm = new JokeManager();
        Scanner sc = new Scanner(System.in);
        UserInterface ui = new UserInterface(jm, sc);
        
        ui.start();
    }
}
