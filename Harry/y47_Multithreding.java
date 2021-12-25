package com.Harry;

// 1 WAYS OF CREATING THREAD USING RUNNABLE INTERFACE

class Mythread implements Runnable{
    public void run(){
        for (int i=0;i<=10;i++){
            System.out.println("VALUE OF I IS "+i);

            //THIS METHOD IS DELAYED THE OUTPUT AND 1000MILI=1SEC IT ALSO THROWS AND EXCEPTION SO WE HAVE TO  CATCH IT
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}




// 2 WAYS OF CREATING THREAD USING THREAD CLASS

class Mythread2 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("THE VALUE OF I = " + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}


public class y47_Multithreding {
    public static void main(String[] args){


        Mythread m=new Mythread();

        Thread thread=new Thread(m);
        thread.start();


        Mythread2 t=new Mythread2();
        t.start();



    }



}
