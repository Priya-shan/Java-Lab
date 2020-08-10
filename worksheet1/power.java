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
public class power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,p,sum;
        sum=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        n=obj.nextInt();
        System.out.println("enter power");
        p=obj.nextInt();
        for(int i=0;i<p;i++){
            sum=sum*n;
        }
         System.out.println("Answer="+sum);
    }
    
}
