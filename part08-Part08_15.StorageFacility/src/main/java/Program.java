
public class Program {

    public static void main(String[] args) {
//        part1Test();
        part2Test();

    }

    private static void part2Test() {
        StorageFacility facility = new StorageFacility();
        
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }

    private static void part1Test() {
        StorageFacility facility = new StorageFacility();

        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");
//        facility.remove("f156", "rollerblades");
//        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
        System.out.println(facility.contents("g63"));
//        System.out.println(facility.storageUnits());
    }
}
