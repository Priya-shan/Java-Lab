
package com.mycompany.worksheeet2;

import java.util.Scanner;


public class program3 {

    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        arithmetic d=new arithmetic();
        System.out.println("enter value of a");
        int a=obj.nextInt();
        System.out.println("enter value of b");
        int b=obj.nextInt();
        d.add(a,b);
        d.sub(a,b);
        d.mul(a,b);
        d.div(a,b);
    }
    
}
class arithmetic{
   int a;
   int b;
   int c;
   void add(int a,int b){
    c=a+b;
    System.out.println("sum="+c);
   }
   void sub(int a,int b){
    c=a-b;
    System.out.println("difference="+c);
   }
   void mul(int a,int b){
    c=a*b;
    System.out.println("product="+c);
   }
   void div(int a,int b){
    c=a/b;
    System.out.println("division="+c);
   }
           
}
