package com.DSA_Practice;
class SolutionFloorPresent
 {
    public int floorPresent(int[] arr,int target)
    {
        int start=0;
        int end= arr.length-1;

        while (start <= end)
        {
           int mid=start+((end-start)/2);

           if (target==arr[mid])
           {
               if (arr[mid]==arr[0])
               {
                   return arr[0];
               }

                   return arr[mid-1];


           }
           else if (target < arr[mid])
           {
            end=mid-1;
           }
           else
           {
               start=mid+1;
           }
        }

        return 0;
    }
 }
public class Dp_4_Find_the_floor_of_target_present
 {
    public static void main(String[] args)
    {
        SolutionFloorPresent s=new SolutionFloorPresent();
        int[] arr={3,6,9,12,14,16,19,21,23};
        int target=23;
        int result=s.floorPresent(arr,target);

        if (result==0)
        {
            System.out.println("THE TARGET IS NOT PRESENT IN ARRAY PLEASE CHOOSE ONCE MORE");
        }
        else
        {
            System.out.println(result);
        }

    }
 }
