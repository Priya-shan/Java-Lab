
package com.mycompany.worksheeet2;

import java.util.Scanner;


public class program4 {

    
    public static void main(String[] args) {
        int m1,m2,m3,avg,i;
        String name,dept;
        student obj[]=new student[10];
        for(i=0;i<2;i++){
        obj[i]=new student(); 
        System.out.println("enter information of student: "+(i+1));
        obj[i].getdata();
        obj[i].markcal();
        }
        for(i=0;i<2;i++){
            System.out.println("Information of student: "+(i+1));
            obj[i].display();
        }
    }
}
class student{
String name;
String dept;
int m1,m2,m3;
int avg;
void getdata(){
     Scanner obj=new Scanner(System.in);
     System.out.println("enter name");
     name=obj.next();
     System.out.println("enter dept");
     dept=obj.next();
     System.out.println("enter m1");
     m1=obj.nextInt();
     System.out.println("enter m2");
     m2=obj.nextInt();
     System.out.println("enter m3");
     m3=obj.nextInt();
}
void markcal(){
     avg=(m1+m2+m3)/3;
}
void display(){
    System.out.println("name of student="+name);
    System.out.println("dept of student="+dept);
    System.out.println("Mark in sub1="+m1);
    System.out.println("Mark in sub1="+m2);
    System.out.println("Mark in sub1="+m3);
    System.out.println("average="+avg);
    if(avg>=40){
     System.out.println("Student status is pass");
     }
     else{
     System.out.println("Student status is fail");
     }
}
}
