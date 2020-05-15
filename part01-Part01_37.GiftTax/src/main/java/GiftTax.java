
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scan.nextLine());
        double tax = 0;

        if (gift > 1_000_000) {
            tax = 142_100 + (gift - 1_000_000) * 0.17;
        } else if (gift >= 200_000) {
            tax = 22_100 + (gift - 200_000) * 0.15;
        } else if (gift >= 55_000) {
            tax = 4_700 + (gift - 55_000) * 0.12;
        } else if (gift >= 25_000) {
            tax = 1_700 + (gift - 25_000) * 0.10;
        } else if (gift >= 5_000) {
            tax = 100 + (gift - 5_000) * 0.08;
        }

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }

    }
}
