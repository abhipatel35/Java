package com.company;

public class A_15_Loops {
    public static void main(String[] args) {

//While loop.
        int a = 1;
        while(a<=3){
            System.out.println(a);
            a++;
        }
        System.out.print("\n");

//Do-While loop.
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while (b<=5);
        System.out.print("\n");

//For loop.
        for(int i =0; i<=10; i++){
            System.out.println(i);
        }
        System.out.print("\n");

//Decrementing for loop
        for(int j=5 ; j!=0; j--){
            System.out.println(j);
        }
        System.out.print("\n");

//Break statement using loops
        for(int x=0; x<50 ; x++){
            System.out.println(x);
            if(x==2){
                System.out.println("Now break the loop");
                break; //break the loop when if condition is true.
            }
        }
        System.out.print("\n");

//Continue statement using loop.
        for(int y=0; y<4 ; y++){
            if(y==2){
                continue;  // skip the below code for if condition and move to next iteration.
            }
            System.out.println(y);
        }
        System.out.print("\n");

    }
}
