
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        while (number-- > 0) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        while (number-- > 0) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int stars = 1;
        while (size-- > 0) {
            printSpaces(size);
            printStars(stars++);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1, j = height; i <= height * 2; i = i + 2, j--) {
            printSpaces(j - 1);
            printStars(i);
        }
        for (int j = height; j >= height - 1; j--) {
            printSpaces(height - 2);
            System.out.println("***");

        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
