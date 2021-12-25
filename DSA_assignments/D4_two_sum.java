package com.DSA_assignments;

public class D4_two_sum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};

        int start=0;
        int target=22;
        int end=arr.length-1;
        while (start<=end)
        {
            int sum=arr[start]+arr[end];

            if (sum==target)
            {
                System.out.println(start+" "+end);
                break;

            }
            else if (sum>target)
            {
                end--;
            }
            else
            {
            start++;
            }
        }
    }
}
