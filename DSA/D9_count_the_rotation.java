package com.DSA;

public class D9_count_the_rotation {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        int start=0;
        int end= arr.length-1;

        if (arr[start]<arr[end])
        {
            System.out.println(start);

        }

        if (arr.length<2)
        {
            System.out.println(start);
        }

        while (start<=end)
        {
            int mid=start+((end-start)/2);

            if ((mid < end) && arr[mid] > arr[mid+1])
            {
                System.out.println(mid+1);
                break;
            }
            else if ((start < mid) && arr[mid]<arr[mid-1])
            {
                System.out.println(mid);
                break;
            }
            else if (start < mid)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
}
