package com.hackerRank;


import java.util.Scanner;

public class minumum_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[s.nextInt()];
        int[] arr1=new int[1];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for (int i=0;i<=arr.length-1;i++){
            arr1[0]=arr[i];
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr1[0]==arr[j]) {
                    continue;
                }
                    if (arr1[0] > arr[j]) {
                        count++;
                    } else {
                        break;
                    }



                if ((arr.length-count)==i){
                    System.out.println(arr[i]+" ");
                }
            }
        }


    }
}
