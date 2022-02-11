package com.example;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;

public class p17_ArrayDequeue {
    public static void printaDeque(ArrayDeque<Integer> list){
        System.out.printf("[ ");
        for(int i : list){
            System.out.printf(i+",");
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(6);
        dq.add(9);
        dq.add(4);
        dq.add(2);
        System.out.printf("ArrayDeque before adding more element : ");
        printaDeque(dq);
        System.out.println("Current siz of ArrayDeque is : "+dq.size());
        dq.addFirst(1);
        dq.addLast(0);
        System.out.printf("ArrayDeque after adding elements to first and last : ");
        printaDeque(dq);
        System.out.println("Current siz of ArrayDeque is : "+dq.size());
        System.out.println("First Element of ArrayDeque is : "+dq.getFirst());
        System.out.println("Last Element of ArrayDeque is : "+dq.getLast());
    }
}
