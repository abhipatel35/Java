package com.company;

class MyEmployee1{
    private int id;
    private String name;

//constructor : invoke automatically when class name are same
    public MyEmployee1(){
        id = 23;
        name = "Your-name-here";
    }

////you can put argument in constructor
//    public MyEmployee1(String myName, int myId){
//        id = myId;
//        name = myName;
//    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class A_28_constructor {
    public static void main(String[] args) {
        MyEmployee1 abhi = new MyEmployee1();
        //MyEmployee1 abhi = new MyEmployee1("Dolly",45);  //use this and comment above line when you put argument in constructor
        //abhi.setId(12);
        //abhi.setName("abhipatel");
        System.out.println(abhi.getId());
        System.out.println(abhi.getName());
    }
}