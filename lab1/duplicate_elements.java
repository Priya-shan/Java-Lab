
package com.mycompany.lab1;

import java.util.Scanner;


public class duplicate_elements {

        public static void main(String[] args) {
            int i,n,j,flag=0;
            Scanner obj=new Scanner(System.in);
            int a[]=new int[10];
            n=obj.nextInt();
            for(i=0;i<n;i++){
            a[i]=obj.nextInt();
           }
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        flag++;
                    }
                 }
           }
            if(flag==0){
                System.out.println("the array does not contain any duplicate elements");
            
            }
            else{
                System.out.println("the array contains duplicate elements");
                System.out.println(flag+"elements are dupicated in the array");
            }
        }
}
