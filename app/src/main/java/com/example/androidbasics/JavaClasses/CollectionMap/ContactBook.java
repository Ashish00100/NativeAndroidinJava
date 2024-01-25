package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.TreeMap;

public class ContactBook {
    public TreeMap<String, String> getContacts() {
        return contacts;
    }

    private TreeMap<String,String> contacts = new TreeMap<String, String>();

    public void addContact(String name, String number){
        contacts.put(name,number);
    }
    public String retrieveContact(String name){
        return  contacts.get(name);
    }
    public void removeContact(String name){
        contacts.remove(name);
    }
}
