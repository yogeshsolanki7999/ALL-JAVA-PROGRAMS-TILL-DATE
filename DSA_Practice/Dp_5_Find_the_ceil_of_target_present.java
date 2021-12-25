package com.DSA_Practice;
class SolutionCeilPresent
{
    public int ceilPresent(int[] arr,int target)
    {
        int start=0;
        int end= arr.length-1;

        while (start <= end)
        {
            int mid=start+((end-start)/2);

            if (target==arr[mid])
            {
                if (arr[mid]==arr[arr.length-1])
                {
                    return arr[arr.length-1];
                }

                return arr[mid+1];


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

public class Dp_5_Find_the_ceil_of_target_present
{
    public static void main(String[] args)
    {
        SolutionCeilPresent s=new SolutionCeilPresent();
        int[] arr={3,6,9,12,14,16,19,21,23};
        int target=16;
        int result=s.ceilPresent(arr,target);

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
