package com.company;

public class A_21_method_overloading {

    //void return  :  When we don't want our method to return anything we use void as the return type.
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    //NOTE: In case of arrays, the reference is passed. same is the case for object passing to methods.
    //for case 1 : here copy of x is passed so their no change in value of x.
    static void change(int a){
        a = 5;
    }
    //for case 2  : Here marks Array passed as reference . so, arr & marks are same. That's why, changes in arr occur in marks array.
    static void change1(int [] arr){
        arr[0] = 98;
    }


    //for method overloading
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
/*
    static int foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }   //this shows error because you cannot perform method overloading by changing datatype. (you must change parameters to perform method overloading.)
*/


    public static void main(String[] args) {
        tellJoke();
        System.out.println("");

        //case 1: Changing the integer.
        int x = 10;
        System.out.println("The value of x before running change is: " + x);
        change(x);
        System.out.println("The value of x after running change is: " + x);
        System.out.println("");

        //case 2: Changing the Array
        int [] marks = {52 , 45, 78 , 90 , 65};
        System.out.println("The value of marks[0] before running change1 is: " + marks[0]);
        change1(marks);
        System.out.println("The value of marks[0] after running change1 is: " + marks[0]);
        System.out.println("");

        //Method overloading
        foo();
        foo(1000);  // 1000 is arguments and REMEMBER arguments are actual. and a and b are parameters.
        foo(2000,3000);
    }
}
