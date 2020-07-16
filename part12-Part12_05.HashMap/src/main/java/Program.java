
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Pair<String, Integer> pair = new Pair<>("COVID", 19);
    System.out.println(pair.getKey() + " -> " + pair.getValue());

    MyHashMap<String, Integer> hashMap = new MyHashMap<>();
    System.out.println(hashMap.get("Age")); // null, there is no-such key yet

    hashMap.add("Age", 32);
    System.out.println(hashMap.get("Age")); // 32
    hashMap.add("Age", 64);
    System.out.println(hashMap.get("Age")); // 64

    System.out.println(hashMap.remove("Age")); // 64
    System.out.println(hashMap.get("Age")); // null

    hashMap.add("A", 1);
    hashMap.add("B", 2);
    hashMap.add("C", 3);
    hashMap.add("D", 4);
    hashMap.add("E", 5);
    hashMap.add("F", 6);
    hashMap.add("G", 7);
    hashMap.add("H", 8);
    hashMap.add("I", 9);

    System.out.println(hashMap.toString());

    System.out.println();

    performanceTest();

  }

  /**
   * Compare search performance between hashMap and List List is linear and
   * hashMap uses hashing which is almost instant
   */
  private static void performanceTest() {
    MyHashMap<String, Integer> map = new MyHashMap<>();
    List<String> list = new ArrayList<>();
    List<String> randomElements = new ArrayList<>();
    Random rnd = new Random();

    final int ELEMENTS = 50_000;

    // Create entries each for MyHashMap and ArrayList 
    // and intilize randomElemnts from which map and list will get 
    // its elements if contains
    for (int i = 0; i < ELEMENTS; i++) {
      map.add("" + rnd.nextInt(ELEMENTS), rnd.nextInt(ELEMENTS));
      list.add("" + rnd.nextInt(ELEMENTS));
      randomElements.add("" + rnd.nextInt(ELEMENTS));
    }

//    System.out.println(map.toString());
//    System.out.println(list);
    long start = System.currentTimeMillis();
    for (String ele : randomElements) {
      list.contains(ele);
    }
    System.out.println("List contains search time: " + (System.currentTimeMillis() - start) + "ms"); // 9170ms

    start = System.currentTimeMillis();
    for (String ele : randomElements) {
      map.get(ele);
    }
    System.out.println("Map get search time: " + (System.currentTimeMillis() - start) + "ms"); // 7192ms
  }

}
