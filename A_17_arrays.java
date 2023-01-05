package com.company;

public class A_17_arrays {
    public static void main(String[] args) {

        int [] marks = new int[5]; //1.declaration + memory allocation
        /*int[] marks;
          marks = new int[5]; */  //2.first declaration then memory allocation
        //int [] marks = {100,60,70,80,90}; //3.declaration + initialize


        //Displaying array in naive(easy) way
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 90;
        System.out.println(marks[4]);


        //length of array
        System.out.println("length : " + marks.length);


        //Displaying array (for loop)
        System.out.println("Displaying array using for loop: ");
        for(int i = 0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Displaying array using for loop in reverse order: ");
        for(int i = marks.length-1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }


        //Displaying array (for-each loop)
        System.out.println("Displaying array using for-each loop: ");
        for(int element: marks){
            System.out.println(element);
        }

    }
}
