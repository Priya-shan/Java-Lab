
package com.mycompany.lab6;

import java.util.Scanner;


public class abstractt {

    
    public static void main(String[] args) {
       student obj1=new student();
       faculty obj2=new faculty();
        obj1.getdata();
        obj1.display();
        obj2.getdata();
        obj2.display();
    }
    
}
abstract class person{
    String name;
    int aadharnumber;
public abstract void getdata();
public abstract void display();
}
class student extends person{
    int mark;
    Scanner obj=new Scanner(System.in);
    
      public void getdata(){
      name=obj.next();
      aadharnumber=obj.nextInt();
      mark=obj.nextInt();
      }
      public void display(){
          System.out.println("name"+name);
          System.out.println("aadharnumber="+aadharnumber);
          System.out.println("mark="+mark);
      }
}
class faculty extends person{
    int salary;
    Scanner obj=new Scanner(System.in);
    
      public void getdata(){
      name=obj.next();
      aadharnumber=obj.nextInt();
      salary=obj.nextInt();
      }
      public void display(){
          System.out.println("name"+name);
          System.out.println("aadharnumber="+aadharnumber);
          System.out.println("salery="+salary);
      }
}
