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
public class proddiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,p,r,o;
        Scanner obj= new Scanner(System.in);
        a=obj.nextDouble();
        p=obj.nextDouble();
        r=(p*a)/100;
        o=a-r;
        System.out.println("the final amount="+o);
        
        // TODO code application logic here
    }
    
}
