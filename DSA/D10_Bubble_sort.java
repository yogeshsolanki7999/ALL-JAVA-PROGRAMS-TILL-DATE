package com.DSA;

public class D10_Bubble_sort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        boolean issorted=true;

        //Bubble sort

        for (int i=0;i< arr.length-1;i++)
        {
            for (int j=0;j< arr.length-i-1;j++)
            {
                if (arr[j]>arr[j+1])

                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    issorted=false;
                }
            }

            if (issorted)
            {
                break;
            }
        }
        for (int el:arr)
        {
            System.out.print(el+" ");
        }
    }
}
