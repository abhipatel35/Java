package com.company;

public class A_19_practice07 {
    public static void main(String[] args) {

////Question 1: Create an array of 5 floats and calculate their sum.
//        float [] numbers = { 4.8f , 5.6f , 3.6f , 7.2f , 9.3f};
//        float sum = 0;
//        for(float element : numbers){
//            sum = sum + element;    //sum += element;
//        }
//        System.out.print("sum is: ");
//        System.out.println(sum);


////Question 2:Write a program to find out whether a given value is present in array or not.
//        float [] numbers = { 4.8f , 5.6f , 3.6f , 7.2f , 9.0f};
//        float num = 4.8f;
//        boolean isInArray = false;
//        for(float element : numbers){
//            if(num==element){
//                isInArray  = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }


////Question 3:Calculate the average marks from an array containing marks of all students in Physics using for-each loop.
//        int [] physics = {95 , 97 , 93 , 92 , 89};
//        int sum = 0;
//        for(int element: physics){
//            sum = sum + element;
//        }
//        float avg = (float) sum / physics.length;
//        System.out.println("avg = " + avg);


////Question 4: program to add two matrices of size 2x3.
//        int [][] m1 = { {1,2,3},
//                        {4,5,6} };
//        int [][] m2 = { {10,20,30},
//                        {40,50,60} };
//        int [][] result = { {0,0,0},
//                            {0,0,0} };
//        for (int i=0; i<m1.length; i++){    //run row number of times
//            for(int j=0; j<m1[i].length; j++){  //run column number of times
//                System.out.format("Setting value for i=%d and j=%d\n" , i, j);
//                result[i][j] = m1[i][j] + m2[i][j];
//            }
//        }
//        //printing the element of 2-D Array
//        for (int i=0; i<m1.length; i++) {    //run row number of times
//            for (int j = 0; j < m1[i].length; j++) {  //run column number of times
//                System.out.print(result[i][j] + "\t");
//                result[i][j] = m1[i][j] + m2[i][j];
//            }
//            System.out.print("\n");
//        }


////Question 5: reverse an array.
//        int [] arr = {1,2,3,4,5};
//        int l = arr.length;
//        int n = Math.floorDiv(arr.length,2);  //Math.floorDiv(5,2) gives the greatest integer if we divided 5 by 2 then this method gives 2 as output (remove decimal values of 2.5).
//        for(int i=0; i<n; i++){
//            int temp;
//            //swapping i element and (l-1)-i element
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int element: arr){
//            System.out.print(element +"\t");
//        }


////Question 6/7: find out the maximum and minimum element in an array.
//        int [] arr = {10,-22,34,46,57};
//
//        //for max.
//        int max = Integer.MIN_VALUE;   //Integer.MIN_VALUE method used to guess min value
//        //int max = 0;  //If we have all positive values then we can use this line.
//        for(int e: arr){
//            if(e>max){
//                max =e;
//            }
//        }
//        System.out.println("The value of the maximum element in this array is: " + max);
//
//        //for min.
//        int min = Integer.MAX_VALUE;
//        for(int e : arr){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println("The value of the minimum element in this array is: " + min);


////Question 8: Find whether an array is sorted or not.
//        int [] arr = {10,-22,46,34,57};
//        boolean isSorted = true;
//        //here we cannot compare last element with its next element because there are not any element after last element so i<(arr.length-1)
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The array is sorted.");
//        }
//        else{
//            System.out.println("The array is not sorted.");
//        }

    }
}