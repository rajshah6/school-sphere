/*
 * Rose, Raj, Sophie
 * August 18th, 2023
 * This program will allow the user to store the data of students, employees and the inventory at a school
 * This is the Item class. 
 */

public class Item {
    // define variables needed for item
    private int number, totalQuantity, quantityIn, quantityOut;
    private String name;
    
    // constructor method
    public Item(int number, int totalQuantity, int quantityIn, int quantityOut, String name) {
        // get all info
        this.number = number;
        this.totalQuantity = totalQuantity;
        this.quantityIn = quantityIn;
        this.quantityOut = quantityOut;
        this.name = name;
        
    }
    
    //constructor method (for user to only enter four attributes)
    public Item(int number, int totalQuantity, int quantityIn, String name) {
        // get all info
        this.number = number;
        this.totalQuantity = totalQuantity;
        this.quantityIn = quantityIn;
        this.quantityOut = totalQuantity - quantityIn;
        this.name = name;
        
    }
    
    // getters to access outside of class
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getQuantityIn() {
        return quantityIn;
    }

    public int getQuantityOut() {
        return quantityOut;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }
    
    // setters to set fields out of class
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setQuantityIn(int quantityIn) {
        this.quantityIn = quantityIn;
    }

    public void setQuantityOut(int quantityOut) {
        this.quantityOut = quantityOut;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
    
    // override toString method 
    @Override
    public String toString() {
        // formatted to write it to the file
        return number + "," + totalQuantity + "," + quantityIn + "," + quantityOut + "," + name;
    }
    
}
