
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (maxWeight - item.getWeight() < 0) 
            return;
        
        maxWeight -= item.getWeight();
        items.add(item);
    }
    
    @Override
    public String toString() {
        if (items.isEmpty())
            return "no items (0 kg)";
        if (items.size() == 1) 
            return "1 item (" + totalWeight() + "kg)";
        
        return items.size() + " items (" + totalWeight() + "kg)";
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item : items)
            total += item.getWeight();
        return total;
    }
    
    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("Suitcase is empty!");
            return;
        }
        for (Item item : items)
            System.out.println(item);
    }
    
    public Item heaviestItem() {
        if (items.isEmpty())
            return null;
        
        Item heaviest = items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = items.get(i);
            }
        }
        return heaviest;
    }
    
}
