package com.Apna_collage;

public class A9_Recursion_print_1to5 {
    public  static void print(int n){
        if (n>=6){
            return;
        }
        System.out.println(n);

        print(n+1);

    }
    public static void main(String[] args) {

        print(1);
    }
}
