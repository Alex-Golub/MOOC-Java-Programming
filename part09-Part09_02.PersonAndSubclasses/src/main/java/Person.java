/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * May 24, 2020 7:46:04 PM
 */
public class Person {
       
    private String fullName;
    private String address;

    public Person(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return getFullName() + "\n  " + getAddress();
    }
}
