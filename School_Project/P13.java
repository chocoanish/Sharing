package com.School_Project;

class Employee1 {
    String name;
    double sal;
    String addr;

    Employee1(){}

    Employee1(String n,double s,String a){
        name = n;
        sal = s;
        addr = a;
    }

    void print(){
        if(sal>=50000){
            System.out.println("A");
        }
        else if(sal>=25000 && sal<50000){
            System.out.println("B");
        }
        else if (sal>=15000 && sal<25000){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1("Anish",50000,"Sikandra");
        emp.print();
    }
}
