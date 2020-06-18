
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Book> books = new ArrayList<>();

    while (true) {
      System.out.print("Input the name of the book, empty stops: ");
      String name = scanner.nextLine();

      if (name.isEmpty()) {
        break;
      }

      System.out.print("Input the age recommendation: ");
      Integer age = Integer.valueOf(scanner.nextLine());

      books.add(new Book(name, age));

      System.out.println("");
    }

    if (books.isEmpty()) {
      return;
    }

    System.out.println("\n" + books.size() + " books in total.\n");

    // Part 2: Ordering books based on their age recommendation
//    Collections.sort(books, Comparator.comparingInt(Book::getAge));

    // Part 3: Ordering books based on their age recommendation and name
    Comparator byAgeName = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getTitle);
    Collections.sort(books, byAgeName);
    
    System.out.println("Books:");
    books.forEach(System.out::println);
  }

}
