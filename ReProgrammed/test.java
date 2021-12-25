package com.ReProgrammed;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int [] arr1=new int[N];


        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]=s.nextInt();
        }



        int M=s.nextInt();
        int [] arr2=new int[M];

        for(int i=0;i<=arr2.length-1;i++){
            arr2[i]=s.nextInt();
        }




        int sumN=0;
        for(int i=0;i<=arr1.length-1;i++){
            sumN=(10*arr1[i])+sumN;
        }
        int sumM=0;
        for(int i=0;i<=arr1.length-1;i++){
            sumM=(10*arr2[i])+sumM;
        }
        int result=sumN+sumM;
        int rev=0;
        int lastrev=0;
        while(result>0){
            rev=result%10;
            lastrev=(10*rev)+lastrev;
            result=result/10;
        }

        int print=0;
        while(lastrev>0){
            rev=lastrev%10;
            print=(10*rev)+print;

            System.out.println(print+" ");
            lastrev=lastrev/10;
        }



    }
}
