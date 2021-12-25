package com.Apna_collage;

public class A8_Recursion_print_5to1 {
    public static void printNum(int n){
        if (n==0){
            return;
        }
        System.out.println(n);

        printNum(n-1);
    }

    public static void main(String[] args) {
        printNum(6);


    }

}
