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
public class peri {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter side of square");
        int a=obj.nextInt();
        System.out.println("perimeter of square"+(4*a));
        
        // TODO code application logic here
    }
    
}
