package dictionary;

public class Main {

  public static void main(String[] args) {

    // Part 1: The basic functionality
//    part1();

    // Part 2: Deleting words
//    part2();

    // Part 3: Reading from file
//    part3();

    // Part 4: Saving to a file
    part4();
  }

  private static void part4() {
    SaveableDictionary dictionary = new SaveableDictionary("words.txt");
    boolean wasSuccessful = dictionary.load();
    
     if (wasSuccessful) {
      System.out.println("Successfully loaded the dictionary from file");
    }
     
     dictionary.add("My name", "su name");
     dictionary.add("Covid-19", "Modern Cancer");
     dictionary.add("part time java dev", "developer");
     
     dictionary.save();
  }

  private static void part3() {
    SaveableDictionary dictionary = new SaveableDictionary("words.txt");
    boolean wasSuccessful = dictionary.load();

    if (wasSuccessful) {
      System.out.println("Successfully loaded the dictionary from file");
    }

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("ohjelmointi"));
    System.out.println(dictionary.translate("alla oleva"));
  }

  private static void part2() {
    SaveableDictionary dictionary = new SaveableDictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("ohjelmointi", "programming");
    dictionary.delete("apina");
    dictionary.delete("banana");

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("monkey"));
    System.out.println(dictionary.translate("banana"));
    System.out.println(dictionary.translate("banaani"));
    System.out.println(dictionary.translate("ohjelmointi"));
  }

  private static void part1() {
    SaveableDictionary dictionary = new SaveableDictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("apina", "apfe");

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("monkey"));
    System.out.println(dictionary.translate("ohjelmointi"));
    System.out.println(dictionary.translate("banana"));
  }
}
