package com.company;

import java.util.Scanner;

public class A_55_nested_try_catch {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try{
            System.out.println("Welcome!");
            //nested try-catch
            try{
                System.out.println("The value of array index entered is: " + arr[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry! this index does not exist.");
                System.out.println("Exception in level 2");
            }
            System.out.println("The value of array_value/number is: " + arr[ind]/number);
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
            System.out.println(e);
        }

    }
}
