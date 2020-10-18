/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab12;

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
        Scanner obj =new Scanner(System.in);
        Integer[] arr1={10,30,41,50};
        Double[] arr2={10.40,3.6,12.4,11.3};
        System.out.println("original integer array");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ "\t");
        }
        System.out.println("");
        System.out.println("original double array");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+ "\t");
        }
        System.out.println("");
        System.out.println("----------------------------------");
        genclass<Integer> iob=new genclass<Integer>(arr1);
        genclass<Double> dob=new genclass<Double>(arr2);
        System.out.print("number of odd integers in an integer list : ");
        
        iob.countodd();
        System.out.println("----------------------------------");
        
        Integer v=iob.Max();
        Double v1=dob.Max();
        System.out.println("max element in integer array arr1 : "+v);
        System.out.println("max element in double double arr2 : "+v1);
        System.out.println("----------------------------------");
        System.out.println("enter 2 pos which u want to swap : ");
        int pos1=obj.nextInt();
        int pos2=obj.nextInt();
        System.out.println("exchanging 2 elements in integer list");
        iob.exchange(pos1,pos2);
        System.out.println("");
        System.out.println("exchanging 2 elements in double list");
        dob.exchange(pos1,pos2);
        
    }
    
}
class genclass<t extends Number>{
    
  t arr[];
  t max;
  genclass(t ar[]){
   arr=ar;
  }
  t Max(){
      max=arr[0];
      for(int i=0;i<arr.length;i++){
        if(arr[i].intValue()>max.intValue()){
          max=arr[i];
        }
    }
   return max;
  }
  void countodd(){
      int count=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i].intValue()%2!=0){
          count++;
     }
  }
      System.out.println(" "+count);
}
  void exchange(int pos1,int pos2){
      
      t c;
      
      for(int i=0;i<arr.length-1;i++){
         c=arr[pos1];
         arr[pos1]=arr[pos2];
         arr[pos2]=c;
      }
      for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "\t");
        }
  }
}

    

