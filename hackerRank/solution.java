package com.hackerRank;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ANY VAALUE");
        int t=s.nextInt();

        for (int i=0;i<t;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int n=s.nextInt();
            for (int j=0;j<n;j++){
                a=a+(int)Math.pow(2,j)*b;

                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}
