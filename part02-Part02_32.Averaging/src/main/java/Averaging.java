
public class Averaging {

    // implement the sum method here again
    public static int sum(int n1, int n2, int n3, int n4) {
        // write some code here
        return n1 + n2 + n3 + n4;
    }

    public static double average(int n1, int n2, int n3, int n4) {
        //write some code here
        return sum(n1, n2, n3, n4) / 4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
