package com.DSA;

public class D2_Floor {
    public static void main(String[] args) {
        int [] arr={1,2,4,12,16,20};
        int target=12;
        int start=0;
        int end=arr.length-1;


        while (start<=end){
            int mid=start+((end-start)/2);


            if (target<arr[mid]){
                end=mid-1;

            }else {
                start=mid+1;

            }
        }
        System.out.println("floor  "+arr[end]);
        System.out.println(target);
        System.out.println("ceil  "+arr[start]);
    }
}
