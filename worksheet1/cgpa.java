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
public class cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grade,credit,n,i,cgpa,csum;
        cgpa=0;
        csum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of subjects");
        n=obj.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter grade & crdit for sub"+(i+1));
        grade=obj.nextInt();
        credit=obj.nextInt();
        cgpa=cgpa+grade*credit;
        csum=csum+credit;
        }
        System.out.println("cgpa="+cgpa/csum);
        
    }
}
