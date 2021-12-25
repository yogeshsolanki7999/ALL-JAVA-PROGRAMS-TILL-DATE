package com.DSA_Practice;
class SolutionTarget{
    public Boolean targetElement(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while (start <= end)
        {
            int mid=start+((end-start)/2);
            if (arr[mid]==target)
            {
                System.out.println("THE VALUE OF TARGET YOU ENTERED IS "+arr[mid]);
                return true;
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
        return false;
    }

}
public class DP_1_find_target_element {
    public static void main(String[] args) {
        int [] arr={10,15,25,42,61,90,103};
        int target=10;
        SolutionTarget s=new SolutionTarget();
       Boolean result= s.targetElement(arr,target);
        if (result)
        {
            System.out.println("THE TARGET IS PRSENT IN THE ARRAY");
        }
        else
        {
            System.out.println("THE TARGET IS NOT PRESNT IN ARRAY");
        }

    }
}
