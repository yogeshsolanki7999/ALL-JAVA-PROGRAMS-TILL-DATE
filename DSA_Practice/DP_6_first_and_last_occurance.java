package com.DSA_Practice;

public class DP_6_first_and_last_occurance
{
    public static void main(String[] args)
    {
      int arr[]={1,2,3,3,4,5,66,66,66,6,66,78,78,98};
      int target=66;
      int start=0;
      int end=arr.length-1;
      int first=-1;
      while(start <= end)
      {
          int mid=start+((end-start)/2);

          if (target==arr[mid])
          {
              first=mid;
              end=mid-1;
          }
          else if (target < arr[mid])
          {
              end=mid-1;
          }
          else
          {
              start=start+1;
          }
      }
        System.out.println(first);

    }

}
