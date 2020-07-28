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
public class distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,x2,y1,y2,d;
        Scanner obj= new Scanner(System.in);
        x1=obj.nextDouble();
        x2=obj.nextDouble();
        y1=obj.nextDouble();
        y2=obj.nextDouble();
        d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println(d);
        // TODO code application logic here
    }
    
}
