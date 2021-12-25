package com.Harry;
 class Cellphone{
    public void CellphoneMethod1() {
        System.out.println("CellPhoneMethod1");
    }
    public void CellphoneMethod2(){
        System.out.println("CellPhoneMethod1");
    }
}

interface Gps{
       void GpsMeth1();
       void GpsMeth2();
}
interface Camera{
       void CameraMeth1();
       void CameraMeth2();
}
interface MediaPlayer{
       void MediaPlayer();
       void MediaPlayer2();
}
class SmartPhone1 extends CellPhone implements Gps,Camera,MediaPlayer{
    public  void GpsMeth1(){
        System.out.println("GpsMeth1");
    }
   public void GpsMeth2(){
       System.out.println("GpsMeth2");
    }

   public void CameraMeth1(){
        System.out.println("CameraMeth1");
    }
    public void CameraMeth2(){
        System.out.println("CameraMeth2");
    }
     public void MediaPlayer(){
         System.out.println("MediaPlayer");
    }
    public void MediaPlayer2(){
        System.out.println("MediaPlayer2");
    }
    public void SmartMethodd(){
        System.out.println("I am smart methods");
    }
}

public class y44_Polymorphism_in_interface {
    public static void main(String[] args) {
        Gps g=new SmartPhone1();
        g.GpsMeth1();

        SmartPhone1 sm=new SmartPhone1();
        sm.SmartMethodd();
    }
}
