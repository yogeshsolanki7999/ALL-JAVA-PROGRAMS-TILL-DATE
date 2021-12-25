package com.DSA_Practice;

public class D7_minimum_in_rotated_array
{
    public static void main(String[] args)

    {
        int [] arr={3,4,5,6,2};
        int start=0;
        int end=arr.length-1;

        if (arr.length < 2)
        {
            System.out.println(arr[0]);

        }

        if (arr[start] < arr[end])
        {
            System.out.println(arr[0]);
        }

        while (start <= end)
        {
            int mid=start+((end-start)/2);

            if ((mid < end) && arr[mid]>arr[mid+1])
            {
                System.out.println(arr[mid+1]);
                break;
            }
            else if ((mid > start) && arr[mid]<arr[mid-1])
            {
                System.out.println(arr[mid]);
                break;
            }
            else if (arr[start] < arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            {

            }
        }

    }
}
