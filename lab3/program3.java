
package com.mycompany.lab3;


public class program3 {


    public static void main(String[] args) {
        System.out.println("i is static variable \n j is non static variable");
       counter obj1=new counter();
       System.out.println("Value of i & j when calling the method for first obj");
       obj1.increment();
       counter obj2=new counter();
       System.out.println("Value of i & j when calling the method for second obj");
       obj2.increment();
    
    }
    
}
class counter{
     static int i=10;
     int j=10;
     void increment(){
         i=++i;
         j=++j;
         System.out.println("i="+i);
         System.out.println("j="+j);
     }
}
