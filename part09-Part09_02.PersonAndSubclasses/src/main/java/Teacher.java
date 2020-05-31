/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * May 24, 2020 11:56:19 PM
 */
public class Teacher extends Person {
    
    private int salary;

    public Teacher(String fullName, String address, int salary) {
        super(fullName, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + getSalary() + " euro/month";
    }
}
