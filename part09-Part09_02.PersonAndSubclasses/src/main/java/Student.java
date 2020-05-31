/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * May 24, 2020 7:48:51 PM
 */
public class Student extends Person {
    
    private int credits;

    public Student(String fullName, String address) {
        super(fullName, address);
        credits = 0;
    }

    public int credits() {
        return credits;
    }
    
    public void study() {
        credits = credits() + 1;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits();
    }
    
}
