package com.company;

class c1{
    public int x = 5;           //public
    protected int y = 45;       //protected
    int z = 6;                  //default
    private int a = 78;         //private
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class A_44_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();

        // you can access any modifier in same class
        c.meth1();

        //you can access public , protected and default modifier in same package. but not private.
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);
    }
}
