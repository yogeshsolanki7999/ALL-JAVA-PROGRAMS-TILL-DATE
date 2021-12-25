package com.pracrtice_geeks;

public class P18_Equility_of_array {
    public  static boolean equal(int arr[],int arr2[]){

        if (arr.length!=arr2.length){
            return false;
        }else {
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=arr2[i]){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5};
        int arr2[]={1,2,3,4,5};
        if (equal(arr,arr2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
