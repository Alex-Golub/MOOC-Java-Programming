
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String carryOn = "";
        while (true) {
            System.out.println("Carry on?");
            carryOn = scanner.nextLine();
            if ("no".equals(carryOn)) {
                break;
            }
        }
    }
}
