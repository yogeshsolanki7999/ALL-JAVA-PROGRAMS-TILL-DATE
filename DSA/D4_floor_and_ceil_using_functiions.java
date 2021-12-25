package com.DSA;

public class D4_floor_and_ceil_using_functiions {
    public static void floor(int target,int[] arr){
        int start=0;
        int end= arr.length-1;
        boolean flg=false;

        while (start<=end)
        {
            int mid=start+((end-start)/2);
            if (target==arr[mid])
            {
                System.out.println(arr[mid]);
                flg=true;
                break;
            }

            if (target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        if (!flg)
        {
            System.out.println(arr[end]);
        }

    }

    public static void ceil(int target,int[] arr){
        int start=0;
        int end= arr.length-1;
        boolean flg=false;

        while (start<=end)
        {
            int mid=start+((end-start)/2);
            if (target==arr[mid])
            {
                System.out.println(arr[mid]);
                flg=true;
                break;
            }

            if (target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        if (!flg)
        {
            System.out.println(arr[start]);
        }
    }
    public static void main(String[] args) {

    }
}
