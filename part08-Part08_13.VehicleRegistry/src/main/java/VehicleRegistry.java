
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thisPc
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> map = new HashMap<>();

    // Part 2: Pairing plates with owners
    public boolean add(LicensePlate licensePlate, String owner) {
        if (map.containsKey(licensePlate)) {
            return false;
        }

        map.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return map.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!map.containsKey(licensePlate)) {
            return false;
        }

        map.remove(licensePlate);
        return true;
    }

    // Part 3: Expanded vehicle registry
    public void printLicensePlates() {
        for (LicensePlate lp : map.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        List<String> ownersList = new ArrayList<>();
        for (String owner : map.values()) {
            if (!ownersList.contains(owner)) {
                System.out.println(owner);
                ownersList.add(owner);
            }
        }
    }

}
