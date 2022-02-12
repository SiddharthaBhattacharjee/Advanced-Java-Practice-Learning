package com.example;

import java.util.Collection;
import java.util.HashSet;

public class p18_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5,0.75f);
        hs.add(1);
        hs.add(6);
        hs.add(9);
        hs.add(13);
        hs.add(13); // repetition will be considered as same element i.e. ignored
        System.out.printf("Initial HashSet : ");
        System.out.println(hs);// can directly print
        hs.remove(9); // here remove by object
        System.out.printf("HashSet after removing 9 : ");
        System.out.println(hs);
        Object clone = hs.clone();
        System.out.printf("This is clone of hs : ");
        System.out.println(clone);
        if(hs.isEmpty()){
            System.out.println("hs is empty now");//wont work now , since hs is not empty.
        }
        hs.clear();
        if(hs.isEmpty()){
            System.out.printf("hs is empty now : ");//will work now , since hs is empty.
        }
        System.out.println(hs);
        hs.addAll((Collection<? extends Integer>) clone);// clone acting as backup
        System.out.printf("Recovered hs from the clone : ");
        System.out.println(hs);
    }
}
