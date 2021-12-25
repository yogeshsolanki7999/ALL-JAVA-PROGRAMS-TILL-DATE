package com.DSA_assignments;

public class D3_sqrt {
    public static void main(String[] args) {
        int x=16;
        int start=0;
        int end=x;

        while (start<=end)
        {
           int mid=start+((end-start)/2);

           if ((mid*mid)==x){
               System.out.println(mid);
               break;
           }
           if ((mid*mid)>x)
           {
               end=mid-1;
           }
           else
           {
               start=mid+1;
           }
        }
    }
}
