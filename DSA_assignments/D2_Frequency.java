package com.DSA_assignments;
class FrequencySolution{
  public int fistOccurance(int [] arr,int target){
      int start=0;
      int end= arr.length-1;
      int first=0;
      while (start<=end)
      {
          int mid= start+((end-start)/2);
          if (target==arr[mid])
          {
              first=mid;
              end=mid-1;

          }
          else if (target<arr[mid])
          {
              end=mid-1;
          }
          else
          {
              start=mid+1;
          }

      }
      return first;
  }
  public int lastOccurance(int [] arr,int target){
      int start=0;
      int end= arr.length-1;
      int last=0;
      while (start<=end)
      {
          int mid= start+((end-start)/2);
          if (target==arr[mid])
          {
              last=mid;
              start=mid+1;

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
      return last;
  }
}
public class
D2_Frequency {
    public static void main(String[] args) {
        FrequencySolution s= new FrequencySolution();
        int arr[]={2,3,6,6,6,6,8,9,10,10,10,10,10,10};
        int target=10;

        int frequency=s.lastOccurance(arr,target) - s.fistOccurance(arr,target);
        System.out.println("THE FREQUENCY OF "+target+" is "+(frequency+1));
}}
