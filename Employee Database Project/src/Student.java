/*
 * Rose, Raj, Sophie
 * August 18th, 2023
 * This program will allow the user to store the data of students, employees and the inventory at a school
 * This is the Student class. 
 */

import java.util.ArrayList;

public class Student extends Person {
    // define variables needed for student
    private int grade;
    private String parentName, parentEmail;
    private long parentPhone;
    private double averageMark;
    
    // constructor method
    public Student(String firstName, String lastName, String dob, String email, int number, int grade, String parentName, String parentEmail, long parentPhone, double averageMark) {
        // get all info
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.number = number;
        this.grade = grade;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.parentPhone = parentPhone;
        this.averageMark = averageMark;
        
    }
    
    // getters to access outside of class
    public int getGrade() {
        return grade;
    }

    public String getParentName() {
        return parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public String getParentPhone() {
        // write in phone number format (123-456-7890)
        String stringPhone = parentPhone + ""; // convert to string
        String formattedPhone = stringPhone.substring(0, 3) + "-" + stringPhone.substring(3, 6) + "-" + stringPhone.substring(6, 10); // write in phone number format
        
        return formattedPhone;
    }

    public double getAverageMark() {
        return averageMark;
    }
    
    // setters to set fields out of class

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setParentPhone(int parentPhone) {
        this.parentPhone = parentPhone;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    
    // method to calculate total average marks of the school
    public static double calculateTotalAverage(ArrayList<Student> students) {
        int numOfStudents = students.size(); // find number of students
        double totalMarks = 0;
        
        for (Student student : students) { // iterate through array
            totalMarks += student.getAverageMark();
        }
        
        double average = totalMarks / numOfStudents; // average = total marks / number of students
        average = Math.round(average*100); // round to nearest hundred
        average /= 100;
        
        return average;
    }
    
    // override toString method 
    @Override
    public String toString() {
        //formatted to write it to the file
        return firstName + "," + lastName + "," + dob + "," + email + "," + number + "," + grade + "," + parentName + "," + parentEmail + "," + parentPhone + "," + averageMark;
    }
    
    
    
}
