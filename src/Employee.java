/*
 * Rose, Raj, Sophie
 * August 18th, 2023
 * This program will allow the user to store the data of students, employees and the inventory at a school
 * This is the Employee class. 
 */

import java.util.ArrayList;

public class Employee extends Person {
    // define variables needed for employee
    private long phone;
    private String position, department;
    private double salary;
    
    // constructor method
    public Employee(String firstName, String lastName, String dob, String email, int number, long phone, String position, String department, double salary) {
        // get all info
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.number = number;
        this.phone = phone;
        this.position = position;
        this.department = department;
        this.salary = salary;
        
    }
    
    // getters to access outside of class
    public String getDepartment() {
        return department;
    }

    public String getPhone() {
        // write in phone number format (123-456-7890)
        String stringPhone = phone + ""; // convert to string
        String formattedPhone = stringPhone.substring(0, 3) + "-" + stringPhone.substring(3, 6) + "-" + stringPhone.substring(6, 10); // write in phone number format
        
        return formattedPhone;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
    
    // setters to set outside of class
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    // method to calculate total salary
    public static double calculateTotal(ArrayList<Employee> employees) {
        double totalSalary = 0;
        
        for (Employee employee : employees) { // iterate through employees
            totalSalary += employee.getSalary();
        }
        
        totalSalary = Math.round(totalSalary*100); // round to nearest hundred
        totalSalary /= 100;
        
        return totalSalary; 
    }
    
    // method to calculate average salary
    public static double calculateAverage(ArrayList<Employee> employees) {
        int numOfEmployees = employees.size(); // find number of employees
        
        double average = calculateTotal(employees) / numOfEmployees; // average = total salary / number of employees
        average = Math.round(average*100); // round to nearest hundred
        average /= 100;
        
        return average; 
        
    }
    
    // overloaded method to calculate average salary of each department
    public static double calculateAverage(ArrayList<Employee> employees, String targetDepartment) {
        double totalSalary = 0;
        int numOfEmployees = 0;
        
        for (Employee employee : employees) { // iterate through employees
            if (employee.getDepartment().equals(targetDepartment)) { // check if department matches with input
                totalSalary += employee.getSalary();
                numOfEmployees += 1;
            }
        }
        
        double average = totalSalary / numOfEmployees; // average = total salary / number of employees
        average = Math.round(average*100); // round to nearest hundred
        average /= 100;
        
        return average;
    }
    
    // override toString method 
    @Override
    public String toString() {
        //formatted to write it to the file
        return firstName + "," + lastName + "," + dob + "," + email + "," + number + "," + phone + "," + position + "," + department + "," + salary;
    }
    
}
