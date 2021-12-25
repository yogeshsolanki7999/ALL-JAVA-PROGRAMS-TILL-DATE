package com.DSA;

public class D6_first_occurance {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,5,6,7,8,8};
        int start=0;
        int end= arr.length-1;
        int first=-1;
        int target=4;

        while (start<=end)
        {
            int mid=start+((end-start)/2);
            if (arr[mid]==target)
            {
                first=mid;
                end=mid-1;
            }
            if (target<mid)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(first);
    }
}
