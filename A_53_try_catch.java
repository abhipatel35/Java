package com.company;

public class A_53_try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;  //shows ArithmeticException

        //WITHOUT TRY:  //shows exception
//        int c = a / b;    //program exit from here
//        System.out.println("The result is " + c);

        //WITH TRY:
        try {
            int c = a / b;  //program do not exit. continue to run.
            System.out.println("The result is " + c);
        }
        catch (Exception e){
            System.out.println("We failed to divide.Reason: ");
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}
