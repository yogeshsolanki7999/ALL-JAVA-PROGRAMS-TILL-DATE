package com.Arrays;
//THE SLECTION SORT IS A COMBINATION OF SEARCHING AND SORTING .IT SORTS AN ARRAY BY REPEATEDLY FINDING THE MINIMUM
//ELEMENT(COSIDERING ASCENDING ORDER) FROM UNSORTED PART AND PUTTING IT AT THE BEGINING IN EVERY ITERATION OF SELECTION
//SORT THE MINIMUM ELEMENT (CONSIDERING THE ASCENDING OREDER) ELEMENT FROM THE UNSOTED SUBARRAY IS PICKED AND MOVED
//TO THE SORTED SUBARRAY


//THE ALGORITHM MAINTAINS TWO SUBARRAYS IN A GIVEN ARRAY -
//1) THE SUBARRAY WHICH IS ALREADY SORTED
//2)REMAINING SUBARRAY WHICH IS UNSORTED


public class A3_selection_sort {
    public static void main(String[] args) {
        int arr[]={38,52,9,18,6,62,13};
        int min;
        int temp=0;
        for (int i=0;i<= arr.length-1;i++)
        {
            min=i;
            for (int j=i+1;j< arr.length;j++)
            {
                if (arr[min]<arr[j])
                {
                    min=j;
                }
            }

            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        for (int el:arr
             ) {
            System.out.println(el+"  ");
        }

    }
}
