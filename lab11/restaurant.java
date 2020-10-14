package com.mycompany.lab11;

import java.util.Scanner;

public class restaurant {

    public static void main(String[] args) {

        food f1 = new food();
        f1.menu();
        customer1 c1 = new customer1(f1);
        c1.start();
        customer1 c2 = new customer1(f1);
        c2.start();
        customer1 c3 = new customer1(f1);
        c3.start();
        customer1 c4 = new customer1(f1);
        c4.start();
        customer1 c5 = new customer1(f1);
        c5.start();
        customer1 c6 = new customer1(f1);
        c6.start();
        customer1 c7 = new customer1(f1);
        c7.start();
    }

}

class food {

    Scanner obj = new Scanner(System.in);
    int pizzacount = 5;
    
    int burgercount = 5;
    int samosacount = 10;

    synchronized public void foodorder(int n, int N) {
        if (n == 1) {
            if (pizzacount >= N) {
                System.out.println("your order [ " + N + " pizza ] has been placed successfully :) ");
                pizzacount = pizzacount - N;
            } else {
                System.out.println("ooops...!! Sorry Mam/Sir your order is currently unavailable :( ");
            }
        } else if (n == 2) {
            if (burgercount >= N) {
                System.out.println("your order [ " + N + " burger ] has been placed successfully :) ");
                burgercount = burgercount - N;
            } else {
                System.out.println("ooops...!! Sorry Mam/Sir your order is currently unavailable :( ");
            }
        } else if (n == 3) {
            if (samosacount >= N) {
                System.out.println("your order [ " + N + " samosa ] has been placed successfully :) ");
                samosacount = samosacount - N;
            } else {
                System.out.println("ooops...!! Sorry Mam/Sir your order is currently unavailable :( ");
            }
        } else {
            System.out.println("Refer the menu card once again & please enter the correct option");
        }

    }

    void menu() {
        System.out.println("--------------------------------");
        System.out.println("Welcome to chef priya's Restaurent");
        System.out.println("Menu card");
        System.out.println("enter 1 for pizza");
        System.out.println("enter 2 for burger");
        System.out.println("enter 3 for samosa");
        System.out.println("choose one option and also mention quantity[how many u want]");
        System.out.println("---------------------------------");

    }

    int getdata() {
        int opt = obj.nextInt();
        return opt;
    }

    int getnumber() {
        int numofitem = obj.nextInt();
        return numofitem;
    }
}

class customer1 extends Thread {

    food f;

    int opt;
    int noi;

    public customer1(food f) {
        this.f = f;

        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");

    }
}

class customer2 extends Thread {

    food f;

    int opt;
    int noi;

    public customer2(food f) {
        this.f = f;
        //f.menu();
        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");

    }
}

class customer3 extends Thread {

    food f;

    int opt;
    int noi;

    public customer3() {
        this.f = f;

        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");

    }
}

class customer4 extends Thread {

    food f;

    int opt;
    int noi;

    public customer4(food f) {
        this.f = f;
        int o = f.getdata();

        this.opt = o;
        int N = f.getnumber();
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");
    }
}

class customer5 extends Thread {

    food f;

    int opt;
    int noi;

    public customer5(food f) {
        this.f = f;
        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");
    }
}

class customer6 extends Thread {

    food f;

    int opt;
    int noi;

    public customer6(food f) {
        this.f = f;
        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");
    }
}

class customer7 extends Thread {

    food f;

    int opt;
    int noi;

    public customer7(food f) {
        this.f = f;
        int o = f.getdata();
        int N = f.getnumber();
        this.opt = o;
        this.noi = N;

    }

    public void run() {
        f.foodorder(opt, noi);
        System.out.println("---------------------------------");
    }
}
