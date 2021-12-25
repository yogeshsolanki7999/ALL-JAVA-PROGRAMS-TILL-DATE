package com.Raja;
class meth{
    public int n;
    synchronized public void produce(int n){
        this.n=n;
        System.out.println("PRODUCE +"+n);
    }
    synchronized public int consume(int n){
        this.n=n;
        System.out.println("consume ");
        return n;
    }

    class Sprdoce{
        meth c;

    }

}
public class Consumer_problem {

}
