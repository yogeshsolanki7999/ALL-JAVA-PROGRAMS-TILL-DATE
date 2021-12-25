package com;

public class dsa {
    public static void main(String[] args) {
        int [] arr={10,15,25,42,61,90,103};

        int end= arr.length-1;
        int start=0;
        int t=15;

        while (start<=end){
            int mid=start+((end-start)/2);
            if (arr[mid]==t){
                System.out.println(arr[mid]);
                break;
            }

            if (t<mid){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
    }
}
