package com.Raja.Oops;
class stat{
   static int a;

     public static void print(){
         int b=2;
         System.out.println(a+b);

     }
}

public class O4_static {
    public static void main(String[] args) {
        stat.a=9;
        stat.print();
    }
}
