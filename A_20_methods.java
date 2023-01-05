package com.company;

public class A_20_methods {
    //"method in java" is like "functions in C language".
    static int logic(int x, int y){         //static method
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        /*
        //Method invocation using object creation
        A_20_methods obj =new A_20_methods();  //object creation //this one used when don't make static method
        c = obj.logic(a,b);   //method call upon an object
        */
        c = logic(a, b);
        System.out.println(c);

        int a1 = 3;
        int b1 = 1;
        int c1;
        //c1 = obj.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c1);

    }
}
