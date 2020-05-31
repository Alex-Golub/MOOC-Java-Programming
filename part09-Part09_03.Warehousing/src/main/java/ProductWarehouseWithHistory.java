/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * May 31, 2020 7:12:46 PM
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        // Set the initial balance as the initial balance of the warehouse, 
        // as well as the first value of the change history.
        super.addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double took = super.takeFromWarehouse(amount);
        changeHistory.add(this.getBalance());
        
        return took;
    }
    
    public void printAnalysis() {
        System.out.println(
                "Product: " + this.getName() +
                "\nHistory: " + this.changeHistory.toString() +
                "\nLargest amount of product: " + this.changeHistory.maxValue() +
                "\nSmallest amount of product: " + this.changeHistory.minValue() +
                "\nAverage: " + this.changeHistory.average()
        );
                
    }
}
