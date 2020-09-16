
package com.mycompany.lab8;

import java.util.Scanner;


public class email {

    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String firstname;
        String lastname;
        firstname=obj.nextLine();
        lastname=obj.nextLine();
        String lname=lastname.substring(0, 4);
        String fname=firstname.substring(0, 3);
        String a=fname.concat(".");
        String b=a.concat(lname);
        String email=b.concat("@gmail.com");
        System.out.println("email= "+email);
        
        
    }
    
}
