import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        int to = Integer.parseInt(new Scanner(System.in).nextLine());
        printUntilNumber(to);
    }
    
    public static void printUntilNumber(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.println(i);
        }
    }

}
