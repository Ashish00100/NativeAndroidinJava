//Question 5 : Create an abstract class AbstractSetProcessor with an abstract method processSet(TreeSet<String> set). Implement this class in two subclasses: UpperCaseSetProcessor and LowerCaseSetProcessor. Each subclass should provide its own implementation of processSet(), which converts the elements in the TreeSet to uppercase and lowercase, respectively. Write a program to demonstrate the use of these classes.

package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.TreeSet;

abstract class AbstractSetProcessor{
    abstract void processSet(TreeSet<String> set);
}

class UpperCaseSetProcessor extends AbstractSetProcessor {
    @Override
    public void processSet(TreeSet<String> set) {
        TreeSet<String> upperCaseSet = new TreeSet<>();
        for (int i = 0; i < set.size(); i++) {
            String element = (String) set.toArray()[i];
            upperCaseSet.add(element.toUpperCase());
        }
        set.clear();
        set.addAll(upperCaseSet);
    }
}

class LowerCaseSetProcessor extends AbstractSetProcessor {
    @Override
    public void processSet(TreeSet<String> set) {
        TreeSet<String> lowerCaseSet = new TreeSet<>();
        for (String element : set) {
            lowerCaseSet.add(element.toLowerCase());
        }
        set.clear();
        set.addAll(lowerCaseSet);
    }
}
public class AbstractSetProcessorMain {
    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("pomegranate");
        stringSet.add("Kiwi");

        AbstractSetProcessor upperCase = new UpperCaseSetProcessor();
        upperCase.processSet(stringSet);
        System.out.println("UpperCase : " + stringSet);

        AbstractSetProcessor lowerCase = new LowerCaseSetProcessor();
        lowerCase.processSet(stringSet);
        System.out.println("LowerCase : " + stringSet);
    }
}
