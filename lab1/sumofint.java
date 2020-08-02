
package com.mycompany.lab1;


public class sumofint {

    
    public static void main(String[] args) {
        int i,sum=0;
        for(i=101;i<200;i++){
        if(i%8==0){
        sum=sum+i;
        }
        }
        System.out.println("sum of all integers greater than 100 and less than 200 that are divisible by 8 = "+sum);
    }
    
}
