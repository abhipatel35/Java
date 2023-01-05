package com.company;

import java.util.Scanner;

public class A_13_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        switch (age){
            case 18:
                System.out.println("you are going to become an Adult!");
                break;  //if you don't use break statement then print all below statement even case is not right.
            case 23:
                System.out.println("you are going to join a Job!");
                break;
            case 60:
                System.out.println("you are going to retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
