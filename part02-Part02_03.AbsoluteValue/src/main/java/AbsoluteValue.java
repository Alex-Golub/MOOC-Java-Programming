
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num < 0 ? -num : num);
    }
}
