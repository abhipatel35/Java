package com.company;

import java.util.Scanner;

public class A_11_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        if(age>18){
            System.out.println("Yes boy you can drive!");
        }
        else {
            System.out.println("No boy you cannot drive yet!");
        }
    }
}
