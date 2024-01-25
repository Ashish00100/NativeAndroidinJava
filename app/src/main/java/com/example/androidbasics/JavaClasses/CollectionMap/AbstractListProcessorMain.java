
//Question 1 : Create an abstract class AbstractListProcessor with an abstract method processList(LinkedList<Integer> list). Implement this class in two subclasses: SumListProcessor and ProductListProcessor. Each subclass should provide its own implementation of processList(), which calculates the sum and product of the elements in the linked list, respectively. Write a program to demonstrate the use of these classes.

package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.LinkedList;

abstract class AbstractListProcessor{
   abstract int processList(LinkedList<Integer> list);
}

class SumListProcessor extends AbstractListProcessor{

    @Override
    int processList(LinkedList<Integer> list) {
        int sum = 0;
        for(Integer element : list){
            sum = sum + element;
        }
        return sum;
    }
}

class ProductListProcessor extends AbstractListProcessor{

    @Override
    int processList(LinkedList<Integer> list) {
        int product = 1;
        for(Integer element: list){
            product = product * element;
        }
        return product;
    }
}

public class AbstractListProcessorMain {
    public static void main(String[] args) {

        LinkedList<Integer> listProcess = new LinkedList<Integer>();
        listProcess.add(3);
        listProcess.add(7);
        listProcess.add(4);
        listProcess.add(2);
        listProcess.add(9);

        AbstractListProcessor addProcess = new SumListProcessor();
        int addResult = addProcess.processList(listProcess);
        System.out.println("Sum is :"+ addResult );

        AbstractListProcessor productProcess = new ProductListProcessor();
        int productResult = productProcess.processList(listProcess);
        System.out.println("Product is :"+ productResult );
    }
}
