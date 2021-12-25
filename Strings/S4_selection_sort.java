package com.Strings;

public class S4_selection_sort
{
    public static void main(String[] args)
    {
        String[] str = {"yogesh", "dhikaa", "paripoo", "lenda"};
        int min;
        String temp="";
        for (int i=0;i<=str.length-1;i++)
        {
            min=i;
            for (int j=i+1;j<str.length;j++)
            {
                if (str[min].compareTo(str[j])>0)
                {
                   min=j;
                }
            }
            temp=str[i];
            str[i]=str[min];
            str[min]=temp;
        }

        for (String el:str
             ) {
            System.out.print(el+" ");
        }

    }
}
