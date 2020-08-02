
package com.mycompany.worksheeet2;

import java.util.Scanner;


public class program2 {

    
    public static void main(String[] args) {
        box1 obj=new box1();
        obj.depth=10;
        obj.height=10;
        obj.width=10;
        obj.volume();
        box1 obj1=new box1();
        obj1.depth=2;
        obj1.height=2;
        obj1.width=2;
        obj1.volume();
    }
    
}
class box1{
  double height;
  double width;
  double depth;
  void volume(){
    double vol=height*depth*width;
    System.out.println("volume ="+vol);
  }
}
