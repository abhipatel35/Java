//package com.company;
import java.net.*;
//import java.net.InetAddress;
//import java.net.UnknownHostException;

public class sm1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add = InetAddress.getLocalHost();
        System.out.println(add);
        InetAddress add1;
        add1 = InetAddress.getByName("google.com");
        System.out.println(add1);
    }
}
