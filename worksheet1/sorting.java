/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.worksheet1;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[10];
        int n,i,j,temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=obj.nextInt();
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       for(i=0;i<n;i++){
           System.out.println(a[i]);
       } 
        
    }
    
}
