package com.DSA_assignments;
class Solution {
    public int search(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {
            //This mid is calculating the middle element of the array
            int mid=start+((end-start)/2);

            //This if block is returning the index of the target if target present in the array
            if(nums[mid]==target)
            {
                return mid;
            }

            //If our target is smaller than mid then we discards array after mid and begins our search in remaining array
            if(target<nums[mid])
            {
                end=mid-1;
            }
            //This else block does the vice versa of if block
            else
            {
                start=mid+1;
            }
        }


      //If target is not present in array then we returning this -1
        return -1;
    }
}

//This is our main class
public class D1_return_index
{
    public static void main(String[] args)
    {
        //Object of solution class
        Solution s=new Solution();

        int arr[]={-1,0,3,5,9,12};

        //Calling the search mehthod of solution class and storing it in result variable
        //We can call this method in print function as well
       int result= s.search(arr,2);

        System.out.println(result);
    }
}
