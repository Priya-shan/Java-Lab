
package package1;

import java.util.Scanner;


public class arithmatic {
    public void arith(){
    int a,b;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter 2 nmber for which you want to do arithmatic operation");
    a=obj.nextInt();
    b=obj.nextInt();
    System.out.println("add="+(a+b));
    System.out.println("sub="+(a-b));
    System.out.println("mul="+(a*b));
    System.out.println("div="+(a/b));
    System.out.println("mod="+(a%b));
       
}
}