package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}

//class childSampleInterface extends sampleInterface{}  // you cannot extend interface in class
//interface childSampleInterface implement sampleInterface{}    //Interface cannot implement another interface
interface childSampleInterface extends sampleInterface{     //Interface can extends another interfaces.
    void meth3();
    void meth4();
}

class mySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class        A_40_Inheritance_in_Interface {
    public static void main(String[] args) {
        mySampleClass c = new mySampleClass();
        c.meth1();
        c.meth2();
        c.meth3();
    }
}
