package com.DSA;
class Selection{
    public int[] sort(int[] arr)
    {

        for (int i=0;i<arr.length-1;i++)
        {
           int smallest=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[smallest] > arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }

        return arr;
    }
}
public class D11_selection_sort
{
    public static void main(String[] args)
    {
        int[] arr={2,65,5,88,96,52,6,58};


        Selection s = new Selection();
        for (int i:s.sort(arr))
        {
            System.out.print(i+" ");
        }

    }

}
