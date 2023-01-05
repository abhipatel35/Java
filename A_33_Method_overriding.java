package com.company;

class A{
    public int m1(){
        return 4;
    }
    public void m2(){
        System.out.println("I'm a method 2 of class A");
    }
}

class B extends A{
    @Override  //not necessary but recommend
    public void m2(){
        System.out.println("I'm a method 2 of class B");
    }//method overriding not overloading
    public void m3(){
        System.out.println("I'm method 3 of class B");
    }
}

public class A_33_Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.m2();

        B b = new B();
        b.m2();
    }
}

