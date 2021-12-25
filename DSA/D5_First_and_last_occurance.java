package com.DSA;

 public class D5_First_and_last_occurance {
    public int[] Search(int[] nums, int target) {
        int first = firstOccur(nums, target);
        int last = lastOccur(nums, target);

        int[] ans = {first, last};

        return ans;
    }

    public int firstOccur(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target == nums[mid]) {
                first = mid;
                end = mid - 1;
            }
           else if (target < nums[mid]) {
                end = mid - 1;
            }
            else
            {
                start=mid+1;
            }

        }
        return first;
    }
     public int lastOccur(int[] nums, int target) {
         int start = 0;
         int end = nums.length - 1;
         int last = -1;

         while (start <= end) {
             int mid = start + ((end - start) / 2);
             if (target == nums[mid]) {
                 last = mid;
                 start = mid + 1;
             }
             if (target < nums[mid]) {
                 end = mid - 1;
             }
             else
             {
                 start=mid+1;
             }

         }
         return last;
     }


    public static void main(String[] args) {
int arr[]={5,7,8,8,10};
int target=8;
D5_First_and_last_occurance d=new D5_First_and_last_occurance();
        for (int el:d.Search(arr,target)
             ) {
            System.out.print(el+" ");
        }

    }
}
