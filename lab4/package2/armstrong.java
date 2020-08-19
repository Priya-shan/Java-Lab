
package package2;

import java.util.Scanner;


public class armstrong {
    public void armst(){
     Scanner num=new Scanner(System.in);
     System.out.println("enter the num which you want to check whether armstrong or not");
     int r,s = 0;
     int n=num.nextInt();
     int a=n;
     while(n!=0){
      r=n%10;
      s=s+(r*r*r);
      n=n/10;
     }
     if(s==a){
     System.out.println("the given num is armstrong");
     }
     else{
     System.out.println("the given num is not armstrong");
     }
    }
}
