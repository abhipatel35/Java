package com.company;

interface Camera1{
    void takeSnap();
    void recordVideo();

    //Default methods enable us to add new functionality to existing interfaces.

    private void greet(){
        System.out.println("Good Morning");
    }   //this method can not call direct in main method because it has private access to the Camera Interface

    default void record4KVideo(){
        greet();    // Interfaces can also include private method for default methods in use
        System.out.println("Recording in 4K...");
    }
} 

interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String Network);
}

class CellPhone1{
    void callNumber(int PhoneNumber){
        System.out.println("Calling" + PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}

class SmartPhone1 extends CellPhone1 implements Camera1 , Wifi1{
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
public class A_41_polymorphism_interfaces {
    public static void main(String[] args) {

        Camera1 c1 = new SmartPhone1();  //this is a smartphone but use it a s only camera
        //c1.getNetworks();  //----> not allowed //here c1 is only reference for Camera1
        //c1.pickCall();    //--->not allowed
        c1.takeSnap();
        c1.record4KVideo();
        c1.recordVideo();

        SmartPhone1 s1 = new SmartPhone1();//this for methods of smartphone1
        s1.recordVideo();
        s1.pickCall();
        s1.getNetworks();//here all methods of cellphone , wifi , camera1 are usable
    }
}
