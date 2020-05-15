
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write something:");
        boolean value = Boolean.parseBoolean(sc.nextLine());
        System.out.println("True or false? " + value);

    }
}
