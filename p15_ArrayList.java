package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class p15_ArrayList {
    public static void printArrayList(ArrayList<Integer> list){ //Arraylist can be directly passed as an arguement
        System.out.printf("[ ");
        for(int i : list){
            System.out.printf(i+",");
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(6);
        list1.add(4);
        System.out.printf("ArrayList before adding more element : ");
        printArrayList(list1);
        System.out.println("Current siz of ArrayList is : "+list1.size());
        list1.add(9);
        list1.add(8);
        list1.add(0);
        System.out.printf("ArrayList after adding more element : ");
        printArrayList(list1);
        System.out.println("Current size of ArrayList is : "+list1.size());
        list1.add(0,3);//add 3 in 1st place
        System.out.printf("ArrayList after adding new first element : ");
        printArrayList(list1);
        System.out.println("Current size of ArrayList is : "+list1.size());
        list1.remove(0);
        System.out.printf("ArrayList after removing first element : ");
        printArrayList(list1);
        System.out.println("Current size of ArrayList is : "+list1.size());
        Collections.sort(list1);
        System.out.printf("ArrayList after sorting element : ");
        printArrayList(list1);
        System.out.println("Current size of ArrayList is : "+list1.size());
    }
}
