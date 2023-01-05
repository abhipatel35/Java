package com.company;

import java.util.Scanner;

public class A_12_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);
        if(age>56){
            System.out.println("you are experienced!");
        }
        else if(age>46){
            System.out.println("you are semi-experienced!");
        }
        else if(age>36){
            System.out.println("you are semi-semi-experienced!");
        }
        else{
            System.out.println("you are not experienced!");
        }
        if(age>2){
            System.out.println("you are not a baby!");
        }
    }
}
