
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 1, 2020 12:51:15 AM
 */
public class OneItemBox extends Box {
    
    private List<Item> oneItem;
    
    public OneItemBox() {
        oneItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (oneItem.isEmpty()) {
            oneItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return oneItem.contains(item);
    }
    
    
}
