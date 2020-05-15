
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class Hold {
    private ArrayList<Suitcase> luggage;
    private int maxWeight;

    public Hold(int maxWeight) {
        luggage = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() > maxWeight)
            return;
        luggage.add(suitcase);
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : luggage)
            total += suitcase.totalWeight();
        return total;
    }
    
    @Override
    public String toString() {
        return luggage.size() + " suitcases (" + totalWeight() + "kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : luggage)
            suitcase.printItems();
    }
    
    
    
}
