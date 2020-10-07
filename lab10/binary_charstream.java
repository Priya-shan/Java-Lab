/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author welcom
 */
public class binary_charstream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       try {
        FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("E:\\java\\rose1.jpg");
        fou=new FileWriter("roseout1.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
       }
       catch(Exception e){
           System.out.println(e);
       }
       
    }
    }
    

