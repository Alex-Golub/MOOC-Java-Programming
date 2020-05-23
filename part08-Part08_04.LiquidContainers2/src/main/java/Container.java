/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class Container {

    private int liquid;
    private static final int MAX_LIQUID = 100;

    public Container() {
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        liquid = liquid + amount >= MAX_LIQUID
                ? MAX_LIQUID
                : liquid + amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        liquid = amount >= liquid
                ? 0
                : liquid - amount;
    }

    public String toString() {
        return String.format("%d/%d", liquid, MAX_LIQUID);
    }
}
