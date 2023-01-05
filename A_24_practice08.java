package com.company;

import java.util.Scanner;

public class A_24_practice08 {

////Question 1: multiplication table
//    static void multiplication(int n){
//        for(int i =1; i<=10 ; i++){
//            System.out.format("%d X %d = %d\n" , n , i , n*i);
//        }
//    }
//    public static void main(String[] args) {
//        multiplication(5);
//    }


////Question 2: pattern problem
//    static void pattern(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//       pattern(5);
//    }


////Question 3: Calculate sum of first n natural numbers using recursive function.
//    static int sum(int n){
//        //Base condition
//        if(n==1){
//            return 1;
//        }
//        else{
//            return n +sum(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("The value of n is: ");
//        int n = sc.nextInt();
//        System.out.printf("The sum of first %d natural numbers is: %d", n , sum(n));
//    }


////Question 4: pattern problem
//    static void pattern1(int n){
//        for(int i=0 ; i<=n ; i++){
//            for(int j=n ; j>=i+1 ; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        pattern1(5);
//    }


////Question 5: print n th term of fibonacci series using recursion.
//    static int fib(int n){
//        if(n==1 || n==2){
//            return n-1;
//        }
//        else{
//            return fib(n-1) + fib(n-2);
//        }
//    }
//    public static void main(String[] args) {
//        int result = fib(8);
//        System.out.println(result);
//    }


////Question 6: Write a function to find the average of a set of numbers passed as arguments.
//    static float avg(int [] arr){
//        int l = arr.length;
//        int sum =0;
//        for (int i =0 ; i<l; i++){
//            sum += arr[i];
//        }
//        return (float)sum/l;
//    }
//    public static void main(String[] args) {
//        int [] num = {100,90,80,40};
//        float average = avg(num);
//        System.out.println(average);
//    }


////Question 6: Question 2 using recursion
//    static void pattern_rec(int n) {
//        if (n > 0) {
//            pattern_rec(n - 1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    /*
//    what happened on when we run above function for n=3.
//    pattern_rec(3)
//    {pattern_rec(2)} + 3 times * and new line
//    {pattern_rec(1) + 2 times * and new line } + 3 times * and new line
//    */
//    public static void main(String[] args) {
//        pattern_rec(5);
//    }

}