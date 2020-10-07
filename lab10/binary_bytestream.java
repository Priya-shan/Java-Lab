/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author welcom
 */
public class binary_bytestream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fio=null;
        FileOutputStream fou=null;
        
        fio=new FileInputStream ("E:\\java\\rose1.jpg");
        fou=new FileOutputStream("roseoutforbytestream.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
    }
    
