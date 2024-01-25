
//Question 4 : Create a class ContactBook that encapsulates a TreeMap<String, String> where the key is a contact name, and the value is the corresponding phone number. Provide methods to add a contact, retrieve the phone number based on the name, and remove a contact. Ensure encapsulation by appropriately controlling access to the TreeMap.

package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.TreeMap;

public class ContactBookMain {
    public static void main(String[] args) {
        //Question-4
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Ashish","99973463746");
        contactBook.addContact("Rahul","9234785555");
        contactBook.addContact("Sohit","98374565788");
        contactBook.addContact("Ketan","999974383648");
        contactBook.addContact("Ishita","937848464666");
        System.out.println(contactBook.getContacts());
        System.out.println(contactBook.retrieveContact("Searched contact : "+"Ashish"));
        contactBook.removeContact("Sohit");
        System.out.println("Contacts after removal : "+contactBook.getContacts());
    }
}
