
public class Statistics {

    private int count;
    private int sum;

    public void addNumber(int number) {
        count++;
        sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return sum == 0 ? Double.MIN_VALUE : 1.0 * sum / count;
    }

}
