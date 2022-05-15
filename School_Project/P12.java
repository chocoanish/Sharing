package com.School_Project;

class Employee {
    int pan;
    String name;
    double taxincome;
    double tax;
    double income;
    public void input(int p,String n, double i){
       pan=p;
       name=n;
       income=i;
    }

    public void calc(){
        taxincome=12*income;
        if(taxincome<=100000){
            tax=0;
        }
        else if(taxincome>=100001 && taxincome<=150000){
            tax=(taxincome-100000)*0.1;
        }
        else if(taxincome>=150001 && taxincome<=250000){
            tax=(taxincome-150000)*0.2+5000;
        }
        else{
            tax=(taxincome-250000)*0.3+25000;
        }
    }

    public void display(){
        System.out.println("  Pan Number  "+"     Name    "+"   Tax-income   "+"  Tax  ");
        System.out.printf(" %10d  |    %-10s|%-10f|%-10f\n",pan,name,taxincome,tax);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.input(700056023,"Anish",800000);
        e.calc();
        e.display();
    }
}
