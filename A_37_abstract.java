package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I'm a constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
    abstract public void greet1();
}

class Child extends Parent{
    public Child(){
        System.out.println("I'm Constructor of Child class");
    }
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet1(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child1 extends Parent{
    public void abc(){
        System.out.println("xyz");
    }
}

public class A_37_abstract {
    public static void main(String[] args) {
        Child c = new Child();
        //Child1 c1 = new Child1();  // throws error
        //Parent p = new Parent();   // throws error
        //Parent and Child1 classes are abstract classes so they cannot be instantiated

        //It is possible to create reference of an abstract class.
        //It is not possible to create an object of an abstract class.
        //We can also assign reference of an abstract class(parent) to the object of a concrete subclass(Child). As shown Below:
        Parent p = new Child();
    }
}
