package com.Strings;

public class S3_bubble_sort {
    public static void main(String[] args) {
        String [] str={"abc","shikha","yogesh","pari"};
        String temp;

        for (int i=0;i<str.length;i++)
        {
            int flag=0;
            for (int j=0;j<str.length-1-i;j++)
            {

                if (str[j].compareTo(str[j+1])>0)
                {
                    temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }


        }

        for (String s:str
             ) {
            System.out.println(s +" ");
        }
    }
}
