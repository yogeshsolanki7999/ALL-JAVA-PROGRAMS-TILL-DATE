package com.Arrays;
/*
INSERTION SORT IS ASIMPLE SORTING ALGORITHM THAT WORKS THE WAY WE SORT PLAYING CARDS IN OUR HAND
WE CHOOSE ONE CARD AND INSERT IT IN POSITIONS (ASCENDING AND DECENNDING)
 */
public class A4_Insertion_sort {
    public static void main(String[] args) {
        int[] arr={5,1,6,2,4,3};
        int temp,j;

        for (int i=1;i< arr.length;i++)
        {

            temp=arr[i];
            j=i;

            while (j>0 && arr[j-1]>temp )
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;

        }

    }
}
