package com.company;

class phone{
    public void time(){
        System.out.println("Showing time....");
    }
    public void on(){
        System.out.println("Turning on phone.....");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on smartphone......");
    }
}

public class A_34_Dynamic_method_dispatch {
    public static void main(String[] args) {
       //phone obj = new phone();       //Allowed
       //smartphone smobj = new smartphone();   //Allowed
       //obj.name();

        phone obj1 = new smartphone();   //Allowed  --->  reference of superclass is equal to object of subclass
        //smartphone obj2 = new phone();  //Not allowed   ---> reference of subclass is not equal to object of superclass
        obj1.time();
        obj1.on();
        //obj1.music();  //not allowed
    }
}
