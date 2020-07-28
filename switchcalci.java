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
public class switchcalci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,opt;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a value");
        a=obj.nextInt();
        System.out.println("enter b value");
        b=obj.nextInt();
        System.out.println("enter operation u want to perform");
        opt=obj.next().charAt(0);
        switch(opt){
            case '+':System.out.println("add="+(a+b));
            break;
            case '-':System.out.println("sub="+(a-b));
            break;
            case '*':System.out.println("mul="+(a*b));
            break;
            case '/':System.out.println("div="+(a/b));
            break;
            case '%':System.out.println("mod="+(a%b));
            break;
            default:System.out.println("incorrect option");
        }
        
    }
    
}
