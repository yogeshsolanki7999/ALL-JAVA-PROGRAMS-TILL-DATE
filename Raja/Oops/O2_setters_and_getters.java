package com.Raja.Oops;
class pari{
     private int age;
      private String name;
    public void setName(String name){
        if (name=="pari") {
            this.name = name;
        }else {
            System.out.println("YOU ENTERED INVALID NAME");
        }
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }

        }
public class O2_setters_and_getters {
    public static void main(String[] args) {
        pari po=new pari();
        po.setName("pari");
        po.setAge(17);
        System.out.println(po.getName());
        System.out.println(po.getAge());
    }
}
