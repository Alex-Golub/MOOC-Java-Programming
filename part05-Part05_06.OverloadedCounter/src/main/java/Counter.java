/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 */
public class Counter {
    
    private int value;

    public Counter() {
    }

    public Counter(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
    
    public void increase() {
        value++;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }
        value += increaseBy;
    }
    
    public void decrease() {
        value--;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        value -= decreaseBy;
    }
    
}
