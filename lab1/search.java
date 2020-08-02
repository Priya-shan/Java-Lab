
package com.mycompany.lab1;

import java.util.Scanner;


public class search {

    
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,n,num,flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        n=obj.nextInt();
        for(i=0;i<n;i++){
        a[i]=obj.nextInt();
        }
        System.out.println("enter the number to be searched");
        num=obj.nextInt();
        for(i=0;i<n;i++){
        if(a[i]==num){
            flag++;
            System.out.println("the number "+num+" is found at position "+i);
            break;
        }}
        if(flag==0){
            System.out.println("the seached number is not found");
        }
        
    }
    
}
