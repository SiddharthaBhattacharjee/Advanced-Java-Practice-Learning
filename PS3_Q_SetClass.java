package com.example;

//Statement : Create a class to implement a integer stack in java using arraylist such that it doesn't allow duplicate items, use proper exception handling.

import java.util.ArrayList;

class StackUnderflow extends Exception{
    @Override
    public String toString(){
        return "Error : Stack UnderFlow";
    }
    @Override
    public String getMessage(){
        return "Message : Stack UnderFlow , Trying to extract null object";
    }
}

class StackOverflow extends Exception{
    @Override
    public String toString(){
        return "Error : Stack OverFlow";
    }
    @Override
    public String getMessage(){
        return "Message : Stack OverFlow , Trying to add to out of bound index";
    }
}

class StackUnknownError extends Exception{
    @Override
    public String toString(){
        return "Error :Unknown Exception Occured";
    }
    @Override
    public String getMessage(){
        return "Message : Unknown Exception Occured!";
    }
}

class customStack{
    ArrayList<Integer> s = new ArrayList<Integer>();
    public int peek(int pos) throws StackUnderflow, StackUnknownError {
        try{
            return s.get(pos);
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new StackUnderflow();
        }
        catch (Exception e){
            System.out.println(e);
            throw new StackUnknownError();
        }

    }
    public int pop() throws StackUnderflow, StackUnknownError {
        try{
            int res = s.get(s.size()-1);
            s.remove(s.size()-1);
            return res;
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new StackUnderflow();
        }
        catch (Exception e){
            System.out.println(e);
            throw new StackUnknownError();
        }
    }
    public void push(int a) throws StackOverflow, StackUnknownError {
        if(s.contains(a)){
            System.out.println("Removed Duplicate "+2);
        }
        try{
            s.add(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new StackOverflow();
        }
        catch (Exception e){
            System.out.println(e);
            throw new StackUnknownError();
        }
    }
    public int pointing() throws StackUnderflow, StackUnknownError {
        try{
            return s.get(s.size()-1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new StackUnderflow();
        }
        catch (Exception e){
            System.out.println(e);
            throw new StackUnknownError();
        }
    }
    public void display(){
        if(s.isEmpty()){
            System.out.println("EMPTY STACK [] !");
        }
        else{
            System.out.println("[");
            for(int i=s.size()-1;i>=0;i--){
                if(i== s.size()-1){
                    System.out.println(s.get(i)+ " <- Pointing");
                }
                else{
                    System.out.println(s.get(i));
                }
            }
            System.out.println("]");
        }
    }
}

public class PS3_Q_SetClass {
    public static void main(String[] args) {
        customStack stk = new customStack();
        try{
            stk.push(2);
            stk.push(5);
            stk.push(11);
            stk.push(13);
            stk.push(7);
            stk.push(5);
            stk.peek(3);
            stk.pop();
            int i = stk.pop();
            System.out.println(i);
            int p = stk.pointing();
            System.out.println(p);
            stk.display();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
