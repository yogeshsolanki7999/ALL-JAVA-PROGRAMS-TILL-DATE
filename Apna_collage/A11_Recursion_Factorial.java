package com.Apna_collage;

public class A11_Recursion_Factorial {
    public static int fact(int n){
        if (n==0 || n==1) {

            return 1;
        }
       int factorial= fact((n-1));
        int result=n*factorial;
        return  result;

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
