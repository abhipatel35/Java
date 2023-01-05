package com.company;

public class A_09_escape_sequence_char {
    public static void main(String[] args) {

        System.out.println("I am abhi \npatel");   //insert newline
        System.out.println("I am abhi \tpatel");   //insert tab
        System.out.println("I am abhi \'patel");   //insert single quote
        System.out.println("I am abhi \"patel");   //insert double quote
        System.out.println("I am abhi \\patel");   //insert backslash
        System.out.println("I am abhi \fpatel");   //insert form feed
        System.out.println("I am abhi \rpatel");   //insert a carriage return in this text
        System.out.println("I am abhi \bpatel");   //insert a backspace

    }
}
