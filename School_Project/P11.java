package com.School_Project;

class Salary {
    String Name;
    String Address;
    long PhoneNumber;
    String Subject;
    float MonthlySalary;
    float Incometax;

    public void details(String n,String a,long p,String s,float m,float i){
        Name=n;
        Address=a;
        PhoneNumber=p;
        Subject=s;
        MonthlySalary=m;
        Incometax=i;
    }

    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Phone Number: "+PhoneNumber);
        System.out.println("Subject: "+Subject);
        System.out.println("Monthly Salary: "+MonthlySalary);
        System.out.println("Tax: "+Incometax);
    }

    public void Incometax(){
        float tax = 0;
        float annualS=12*MonthlySalary;
        if(annualS>175000){
            tax= (float)(0.05*(annualS-175000));
        }
        System.out.println("Annual Income Tax: ₹"+tax);
    }

    public static void main(String[] args) {
       Salary sal=new Salary();
       sal.details("Anish Yadav","sikandra",7000560239l,"Computer",20000,2);
       sal.display();
       sal.Incometax();
    }
}
