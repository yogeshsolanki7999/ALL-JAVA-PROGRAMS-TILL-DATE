package com.Apna_collage;

public class A10_Sum_of_all_natural_numbers_till_n {
    public static void sumT(int n,int i,int sumNum){

        if (i==n){
            System.out.println(sumNum+i);
            return ;
        }
        sumNum=sumNum+i;
        sumT(n,i+1,sumNum);
        System.out.println(i);

    }
    public static void main(String[] args) {
        sumT(5,1,0);
    }
}

