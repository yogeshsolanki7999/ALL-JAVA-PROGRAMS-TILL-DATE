package com.Harry;
 interface ParentInterface{
void meth1();
public void meth2();

}
interface Childinterface extends ParentInterface{
     void meth3();
     void meth4();
}

class Parentclass implements Childinterface{
      public void meth1(){
         System.out.println("meth1");
     }
     public void meth2(){
         System.out.println("meth2");
     }public void meth3(){
         System.out.println("meth3");
     }public void meth4(){
         System.out.println("meth4");
     }

}
public class y43_Inheritance_in_interfaces {
    public static void main(String[] args) {
        Parentclass p=new Parentclass();
        p.meth1();
        p.meth2();
        p.meth3();
        p.meth4();
        ParentInterface p2=new ParentInterface() {
            @Override
            public void meth1() {
                System.out.println("eded");
            }

            @Override
            public void meth2() {
                System.out.println(5);

            }
        };
        p2.meth1();
        p2.meth2();
    }
}
