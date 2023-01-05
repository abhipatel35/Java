package com.company;

class Base1{
    Base1(){
        System.out.println("I'm a constructor of base");
    }
    Base1(int x){
        System.out.println("i m an OverloadedConstructor of Base class and value of x: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(2);
        // super keyword used when you want to call the constructor with parameter of Base1 class.
        //If you don't use super keyword then By Default, it calls constructor without a parameter of Base1 class.
        System.out.println("I'm a constructor of derived");
    }
    Derived1(int x , int  y){
        super(x);
        System.out.println("I'm an overloadedConstructor of derived class and value of y: " +y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I'm a constructor of ChildOfDerived class.");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I'm a OverloadedConstructor of ChildOfDerived class and value of z: " + z);
    }
}

public class A_32_Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Base1 b1 = new Base1(3);
        Derived1 d = new Derived1();
        Derived1 d1 = new Derived1(14,12);
        ChildOfDerived c = new ChildOfDerived();
        ChildOfDerived c1 = new ChildOfDerived(12,23,34);
    }
}
