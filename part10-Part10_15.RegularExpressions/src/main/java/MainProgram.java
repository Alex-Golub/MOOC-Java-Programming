
import java.util.Scanner;

public class MainProgram {

  public static void main(String[] args) {
    // you can create test code here. Call the methods that you'll implement
    // during the course of this exercise
    Scanner scanner = new Scanner(System.in);

    Checker checker = new Checker();
    while (true) {
      System.out.print("Enter a string: ");
      String input = scanner.nextLine();

      if (input.isEmpty()) {
        break;
      }

      // Part 1: Day of week
//      System.out.println(checker.isDayOfWeek(input) ? "The form is correct." : "The form is incorrect.");

      // Part 2: Vowel check
//      System.out.println(checker.allVowels(input) ? "The form is correct." : "The form is incorrect.");
      
      // Part 3: TIme of Day
      System.out.println(checker.timeOfDay(input) ? "The form is correct." : "The form is incorrect.");
    }

    System.out.println("Bye!");
  }
}
