package com.DSA_Practice;
class SolutionFloor{
    public int floor(int arr[] , int target)
    {
        int start=0;
        int end= arr.length-1;

        while (start <=end)
        {
            int mid=start+((end-start)/2);
            if (target==arr[mid])
            {
                System.out.println("ELEMENT IS PRESENT IN ARRAY KINDLY INSERT THE NEW ELEMENT WHICH IS NOT PRESENT");
                return 0;
            }

            if (target < arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return arr[end];
    }
}

public class Dp_2_Find_the_floor_of_target_not_present {
    public static void main(String[] args) {


   SolutionFloor s=new SolutionFloor();
    int [] arr={10,15,25,42,61,90,103};
    int target=11;

        System.out.println("YOUR TARGET IS "+ target+"AND FLOOR ELEMENT IS"+s.floor(arr,target));


}}
