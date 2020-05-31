
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc May 28, 2020 4:07:15 PM
 */
public class ChangeHistory {
    
    private List<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    /**
     * provide status as the latest amount to remember in the change history.
     */
    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    /**
     * largest value in the change history
     */
    public double maxValue() {
        if (isEmpty()) {
            return 0.0D;
        }

        double maxVal = Double.MIN_VALUE;
        for (double v : history) {
            if (Double.compare(v, maxVal) > 0) {
                maxVal = v;
            }
        }

        return maxVal;

    }

    private boolean isEmpty() {
        return history.size() == 0;
    }

    /**
     * smallest value in the change history
     */
    public double minValue() {
        if (isEmpty()) {
            return 0.0D;
        }

        double minVal = Double.MAX_VALUE;
        for (double v : history) {
            if (Double.compare(v, minVal) < 0) {
                minVal = v;
            }
        }

        return minVal;
    }

    /**
     * returns the average of the values in the change history
     */
    public double average() {
        if (isEmpty()) {
            return 0.0D;
        }

        double total = 0.0D;
        for (double v : history) {
            total = Double.sum(total, v);
        }

        return total / history.size();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}



