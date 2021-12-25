package com.DSA_Practice;
class Bubble{
    public int[] sort( int arr[] ){
        Boolean isSorted=true;
        for (int i=0;i< arr.length-1;i++)
        {
            for (int j=0;j< arr.length-i-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSorted=false;

                }
            }
            if (isSorted){
                break;
            }
        }
        return arr;

    }
}
public class D7_Bubble_sort
{
    public static void main(String[] args) {


        int[] arr = {5, 6,7,8,9,10,11};
        Bubble b = new Bubble();
        for (int el:b.sort(arr))
        {
            System.out.print(el+" ");
        }
    }
}
