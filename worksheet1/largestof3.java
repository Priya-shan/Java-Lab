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
public class largestof3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is greatest" +a);
        }
        else if(b>c && b>a)
                {
                    System.out.println("B is greater"+b);
                }
                else{
                        System.out.println("C is greater"+c);
                        }
        
        // TODO code application logic here
    }
    
}
