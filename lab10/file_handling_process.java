package com.mycompany.lab10;

import java.io.File;
import java.util.Scanner;

public class file_handling_process {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the filename");
        String fname = obj.next();
        File f = new File(fname);
        System.out.println("Information of file");
        System.out.println("Availability : " + f.exists());

        if (f.canRead() && f.canWrite()) {
            System.out.println("The file is both readable and writable");
        } else if (f.canRead()) {
            System.out.println("The file is readable");

        } else if (f.canWrite()) {
            System.out.println("The file is writable");
        } else {
            System.out.println("File cannot be read or write");
        }
        System.out.print("Type of the file : ");
        int index = fname.lastIndexOf(".");
        if (index > 0) {
            String str = fname.substring(index + 1);
            System.out.println(str);
        }

        System.out.println("Length of the file in bytes :" + f.length() + " bytes");

    }

}
