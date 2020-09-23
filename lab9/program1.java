/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9;

import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        person obj1 = new person();//creating object for class person
        obj1.getdata(); //caling method getdata()
        //try block for user defined exception
        try {
            obj1.check();//caling method check()
            System.out.println("----------------Details---------------");
            obj1.printdata();//caling method printdata()
        } 
        //catch block for user defined exception
        catch (NameIncorrectFormatException e) {
            System.out.println(e);
        }

    }

}

class person {

    String name;
    int age;
    String mailid;
//method to get data from the user

    void getdata() {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter name :");
        name = obj.nextLine();
        System.out.println("enter age :");
        age = obj.nextInt();
        System.out.println("enter mailid :");
        mailid = obj.next();
    }
//method to print the data if its crt

    void printdata() {
        System.out.println("name :" + name);
        System.out.println("age :" + age);
        System.out.println("mailid :" + mailid);
    }

    void check() throws NameIncorrectFormatException {
        char[] arr = name.toCharArray();
        for (char n : arr) {
            //checking whether the name string contains spl char or digits 
            if (!(n >= 'a' && n <= 'z')) {
                throw new NameIncorrectFormatException("invalid name");
            }
        }
    }

}

class NameIncorrectFormatException extends Exception {

    String message;

    NameIncorrectFormatException(String msg) {
        super(msg);
    }

}
