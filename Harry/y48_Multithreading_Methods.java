package com.Harry;
 class ThreadOp {

 }
public class y48_Multithreading_Methods {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED......");

        //TO PRINT NAME OF THE THREAD
       Thread t=Thread.currentThread();
       String str=t.getName();
        System.out.println(str);
       t.setName("yogesh main");
        System.out.println(t.getName());
        System.out.println("THE NAME OF CURRENT THREAD IS ");

         try {
             Thread.sleep(9000);
         }catch (Exception e){

         }
        System.out.println("PROGRAM ENDED");

    }
}
