package com.Gclass;

import java.util.Scanner;

public class Merge_two_array_sort_also {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){

                if(arr[i]>arr[j]){
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        for (int el:arr
             ) {
            System.out.println(el+" ");
        }


    }


}
