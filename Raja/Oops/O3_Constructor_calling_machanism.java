package com.Raja.Oops;

public class O3_Constructor_calling_machanism {
    public static void main(String[] args) {
        shikha s=new shikha();

    }

}


class yogesh{
     public yogesh(){
         //System.out.println("CONSTRUCTOR OF YOGESH");
    }
}

class shikha extends yogesh{
    public shikha(){
        this(1);
        System.out.println("CONSTRUCTOR 0 SHIKHA");
    }
    public shikha(int a){
        this(1,2,3);
        System.out.println("CONSTRUCTOR 1 OF SHIKHA");
    }
    public shikha(int a,int b){
        System.out.println("CONSTRUCTOR 2 OF SHIKHA");
    }
    public shikha(int a,int b ,int c){
        System.out.println("CONSTRUCTOR 3 OF SHIKHA");
    }
}
