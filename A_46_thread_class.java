package com.company;

//Creating a Thread : By extending Thread class

class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000) {
            System.out.println("My thread is running.");
            System.out.println("I.m happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000) {
            System.out.println("My thread2 is good");
            System.out.println("I.m sad!");
            i++;
        }
    }
}

public class A_46_thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();    //start() is one of the method of Thread class TO START THREAD
        t2.start();
    }
}
