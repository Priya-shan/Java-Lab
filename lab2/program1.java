
package com.mycompany.lab2;


public class program1 {

   
    public static void main(String[] args) {
    invoiceitem obj = new invoiceitem("priya","apple",10,250);
    System.out.println("ID="+obj.getID());
    System.out.println("Description="+obj.getdesc());
    System.out.println("original quantity"+obj.getQty());
    System.out.println("original unitprice="+obj.getunitprice());
    System.out.println("original total="+obj.gettotal());
    obj.setQty(5);
    obj.setunitprice(300);
    System.out.println("modified quantity="+obj.getQty());
    System.out.println("modified unitprice="+obj.getunitprice());
    System.out.println("modified total="+obj.gettotal());
    }
    
}
class invoiceitem{
String id;
String desc;
int qty;
double unitprice;
 invoiceitem(String i,String d,int q,double up){
  id=i;
  desc=d;
  qty=q;
  unitprice=up;
 }
 String getID(){
    return id;
 }
 String getdesc(){
     return desc;
}
int getQty(){
    return qty;
}
void setQty(int q1 ){
    qty=q1;
}
double getunitprice(){
    return unitprice;
}
void setunitprice(double up1){
    unitprice=up1; 
}
double gettotal(){
    double t1=qty*unitprice;
    return t1;
}
public String toString(){
    return id+""+desc+""+qty+""+ unitprice;
}
}