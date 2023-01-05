package com.company;

import java.util.Scanner;

public class A_23_recursion {
    //factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);  //here, function called itself this is called Recursion.
        }
    }
    //factorial without recursion
    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.printf("value of factorial %d is: %d \n", n, factorial(n));
        System.out.printf("value of factorial %d is: %d ", n, factorial_iterative(n));
    }
    
}
