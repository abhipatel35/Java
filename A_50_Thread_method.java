package com.company;

class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<35) {
            System.out.println("Hey!");
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Hey!    2");
        }
    }
}

public class A_50_Thread_method {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();

        t1.start();
//        try {
//            t1.join(); //due to this t2 is not running until t1 is running
//            //here we use try and catch just because "join()" methods throws an exception
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();
    }
}
