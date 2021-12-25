package com.DSA_assignments;

import java.util.HashSet;

class Intersection
{
    public int[] intersection(int[] nums1, int[] nums2)
    {

        HashSet<Integer> set =new HashSet<Integer>();

        for(int i:nums1)
        {
            set.add(i);
        }

        HashSet<Integer> inter =new HashSet<Integer>();

        for(int i:nums2)
        {
            if(set.contains(i))
            {
                inter.add(i);
            }

        }

        int[] result =new int[inter.size()];

        int index=0;

        for(int i:inter)
        {
            result[index++]=i;
        }

        return result;
    }
}

public class D5_Intersection_of_array {
    public static void main(String[] args) {
        Intersection obj=new Intersection();
       int[] arr1 = {1,2,2,1};
       int[] arr2 = {2,2};
        for (int el:obj.intersection(arr1,arr2)
             ) {
            System.out.print(el+" ");

        }
    }

}
