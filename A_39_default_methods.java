package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();

    //Default methods enable us to add new functionality to existing interfaces.

    private void greet(){
        System.out.println("Good Morning");
    }   //this method can not call direct in main method because it has private access to the Camera Interface

    default void record4KVideo() {
        greet();    // Interfaces can also include private method for default methods in use
        System.out.println("Recording in 4K...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String Network);
}

class CellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling" + PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements Camera , Wifi{
    public void takeSnap() {
        System.out.println("Taking Snap....");
    }
    public void recordVideo(){
        System.out.println("Recording Video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks...");
        String[] networkList = {"DJ" , "AP" , "LD"};
        return networkList;
    }
    public void connectToNetwork(String Network){
        System.out.println("connecting to" + Network);
    }
}

public class A_39_default_methods {
    public static void main(String[] args) {
        SmartPhone S = new SmartPhone();

        S.record4KVideo();
        //S.greet();  // ---> Throws an error because greet() has a private access in Camera interface

        String[] arr = S.getNetworks();
        for (String item:arr) {
            System.out.println(item);
        }

    }
}
