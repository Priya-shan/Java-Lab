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
public class switchvalid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        switch(a){
            case 0:
            case 1:
            case 2:
            case 3:                    
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:    
                System.out.println("u have pressed"+a);
                break;
            default:System.out.println("input is invalid");
                
        }
    }
    
}
