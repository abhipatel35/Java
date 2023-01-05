package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("I'm in Base and setting x now");
    }

    public void printMe(){
        System.out.println("I'm a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class A_31_Inheritance {
    public static void main(String[] args) {

        //creating a object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        //b.setY(); //y is not in base so you cannot use setY and getY

        //creating a object of Derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(23);
        System.out.println(d.getY());
    }
}
