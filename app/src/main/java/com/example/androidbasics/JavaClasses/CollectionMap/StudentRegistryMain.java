
// Question 3 : Create a class StudentRegistry that encapsulates a HashMap where the key is a student ID (integer) and the value is the corresponding student name. Provide methods to add a student, retrieve the name of a student based on the ID, and remove a student. Ensure encapsulation by appropriately controlling access to the HashMap.

package com.example.androidbasics.JavaClasses.CollectionMap;
public class StudentRegistryMain {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.addStudent(1,"Ashish");
        studentRegistry.addStudent(2,"Rahul");
        studentRegistry.addStudent(3,"Ashish");
        studentRegistry.addStudent(4,"Sohit");
        System.out.println("Student are : "+ studentRegistry.getH());
        studentRegistry.removeStudent(3);
        System.out.println("Search student :"+ studentRegistry.retrieveStudent(1));
        System.out.println("Student are after deletion : "+ studentRegistry.getH());

    }
}
