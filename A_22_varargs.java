package com.company;

public class A_22_varargs {

    static int sum(int...arr){
        //arr is available here as int [] arr
        int result = 0;
        for (int a: arr) {
            result += a;
        }
        return result;
    }
    //sum1: method for at least one integer is required.
    static int sum1(int x, int...arr){
        //arr is available here as int [] arr
        int result = x;
        for (int a: arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is: " + sum());
        //System.out.println("The sum of nothing is: " + sum1());  // this line throws error for sum1 because at least one integer is required.
        System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 1 is: " + sum1(1));
        System.out.println("The sum of 1 and 2 is: " + sum(1,2));
        System.out.println("The sum of 1 and 1 & 2 is: " + sum1(1,1,2));
        System.out.println("The sum of 1 , 2 and 3 is: " + sum(1,2,3));
        System.out.println("The sum of 1 , 2 , 3 and 4 is: " + sum(1,2,3,4));
        System.out.println("The sum of 1 , 2 , 3 , 4 and 5 is: " + sum(1,2,3,4,5));
    }
}
