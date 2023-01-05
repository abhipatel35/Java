package com.company;

import java.util.Scanner;

public class A_52_Errors{
    public static void main(String[] args){

        //SYNTAX ERROR DEMO
        //int i = 0   //Error : missing semicolon!
        //a = 3;      //Error : a not declared!

        //LOGICAL ERROR DEMO
        //write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1 ; i<5 ; i++){
            System.out.println(2*i+1);
        }//Error : in output you get 9 as a prime number.so this is called logical error

        //RUNTIME ERROR DEMO (exception)
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of k: ");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is: " + 1000/k);
        //if you enter 0 as k then it shows ArithmeticException.
    }
}
