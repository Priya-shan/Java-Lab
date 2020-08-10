
package com.mycompany.lab2;

import java.util.Scanner;


public class program2 {

    
    public static void main(String[] args) {
        int total=0,avg;
        int a[]=new int[5];
        Scanner obj= new Scanner(System.in);
        for(int i=0;i<5;i++){
         System.out.println("enter marks of sunject"+(i+1));
         a[i]=obj.nextInt();
         total=total+a[i];
        }
        avg=total/5;
       
        if(avg>=91 && avg<=100){
          System.out.println("students grade & gradept is");
          System.out.println("O,10");
        }
        else if(avg>=81 && avg<=90){
            System.out.println("students grade & gradept is");
          System.out.println("A+,9");
        }
        else if(avg>=71 && avg<=80){
            System.out.println("students grade & gradept is");
            System.out.println("A,8");
        }
        else if(avg>=61 && avg<=70){
            System.out.println("students grade & gradept is");
            System.out.println("B+,7");
        }
        else if (avg>=50 && avg<=60){
            System.out.println("students grade & gradept is");
             System.out.println("B,6");
        }
        else{
            System.out.println("grade & gradept not possiblle student is fail");
        }
    }
    
}
