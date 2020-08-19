
package com.mycompany;
import pack1.pack1class;
import pack2.pack2class;
import pack1.subpack1.subpack1class;
import pack2.subpack2.subpack2class;

public class program1 {

   
    public static void main(String[] args) {
        pack1class obj1=new pack1class();
        obj1.p1();
        pack2class obj2 = new pack2class();
        obj2.p2();
        subpack1class obj3=new subpack1class();
        obj3.sp1();
        subpack2class obj4=new subpack2class();
        obj4.sp2();
    }
    
}
