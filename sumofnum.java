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
public class sumofnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,sum=0;
        Scanner obj=new Scanner(System.in);
        n= obj.nextInt();
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        // TODO code application logic here
    }
    
}
