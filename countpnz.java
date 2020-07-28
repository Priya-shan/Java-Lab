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
public class countpnz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,num,p=0,n=0,z=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter num of elements");
        num=obj.nextInt();
        for(i=0;i<num;i++){
           a[i]=obj.nextInt();
        }
        for(i=0;i<num;i++){
            if(a[i]>0){
                p++;
            }
            else if(a[i]<0){
                n++;
            }
            else{
                z++;
            }
        }
      System.out.println("number of positive numbers="+p); 
      System.out.println("number of negative numbers="+n); 
      System.out.println("number of zero="+z); 
    }
    
}
