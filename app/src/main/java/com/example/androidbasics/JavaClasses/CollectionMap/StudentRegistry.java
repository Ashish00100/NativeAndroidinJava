package com.example.androidbasics.JavaClasses.CollectionMap;

import java.util.HashMap;

public class StudentRegistry {
    public HashMap<Integer, String> getH() {
        return h;
    }

    private HashMap<Integer, String> h = new HashMap<Integer, String>();

    public void addStudent(Integer id, String name ){
        h.put(id, name);
    }

    public String retrieveStudent(Integer id){
        return h.get(id);
    }

    public void removeStudent(Integer id){
        h.remove(id);
    }
}
