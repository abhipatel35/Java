package com.company;

public class A_08_string {
    public static void main(String[] args) {
        String name = "Abhi";    // string is a class but can be used like a datatype.
        String name1 = new String("Patel");   //both method are right.
        System.out.println(name);
        System.out.println(name1);

        //following are some String Methods:

        int value = name.length();  // gives length of string "Abhi"
        System.out.println(value);

        String LCstr = name.toLowerCase(); // all letters become lowercase
        System.out.println(LCstr);

        String UCstr = name.toUpperCase(); // all letters become uppercase
        System.out.println(UCstr);

        String nonTrimmedString = "     Dolly    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString); // equal to (nonTrimmedString.trim) no need to make new "trimmedString" string

        System.out.println(name.substring(0)); // give start index not end index
        System.out.println(name.substring(1));
        System.out.println(name.substring(2));
        System.out.println(name.substring(3));
        System.out.println(name.substring(0,3));  //give start and end both index than , when print it include start index but exclude end index. (here,include 'A' but not 'i')
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(0,2));

        System.out.println(name.replace('A', 'R'));  //replace character
        System.out.println(name.replace("Ab" , "ri"));  // replace string
        System.out.println(name.replace("A" , "abcd"));  //string can replace character

        System.out.println(name.startsWith("Ab"));    // print true or false.
        System.out.println(name.startsWith("Pa"));

        System.out.println(name.endsWith("hi"));
        System.out.println(name.endsWith("el"));

        System.out.println(name.charAt(0));  //print character at index 0
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("hi"));  // gives first index
        System.out.println(name.indexOf("b"));
        System.out.println(name.indexOf("xyz"));  // if there no such string that prints -1
        String modifiedName = "Abhi bhai";
        System.out.println(modifiedName.indexOf("bh",4));  //here string "bh" is two times but we specifies start with index 4.

        System.out.println(modifiedName.lastIndexOf("bh")); //lastIndexOf start search string from end
        System.out.println(modifiedName.lastIndexOf("bh", 4));  // find string from given index that means it only search in "Abhi "

        System.out.println(modifiedName.equals("Abhi"));
        System.out.println(name.equals("Abhi"));
        System.out.println(name.equals("abhi"));   //java is case sensitive

        System.out.println(name.equalsIgnoreCase("aBHi"));  // uppercase or lowercase no matter if value is right
    }
}
