//Write a program to calculate percentage of a given student  in CBSE board exam . His marks from 5 subjects must be taken as input from the keyboard.(Marks are out of 100)

package com.company;

import java.util.Scanner;

public class A_04_practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("student name: ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.println("marks in sub1(out of 100): ");
        int s1 = sc.nextInt();
        System.out.println("marks in sub2(out of 100): ");
        int s2 = sc.nextInt();
        System.out.println("marks in sub3(out of 100): ");
        int s3 = sc.nextInt();
        System.out.println("marks in sub4(out of 100): ");
        int s4 = sc.nextInt();
        System.out.println("marks in sub5(out of 100): ");
        int s5 = sc.nextInt();

        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
        System.out.println("s5:"+s5);

        float percentage = (s1 + s2 + s3 + s4 + s5)/5.0f;//here we write 5.0f instead of 5 because we need answer in floating value so int and float arithmetic operations resulting in float
        System.out.print("your percentage : ");
        System.out.println(percentage);
    }
}
