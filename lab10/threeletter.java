/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author welcom
 */
public class threeletter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        File f=new File("E:/java/example1.txt");
        Scanner obj =new Scanner(new FileInputStream(f));
        int count=0;
        while(obj.hasNext()){
         String s=obj.next();
           if(s.length()==3){
          count++;
         }
       }
        System.out.println(count);
        
    }
    
}
