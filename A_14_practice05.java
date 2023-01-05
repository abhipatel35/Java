package com.company;

import java.util.Scanner;

public class A_14_practice05 {
    public static void main(String[] args) {

////Question 1: What will be the output of this program:
//        int a = 10;
//        if (a==11){
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }


////Question 2: write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter marks in 1st subject: ");
//        int s1 = sc.nextInt();
//        System.out.print("Enter marks in 2nd subject: ");
//        int s2 = sc.nextInt();
//        System.out.print("Enter marks in 3rd subject: ");
//        int s3 = sc.nextInt();
//
//        float total = (s1 + s2 + s3)/3.0f;
//        //Use AND operator here;
//        if(s1>33 && s2>33 && s3>33 && total>40){
//            System.out.println("you are pass");
//        }
//        else{
//            System.out.println("you are fail");
//        }


////Question 3:Calculate income tax paid by an employee to the government as per the slabs [ 2.5L-5.0L = 5% , 5.0L-10.0L = 20% , Above 10.0L = 30%]
//        Scanner sc = new Scanner(System.in);
//        float tax = 0;
//        System.out.println("Enter your income: ");
//        float income = sc.nextFloat();
//        System.out.println(income);
//
//        if(income<=250000){
//            System.out.println("no need to pay tax.");
//        }
//        else if(income>250000 && income<=500000){
//            System.out.println("your tax:" + (tax + (income-250000) * 0.05f));
//        }
//        else if(income>500000 && income<=1000000){
//            System.out.println("your tax:" + (tax + (income-500000) * 0.2f));
//        }
//        else if(income>1000000){
//            System.out.println("your tax:" + (tax + (income-1000000) * 0.3f));
//        }


////Question 4: Write a java program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday... and so on!]
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


//////question 5: Write a program to find Whether a year entered by the user is a leap year or not.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter year: ");
//        int year = sc.nextInt();
//        if(year%4 == 0){
//            System.out.println("Yes! this is a leap year.");
//        }
//        else{
//            System.out.println("No! This is not a Leap year.");
//        }


////Question 6: Write a program to find out the type of website from the URL.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter URL: ");
//        String website = sc.next();
//        if(website.endsWith(".com")){
//            System.out.println("This is a commercial website.");
//        }
//        else if(website.endsWith(".org")){
//            System.out.println("This is an organizational website.");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website.");
//        }
//        else{
//            System.out.println("we don't have information.");
//        }

    }
}