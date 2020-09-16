package com.mycompany.lab8;

import static java.lang.String.valueOf;
import java.util.Scanner;

public class bin2dec {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int  bin,binf, flag = 1,sumn=0;
        double sum=0;
        System.out.println("Enter a binary string");
        String a = obj.nextLine();
        bin=Integer.parseInt(a);
        binf = bin;
        while (binf != 0) {
            int n = binf % 10;
            if (n > 1) {
                flag = 0;
                break;
            } else {
                binf = binf / 10;
            }
        }
        if (flag == 0) {
            System.out.println("error: invalid binary string" + bin);
        } else {
            for(int i=0;i<4;i++){
            int m=bin%10;
            sum=sum+m*Math.pow(2,i);
            sumn=(int)sum;
            bin=bin/10;
            }
            System.out.println("The equivalent decimal number for binary " + a + " is: "+sumn);
        }

    }

}
