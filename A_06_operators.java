package com.company;

public class A_06_operators {
    public static void main(String[] args) {
    //1. Arithmetic operators --> + , - , * , / , % , ++ , --
        int a = 4;
        int b = 6 % a; //modulo operator: gives value of reminder
        System.out.println(b);
        // 4.8%1.1 --> (0.4)returns decimal reminder

    //2. Assignment operators --> = , +=
        int c = 5;
        c +=6;  // means c = c+6
        System.out.println(c);

    //3. comparison operators --> == , > , < , >= , <=  //return true or false
        System.out.println("== " +(6==7));
        System.out.println("!= " +(6!=7));
        System.out.println("> " +(64>5));

    //4. logical operators --> && , || , !
        System.out.println(64>5 && 64>8);
        System.out.println(64>7 && 64<3);  //In && operator if all conditions are true then return true otherwise return false like logic gates.
        System.out.println(64>7 || 64<3);  //In || operator if anyone condition is true then return true.

    //5. bitwise operator --> & , |     // not important
        // 10
        // 11
        // ---
        // 10
        System.out.println(2&3); //In Binary: 10 + 11 = 10 if & operator is used.
    }
}
