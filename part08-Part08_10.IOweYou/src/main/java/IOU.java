
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class IOU {
    
    private HashMap<String, Double> map;

    public IOU() {
        map = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        // IOU debt accumulating 
//        map.put(toWhom, map.getOrDefault(toWhom, 0.0D) + amount);
    
        // The IOU does not care about old debt
        map.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return map.getOrDefault(toWhom, 0.0D);
    }
    
}
