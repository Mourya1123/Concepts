package com.project.collection;
import java.util.*;

public class listexample {
    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        list1.add("Mango");
        // Iterating the list
        for(String fruit : list1){
            System.out.println(fruit);
        }

    }

}


