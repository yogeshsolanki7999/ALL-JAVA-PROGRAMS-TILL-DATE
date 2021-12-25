package com.pracrtice_geeks;

public class P16_Reverse_an_array {
    public static void main(String[] args) {
        String str = "shikha parmar";
        char ch[] = str.toCharArray();
        int p1 = 0;
        int p2 = ch.length - 1;
        int temp = 0;
        while (p1<p2){
            ch[temp] = ch[p1];
            ch[p1] = ch[p2];
            ch[p2] = ch[temp];

            p1++;
            p2--;
        }

        for (char c:ch
        ) {
            System.out.print(c);
        }
    }
}
