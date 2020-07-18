
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

  private ArrayList<Integer> numbers;

  public LotteryRow() {
    // Draw the numbers when the LotteryRow is created
    this.randomizeNumbers();
  }

  public ArrayList<Integer> numbers() {
    return this.numbers;
  }

  /** The numbers are in range 1—40, and 7 numbers will be drawn in total */
  public void randomizeNumbers() {
    this.numbers = new ArrayList<>();
    
    Random rnd = new Random();
    final int TOTAL_NUMBERS = 7;
       
    while (this.numbers.size() < TOTAL_NUMBERS) {
      int raffle = rnd.nextInt(40) + 1;
      if (!this.containsNumber(raffle)) {
        this.numbers.add(raffle);
      }
    }
  }

  public boolean containsNumber(int number) {
    return this.numbers.contains(number);
  }
}
