package com.pracrtice_geeks;

public class P8_string_comprasion {
    public static void main(String[] args) {
        String str = "aaabbccdeffc&";
        char []ch =str.toCharArray();



        for (int i=1;i<str.length();i++){
            int current=i;
            int prev=i-1;
            if (ch[current]==ch[prev]){
                continue;
            }
            else {
                System.out.println(ch[prev]);
            }

        }
    }}