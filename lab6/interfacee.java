
package com.mycompany.lab6;

import java.util.Scanner;


public class interfacee {

    
    public static void main(String[] args) {
        supermarket obj1=new supermarket();
        obj1.calculatebill();
        obj1.display();
        restaurent obj2=new restaurent();
        obj2.calculatebill();
        obj2.display();
        
    }
}
interface printable{
 public void calculatebill();
 public void display();
}
class supermarket implements printable{
    double amount,bill;
    double gst;
    Scanner obj=new Scanner(System.in);
    public void calculatebill(){
        System.out.println("enter cost");
        amount=obj.nextInt();
        gst=(float)18/100*amount;
        bill=amount+gst;
   }
    public void display(){
        System.out.println("total bill amount is : "+bill);
   }
}
class restaurent implements printable{
   double amount,bill;
    double gst;
    Scanner obj=new Scanner(System.in);
    public void calculatebill(){
        System.out.println("enter cost");
        amount=obj.nextInt();
        gst=(float)5/100*amount;
        bill=amount+gst;
   }
    public void display(){
        System.out.println("total bill amount is : "+bill);
   } 
}