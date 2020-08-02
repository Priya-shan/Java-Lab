
package com.mycompany.worksheeet2;


public class program5 {

 
    public static void main(String[] args) {
       customer obj1= new customer(101,"aaa",20);
        System.out.println(obj1.getid());
        System.out.println(obj1.getname());
        System.out.println(obj1.getdiscount());
        obj1.setdiscount(10);
        System.out.println(obj1.getdiscount());
        System.out.println(obj1);
        System.out.println("---------------------------");
        
        customer obj2= new customer(102,"bbb",30);
        System.out.println(obj2.getid());
        System.out.println(obj2.getname());
        System.out.println(obj2.getdiscount());
        obj2.setdiscount(10);
        System.out.println(obj2.getdiscount());
        System.out.println(obj2);
        System.out.println("-----------------------------");
        
        invoice in1=new invoice(201,obj1,4000);
        customer obj3=new customer(203,"rrr",15);
        System.out.println(in1.getdata());
        System.out.println(in1.getcustomer());
        System.out.println(in1.getamount());
        in1.setamount(7000);
        in1.setcustomer(obj3);
        System.out.println("name of customer"+in1.getcustomername());
        System.out.println("amount after discount"+in1.getamountafterdiscount());
        System.out.println("-----------------------------");
        
        invoice in2=new invoice(301,obj2,8000);
        customer obj4=new customer(302,"sss",25);
        System.out.println(in2.getdata());
        System.out.println(in2.getcustomer());
        System.out.println(in2.getamount());
        in2.setamount(7000);
        in2.setcustomer(obj3);
        System.out.println("name of customer"+in2.getcustomername());
        System.out.println("amount after discount"+in2.getamountafterdiscount());
        System.out.println("-----------------------------");
        
    }
}
class customer{
    int id;
    String name;
    int discount;
    customer(int i, String n ,int d){
        id =i;
        name= n;
        discount=d;
    }
    int getid(){
        return id;
    }
    String getname(){
        return name;
    }
    int getdiscount(){
        return discount;
    }
    void setdiscount(int d1){
        discount=d1;
    }
    public String toString(){
        return id+""+name+""+discount;
    }
}
class invoice{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a){
    id=i;
    o=o1;
    amount=a;
    }
    customer getcustomer(){
    return o;
    }
    void setcustomer(customer o2){
    o=o2;
    }
    int getdata(){
    return id;
    }
    double getamount(){
    return amount;
    }
    void setamount(double d){
    amount=d;
    System.out.println("the changed amt="+amount);
    }
    String getcustomername(){
    return o.name;
    }
    double getamountafterdiscount(){
     return (amount=(amount)*o.discount/100);
    }
}