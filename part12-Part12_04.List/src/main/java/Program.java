
import java.util.Arrays;


public class Program {

  public static void main(String[] args) {
    part1();
    
//    MyList<Integer> numbers = new MyList<>();
//    numbers.add(5);
//    System.out.println(numbers);
//    System.out.println(Arrays.toString(numbers.getList()));
//    numbers.remove(5);
//    System.out.println(numbers);
//    System.out.println(Arrays.toString(numbers.getList()));
    
    
  }

  private static void part1() {
    MyList<String> myList = new MyList<>();
    myList.add("Hey");
    myList.add("Hey");
    myList.add("1");
    myList.add("2");
    myList.add("Hey");
    myList.add("3");
    myList.add("Hey");
    myList.add("Hey");
    myList.add("4");
    myList.add("Hey");
    myList.add("5");
    myList.add("Hey");
    
    System.out.println(myList + " : " + myList.getFirstFreeIndex());
    System.out.println(Arrays.toString(myList.getList()) + " : " + myList.getFirstFreeIndex());
    
    System.out.println("---");
    System.out.println("myList.contains(\"what\"): " + myList.contains("what"));
    System.out.println("myList.contains(\"Hey\"): " + myList.contains("Hey"));
    
    System.out.println("---");
    System.out.println("myList.indexOf(\"!\"): " + myList.indexOf("!"));
    System.out.println("myList.indexOf(\"1\"): " + myList.indexOf("1"));
    
    System.out.println("---");
    System.out.println(myList + " : " + myList.getFirstFreeIndex());
    System.out.println(Arrays.toString(myList.getList()) + " : " + myList.getFirstFreeIndex());
    System.out.println("myList.remove(\"5\")");
    myList.remove("5");
    System.out.println(myList + " : " + myList.getFirstFreeIndex());
    System.out.println(Arrays.toString(myList.getList()) + " : " + myList.getFirstFreeIndex());
    
    System.out.println("---");
    myList.remove("Hey");
    myList.remove("Hey");
    myList.remove("Hey");
    myList.remove("Hey");
    myList.remove("Hey");
    myList.remove("Hey");
    myList.remove("Hey");
    System.out.println(myList + " : " + myList.getFirstFreeIndex());
    System.out.println(Arrays.toString(myList.getList()) + " : " + myList.getFirstFreeIndex());
    
    System.out.println("---");
    System.out.println("myList.get(2) : " + myList.get(2));
  }

}
