package com.mycompany.lab10;

import java.io.File;
import java.util.Scanner;

public class file_handling_process {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the filename");
        String filename = obj.next();
        File f = new File(filename);
        System.out.println("information of file");
        System.out.println("Availability==> " + f.exists());

        if (f.canRead() && f.canWrite()) {
            System.out.println("the file is both readable and writable");
        } 
        else if (f.canRead()) {
            System.out.println("the file is readable");

        } else if (f.canWrite()) {
            System.out.println("the file is writable");
        } else {
            System.out.println("undefined property");
        }
        System.out.println("Type of the file");
        int index = filename.lastIndexOf(".");
        if (index > 0) {
            String type = filename.substring(index + 1);
            System.out.println(type);
        }

        System.out.println("Length of the file in bytes:" + f.length() + " bytes");

    
    }
    
}
