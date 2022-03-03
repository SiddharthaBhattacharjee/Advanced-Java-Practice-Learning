package com.example;

class myMeth<T1,T2>{// <T1,T2> are generics, Created a generic class.
    int val;
    private T1 t1;
    private T2 t2;

    public myMeth(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }

    public T1 getT1() {
        return t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class p30_generics {
    public static void main(String[] args) {
        myMeth<String,Integer> obj = new myMeth<>(144,"Hello There",169);// setting datatype of generic <String,Integer>
        int val = obj.getVal();
        int val2 = obj.getT2();
        String val3 = obj.getT1();
        System.out.println(val3+" "+(val2+val));
    }
}
