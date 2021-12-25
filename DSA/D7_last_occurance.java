package com.DSA;

public class D7_last_occurance {
    public static void main(String[] args) {


    int arr[]={5,7,7,8,8,8,10};
    int start=0;
    int end=arr.length-1;
    int last=-1;
    int target=8;

    while (start<=end)
    {
        int mid=start+((end-start)/2);
        if (target==arr[mid])
        {
            last=mid;
            start=mid+1;
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
        System.out.println(last);

}
    }
