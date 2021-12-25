package com.DSA;

public class D3_ceil {
    public static void main(String[] args) {
        int [] arr={10,20,25,26,27,29};
        int target=21;
        int start=0;
        int end=arr.length-1;

        while (start<=end)
        {
          int mid=start+((end-start)/2);



          if (target<arr[mid])
          {
              end=mid-1;
          }
          else
          {
              start=mid+1;
          }



        }

        System.out.println(arr[start]);
    }
}
