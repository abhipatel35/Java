package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hey!");
    }
}

public class A_48_thread_constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Abhi");
        MyThr t2 = new MyThr("Dolly");
        t1.start();
        t2.start();
        System.out.println("The id of thread is: " + t1.getId());
        System.out.println("The id of thread is: " + t2.getId());
        System.out.println("The name of the thread is: "+ t1.getName());
        System.out.println("The name of the thread is: "+ t2.getName());
    }
}
