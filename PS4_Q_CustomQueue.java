package com.example;

//Statement : Make a custom class to implement queue using arraylist that doesn't allow duplicate elements using appropriate exception handling.
// Make a documentation of the class

import java.util.ArrayList;

/**
 * <i>Throws error in case a non existent index of queue is tried to be accessed (underflow).<br>
 * Cases : trying to access index of Empty queue, trying to access out of bound index .</i>
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

class QueueUnderflow extends Exception{
    @Override
    public String toString(){
        return "Error : Queue UnderFlow";
    }
    @Override
    public String getMessage(){
        return "Message : Queue UnderFlow , Trying to extract null object";
    }
}

/**
 * <i>Throws error in case an out of bound existent index of queue is tried to be pushed to (underflow).<br>
 * Cases : trying to push element to out of bound index .</i>
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

class QueueOverflow extends Exception{
    @Override
    public String toString(){
        return "Error : Queue OverFlow";
    }
    @Override
    public String getMessage(){
        return "Message : Queue OverFlow , Trying to add/access out of bound index";
    }
}

/**
 * <i>Throws error in case a any unchecked or unexpected error which is not handled .</i>
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

class QueueUnknownError extends Exception{
    @Override
    public String toString(){
        return "Error :Unknown Exception Occurred";
    }
    @Override
    public String getMessage(){
        return "Message : Unknown Exception Occurred!";
    }
}

/**
 * <i>Implements the queue data structure with a unique element only property.</i><br>
 * Queue is a data collection where data is stored in an array and is accessed in the FIFO (First in First Out) order.
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

class myQueue{
    /**
     *Used to store and operate the queue
     */
    ArrayList<Integer> arr = new ArrayList<>();

    /** Default Constructor for myQueue objects.<br>
     * Initiates an object of the myQueue Class
     * @return void
     * */
    public myQueue(){
        //pass
    }

    /** Constructor for myQueue objects, to initialize with a initial set of values in the queue.<br>
     * In case of duplicate values in passed array, only first occurrence is added to the queue.
     * @return void
     * @param arr array of values to initialise the queue with. In case of duplicate, only first occurrence is added.
     * */
    public myQueue(int[] arr){
        for(int i:arr){
            if(this.arr.contains(i)){
                continue;
            }
            this.arr.add(i);
        }
    }

    /** Constructor for myQueue objects.<br>
     * Initiates an object of the myQueue Class with one initial value in the queue.
     * @param a initial integer in the queue
     * @return void
     * */
    public myQueue(int a){
        this.arr.add(a);
    }

    /** Pushes the value to the end of the queue(last position)
     * @return void
     * @param a Integer to be pushed in the queue
     * @throws QueueOverflow
     * @throws QueueUnknownError
     * */
    public void push(int a) throws QueueOverflow, QueueUnknownError {
        try{
            if(! this.arr.contains(a)){
                this.arr.add(a);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueOverflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }
    }

    /** Removes and returns the first value of the queue(first inserted value)
     * @return Integer
     * @throws QueueUnderflow
     * @throws QueueUnknownError
     * */
    public int pop() throws QueueUnderflow, QueueUnknownError {
        try{
            int a = this.arr.get(0);
            this.arr.remove(0);
            return a;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueUnderflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }

    }

    /** Removes and returns the value from a specific position of the queue.
     * @return Integer
     * @param pos Position of element to be removed.
     * @throws QueueUnderflow
     * @throws QueueUnknownError
     * */
    public int remove(int pos) throws QueueUnderflow, QueueUnknownError {
        try{
            int x = this.arr.get(pos);
            this.arr.remove(pos);
            return x;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueUnderflow();
        }
        catch(Exception e){
            throw new QueueUnknownError();
        }

    }

    /** Adds the given element to the specified position in the queue
     * @return void
     * @param a element to be added
     * @param pos Position of element to be added.
     * @throws QueueOverflow,
     * @throws QueueUnknownError
     * */
    public void add(int a, int pos) throws QueueOverflow, QueueUnknownError {
        try{
            if(! this.arr.contains(a)){
                this.arr.add(pos,a);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueOverflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }
    }
    /** Returns the integer to be popped next (first position) without removing it.
     * @return Integer
     * @throws QueueUnderflow
     * @throws QueueUnknownError
     * */
    public int peek() throws QueueUnderflow, QueueUnknownError {
        try{
            return this.arr.get(0);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueUnderflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }
    }

    /** Returns the last added integer (last position) without removing it.
     * @return Integer
     * @throws QueueUnderflow
     * @throws QueueUnknownError
     * */
    public int peekLast() throws QueueUnderflow, QueueUnknownError {
        try{
            return this.arr.get(this.arr.size()-1);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueUnderflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }

    }
    /** Returns the integer at a specified position without removing it.
     * @return Integer
     * @param pos Position of element to be peeked.
     * @throws QueueUnderflow
     * @throws QueueUnknownError
     * */
    public int peek(int pos) throws QueueUnderflow, QueueUnknownError {
        try{
            return this.arr.get(pos);
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new QueueUnderflow();
        }
        catch (Exception e){
            throw new QueueUnknownError();
        }
    }
    /** Prints/displays the queue (makes it easier to visualise).
     * @return void
     * */
    public void display(){
        System.out.println("[ ");
        for(int i=0;i<this.arr.size();i++){
            if(i==0){
                System.out.println(this.arr.get(i)+"<- ,");
            }
            else{
                System.out.println(this.arr.get(i)+" , ");
            }
        }
        System.out.println(" ]");
    }

    /** Returns the Queue in ArrayList form.
     * @return ArrayList\<Integer\>
     * */
    public ArrayList<Integer> getQueueArrayList(){
        return this.arr;
    }
}

/**
 * <i>Test static class to test the myQueue Class.</i><br>
 * Creates two myQueue Objects q1 and q2 and tests the class methods.
 * @author Siddhartha Bhattacharjee
 * @version 1.0.0
 * */

public class PS4_Q_CustomQueue {
    public static void main(String[] args) throws QueueUnknownError, QueueOverflow, QueueUnderflow {
        myQueue q1 = new myQueue(new int[]{2, 3, 5, 6, 3, 9});
        myQueue q2 = new myQueue();
        System.out.println("Q1 initialised : ");
        q1.display();
        System.out.println("Q2 initialised : ");
        q2.display();
        q2.push(1);
        q2.push(3);
        q2.push(3);
        q2.push(5);
        q2.push(7);
        System.out.println("Q2 after adding : ");
        q2.display();
        q2.remove(1);
        System.out.println("Q2 after removing 1th place element");
        q2.display();
        q2.pop();
        System.out.println("Q2 after poping");
        q2.display();
        q2.push(1);
        System.out.println("Q after pushing");
        q2.display();
    }
}
