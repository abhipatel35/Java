package com.company;

class MyEmployee{
    private int id;
    private String name;

    // here we use private keyword so we have to use getter and setter.
    public void setName(String n){
        this.name = n;  //name =n;
    }//setter sets the value
    public String getName(){
        return name;
    }//getter returns the value
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class A_27_getter_setter {
    public static void main(String[] args) {
        MyEmployee abhi = new MyEmployee();
        //abhi.id = 12;
        //abhi.name = "abhipatel"  //throws an error due to private access modifier.
        abhi.setId(12);
        System.out.println(abhi.getId());
        abhi.setName("abhipatel");
        System.out.println(abhi.getName());
    }
}
