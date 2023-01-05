package com.company;

interface Bicycle{
    int a = 34;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    public void blowHorn1(); // interfaces methods are public by default no need to write
    void blowHorn2();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("peeeeep....");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHorn1(){
        System.out.println("1...pee....");
    }
    public void blowHorn2(){
        System.out.println("2....pee pee...");
    }
}
public class A_38_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleAbhi = new AvonCycle();
        cycleAbhi.applyBreak(1);

        //You can create properties in Interfaces
        System.out.println(cycleAbhi.a);
        //you cannot modify the properties in Interfaces as they are final
        //cycleAbhi.a = 45;    //variable 'a' is in Interface so variable is final so you cannot assign value to 'a'.

        cycleAbhi.blowHorn1();
        cycleAbhi.blowHorn2();
    }
}
