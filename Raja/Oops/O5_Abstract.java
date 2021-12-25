package com.Raja.Oops;

 abstract class gym{
abstract public void chest();
abstract public int back();

public void leg(){
    System.out.println("ON SATURDAY");
}
}
 abstract class BmGym extends gym{
     public void chest(){
         System.out.println("ON MONDAY");
     }
}
class GoldGym extends BmGym{
     public int back(){
         System.out.println("ON WEDNESDAY");
         return 1;
     }
}


public class O5_Abstract {
    public static void main(String[] args) {
        GoldGym gg=new GoldGym();
        int resul= gg.back();
        gg.chest();
        gg.leg();
        System.out.println(resul);
    }
}
