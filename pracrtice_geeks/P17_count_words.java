package com.pracrtice_geeks;

public class P17_count_words {
    public static void main(String[] args) {
        String str="Hello my name is yogesh";
        int count=0;
        for (int i=0;i<=str.length()-1;i++){

            if ((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
