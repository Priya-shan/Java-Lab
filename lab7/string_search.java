
package com.mycompany.lab7;

import java.util.*;
import java.util.Arrays;


public class string_search {

    
     
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int p=0,pos=0;
        System.out.println("************searching given word in the array*************");
        String[] s=new String[]{"anan","sneha","hema","murugan","ashwin"};
        System.out.println("enter the string to be searched");
        String r=obj.nextLine();
        
        for(int i=0;i<5;i++){
         if(s[i].equals(r)){
             p++;
             pos=i;
             break;
            }
        }
        if(p==0){
         System.out.println("the searched string is not found ");
        }
        else{
         System.out.println("the searched string is found at position "+pos);
        }
        System.out.println("*************printing all elements in the array starting & ending with gn letter********");
        System.out.println("enter starting letter");
        char first=obj.next().charAt(0);
        System.out.println("enter ending letter");
        char last=obj.next().charAt(0);
        for(int i=0;i<5;i++){
           String a1=s[i];
           int n=s[i].length();
           char first1=a1.charAt(0);
           char last1=a1.charAt(n-1);
           if(first==first1 && last==last1){
               System.out.println(a1); 
            }
           else{
              continue;
           }
}
}}
    
        
