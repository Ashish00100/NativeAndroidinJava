
//Question 2 : Design a class OrderedSet that inherits from LinkedHashSet<String>. Override the add() method to maintain the order of elements based on their insertion. Write a program to demonstrate the use of this class by adding elements and displaying them in the order of insertion.

package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.LinkedHashSet;

class OrderSet extends LinkedHashSet<String>{

    @Override
    public boolean add(String element){
        return super.add(element);
    }
}

public class OrderSetMain {
    public static void main(String[] args) {
        OrderSet order = new OrderSet();
        order.add("Ashish");
        order.add("Rahul");
        order.add("Sohit");
        order.add("Ishita");
        order.add("Ketan");

        System.out.println("Order of Insertion is :"+ order);
    }
}
