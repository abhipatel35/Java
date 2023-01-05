package com.company;

//creating custom class
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        System.out.println(salary);
        return salary;
    }
}
public class A_25_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        //Instantiating a new Employee object.
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        //Setting attributes (properties)
        e1.id = 12;
        e1.name = "Abhi";
        e1.salary = 4400000;

        e2.id = 17;
        e2.name = "Dolly";
        e2.salary = 5000000;

        //printing the attributes
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.printDetails();      //use printDetails() method to print details of employee.
        e2.printDetails();
        e1.getSalary();
        e2.getSalary();
    }
}
