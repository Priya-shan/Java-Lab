package com.mycompany.lab9;

import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Try block for ArithmeticException
        try {
            System.out.println("enter num1");
            int a = obj.nextInt();
            System.out.println("enter num2");
            int b = obj.nextInt();
            int c = a / b; //cant do div if denominator is zero
            System.out.println(c);
        } 
        // Catch block for ArithmeticException
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        // Try block for NumberFormatException
        try {
            System.out.println("enter string str");
            String str = obj.next();
            int f = Integer.parseInt(str);//cant convert letters into integer
            System.out.println(f);
        }
        // Catch block for NumberFormatException
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        // Try block for ArrayIndexOutOfBoundsException
        try {
            System.out.println("enter pos of array in which u want to enter 9");
            int pos = obj.nextInt();
            int arr[] = new int[10];//can only accomodate 10 elements
            arr[pos] = 9;
            System.out.println(arr[pos]);
        } 
        // Catch block for ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // Try block for StringIndexOutOfBoundsException
        try {
            System.out.println("enter string str1");
            String str1 = obj.next();
            System.out.print("length of string :");
            System.out.println(str1.length());//cant access char if given index is greater than length of string
            char c = str1.charAt(40);
            System.out.println(c);
        } 
        // Catch block for StringIndexOutOfBoundsException
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
