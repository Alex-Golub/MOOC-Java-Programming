
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 1, 2020 12:35:00 AM
 */
public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        // defines the max weight allowed for that box
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void add(Item item) {
        if (this.getCapacity() - item.getWeight() >= 0) {
            this.items.add(item);
            
            // Update this box capacity
            this.setCapacity(this.getCapacity() - item.getWeight());
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
    
}
