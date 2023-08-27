/*
 * Rose, Raj, Sophie
 * August 18th, 2023
 * This program will allow the user to store the data of students, employees and the inventory at a school
 * This is the Person class. 
 */

public abstract class Person {
    // initialize protected fields based on format provided 
    protected String firstName, lastName, dob, email;
    protected int number;
    
    // getters to access fields outside of class
    public String getDob(){
        return dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public int getNumber() {
        return number;
    }
    
    // setters to set fields outside of class
    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
