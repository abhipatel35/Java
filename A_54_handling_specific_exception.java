package com.company;

import java.util.Scanner;

public class A_54_handling_specific_exception {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 78;
        marks[2] = 43;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try{
            System.out.println("The value of array index entered is: " + marks[ind]);
            System.out.println("The value of array_value/number is: " + marks[ind]/number);
        }
        //Handling Specific ArithmeticException
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        //Handling Specific ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception is occured!");
            System.out.println(e);
        }

    }
}
