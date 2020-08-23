
package com.mycompany.lab_5;

import java.util.Scanner;


public class book {

    
    public static void main(String[] args) {
        student mobj=new student();
        mobj.read();
        System.out.println("------------------------------------");
        System.out.println("Displaying student details");
        System.out.println("");
        mobj.display();
        System.out.println("------------------------------------");
        staff nobj=new staff();
        nobj.read();
        System.out.println("------------------------------------");
        System.out.println("Displaying staff details");
        System.out.println("");
        nobj.display();
        System.out.println("------------------------------------");
    }

    
 }
class books{
String bname;
int accessnum;
String author;
Scanner obj=new Scanner(System.in);
void read(){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter book name");
    bname=obj.next();
    System.out.println("enter access number");
    accessnum=obj.nextInt();
    System.out.println("enter author name");
    author=obj.next();
  }
void show(){
    System.out.println("Book name="+bname);
    System.out.println("Access number="+accessnum);
    System.out.println("Author name="+author);
  }
}
class staff extends books{
String Staffname;
int sid;
String dept;
void read(){
    super.read();
    
    System.out.println("enter staff name");
    Staffname=obj.next();
    System.out.println("enter staffid");
    sid=obj.nextInt();
    System.out.println("enter staff department");
    dept=obj.next();
}
void display(){
   super.show();
   System.out.println("Staff name="+Staffname);
    System.out.println("Staff id="+sid);
    System.out.println("Staff department="+dept);
}
}
class student extends books {
String studentname;
int rollno;
String dept;
void read(){
    super.read();
    
    System.out.println("enter student name");
    studentname=obj.next();
    System.out.println("enter roll number");
    rollno=obj.nextInt();
    System.out.println("enter stdent department");
    dept=obj.next();
}
void display(){
   super.show();
   System.out.println("Stdent name="+studentname);
    System.out.println("roll number="+rollno);
    System.out.println("Student department="+dept);
}
}