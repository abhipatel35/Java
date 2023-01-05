package com.company;

import java.util.Scanner;  // import statement for scanner class

public class A_03_Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");
        // scanner class use to take input from the user
        Scanner sc = new Scanner(System.in);  // system.in reading data from the keyboard

    //sum of any two number [use of nextInt , nextFloat ___ methods]
        System.out.println("Enter Number 1");
        int a = sc.nextInt();   //nextInt, nextFloat are methods of scanner class to read from the keyboard
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("The sum of these number is: ");
        System.out.println(sum);

    //check that entered number is int or not [use of .hasNextInt method]
        System.out.println("enter number to check it's int or not: ");
        boolean b1 = sc.hasNextInt();  //hasNextInt method is check that entered number is int or not
        System.out.println(b1);

    //[use of nextLine method]
        Scanner str = new Scanner(System.in);
        System.out.println("enter any sentence or word: ");
        //String name = str.next();   //not print anything after space
        String name = str.nextLine(); //use nextLine method If you want to read complete line (means also after space)
        System.out.println(name);
    }
}