
public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println("--------------------");

        OneItemBox oneItemBox = new OneItemBox();
        oneItemBox.add(new Item("Saludo", 5));
        oneItemBox.add(new Item("Pirkka", 5));

        System.out.println(oneItemBox.isInBox(new Item("Saludo")));
        System.out.println(oneItemBox.isInBox(new Item("Pirkka")));

        System.out.println("--------------------");

        MisplacingBox misplacingBox = new MisplacingBox();
        misplacingBox.add(new Item("Saludo", 5));
        misplacingBox.add(new Item("Pirkka", 5));

        System.out.println(misplacingBox.isInBox(new Item("Saludo")));
        System.out.println(misplacingBox.isInBox(new Item("Pirkka")));
    }
}
