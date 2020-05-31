
public class Main {

    public static void main(String[] args) {

//        part1And2();
//        part5();
//        part6();
        part7();

    }

    private static void part7() {

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
//        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }

    private static void part6() {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.takeFromWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
    }

    private static void part1And2() {
        // Part 1 + 2: Product warehouse
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 988.7, space left 11.3
    }

    private static void part5() {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor...
    }

}
