   
package com.mycompany.lab_5;

import java.util.Scanner;




public class bank_ {

    
    public static void main(String[] args) {
       bankA obj1=new bankA();
       bankB obj2=new bankB();
       bankC obj3=new bankC();
       Scanner ob=new Scanner(System.in);
        System.out.println("enter 1 to know the money deposited in bank A");
        System.out.println("enter 2 to know the money deposited in bank B");
        System.out.println("enter 3 to know the money deposited in bank C");
       int ch=ob.nextInt();
       switch(ch){
           case 1:
             System.out.println("money deposited in bank C : $"+obj1.getbalance());
             break;
           case 2:
             System.out.println("money deposited in bank B : $"+obj2.getbalance());
             break;
           case 3:
             System.out.println("money deposited in bank C : $"+obj3.getbalance());
             break;
           default:
               System.out.println("invalid");
               break;
    }
    
}}
class bank{
int getbalance(){
 return 0;
}
}
class bankA extends bank{
int getbalance(){
  
 return 1000;
}
}
class bankB extends bank{
int getbalance(){
    
 return 1500;
}
}
class bankC extends bank{
int getbalance(){
    
  return 2000;
}

}