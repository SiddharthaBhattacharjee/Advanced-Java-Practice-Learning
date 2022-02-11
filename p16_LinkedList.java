package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class p16_LinkedList {
    public static void printLinkedList(LinkedList<Integer> list){
        System.out.printf("[ ");
        for(int i : list){
            System.out.printf(i+",");
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(6);
        list1.add(4);
        System.out.printf("ArrayList before adding more element : ");
        printLinkedList(list1);
        System.out.println("Current siz of ArrayList is : "+list1.size());
        list1.add(9);
        list1.add(8);
        list1.add(1);
        System.out.printf("LinkedList after adding more element : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
        list1.add(0,3);//add 3 in 1st place
        System.out.printf("LinkedList after adding new first element : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
        list1.remove(0);
        System.out.printf("LinkedList after removing first element : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
        Collections.sort(list1);
        System.out.printf("LinkedList after sorting element : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
        list1.addLast(42);
        System.out.printf("LinkedList after adding 42 at last position : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
        list1.addFirst(0);
        System.out.printf("LinkedList after adding 0 at First position : ");
        printLinkedList(list1);
        System.out.println("Current size of LinkedList is : "+list1.size());
    }
}
