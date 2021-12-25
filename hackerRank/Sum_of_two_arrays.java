package com.hackerRank;

import java.util.Scanner;

class solution0 {
    public static  int length(int result){
        int count=0;
        int rem=0;
        while (result>0){
            rem=rem%10;
            result=result/10;
count++;

        }
        return count;
    }

}


public class Sum_of_two_arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

 int [] n=new int[s.nextInt()];

 for (int i=0;i<=n.length-1;i++){
     n[i]=s.nextInt();

 }
        int [] m=new int[s.nextInt()];
 for (int i=0;i<=m.length-1;i++){
     m[i]=s.nextInt();

 }

 int sumN=0;
 int sumM=0;
   for (int i=0;i<=n.length-1;i++){

       sumN=(sumN*10)+n[i];
   }
   for (int i=0;i<=m.length-1;i++){

       sumM=(sumM*10)+m[i];
   }

   int finall=sumM+sumN;
        int [] last=new int[solution0.length(finall)];
        int rem=0;
        int pointer=last.length-1;
        while (finall>0){
        rem=finall%10;
        last[pointer]=rem;
        pointer--;
        finall=finall/10;
        }

        for (int el:last
             ) {
            System.out.print(el+" ");
        }


    }

}
