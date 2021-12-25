package com.DSA;
class SqareRoot
 {

    public int sqrt(int x)
    {
        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if ((mid * mid) == x) {
                return mid;

            }
            if ((mid * mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return end;
    }
 }

 class SqareRoot2
 {

         public int mySqrt(int x) {

             int start=1;
             int end=x;

             while(start <= end)
             {
                 int mid=start+((end-start)/2);

                 if(mid >= x/mid)
                 {
                     end=mid-1;
                 }
                 else
                 {
                     start=mid+1;
                 }
             }
             return end;
         }

 }

 public class D6_sqrt {
    public static void main(String[] args) {
        int x = 8;
        SqareRoot sq = new SqareRoot();
        System.out.println("SQUARE ROOT BY USING FIRT CLASS  "+sq.sqrt(x));

        SqareRoot2 sq2 = new SqareRoot2();
        System.out.println("SQUARE ROOT BY USING SECOND CLASS "+sq2.mySqrt(x));


    }
}
