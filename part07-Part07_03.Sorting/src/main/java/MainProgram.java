
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Smallest: " + MainProgram.smallest(array));

        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        System.out.println(MainProgram.indexOfSmallestFrom(array, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 2));

        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        MainProgram.swap(array, 0, 3);
        System.out.println(Arrays.toString(array));

        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    // Part 1: Finding the smallest value
    public static int smallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    // Part 2: Index of the smallest value
    public static int indexOfSmallest(int[] arr) {
        int smallest = MainProgram.smallest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    // Part 3: Index of the smallest value after a certain value
    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        if (arr == null || startIndex >= arr.length) {
            return -1;
        }

        int indexOfSmallest = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    // Part 4: Swapping numbers
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Part 5: Sorting
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, MainProgram.indexOfSmallestFrom(arr, i), i);
        }
    }

}
