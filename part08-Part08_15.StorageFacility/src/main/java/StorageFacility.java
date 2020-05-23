
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    // Part 1: Adding items and examining contents
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    // Part 2: Listing the units and removing from unit
    public void remove(String storageUnit, String item) {
        contents(storageUnit).remove(item);

        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> nonEmptyUnits = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if (!storage.get(unit).isEmpty()) {
                nonEmptyUnits.add(unit);
            }
        }
        
        return nonEmptyUnits;
    }
}
