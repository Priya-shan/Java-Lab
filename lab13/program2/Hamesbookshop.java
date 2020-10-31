  
package program2;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Hamesbookshop extends JFrame implements ActionListener{
    JLabel l1,l2,l0,l3,ll1;
    JTextField t1,t2;
    JButton b1;
    JFrame f;
    Hamesbookshop(){
      f=new JFrame("Haemens Book Shop");
      l0=new JLabel("WELCOME TO HAEMANS BOOK SHOP");
      l0.setBounds(120 ,80, 500, 30);
      l1=new JLabel("ENTER TITLE : ");
      l1.setBounds(100, 150, 100, 30);
      l2=new JLabel("ENTER AUTHOR : ");
      l2.setBounds(100, 200, 100, 30);
      t1=new JTextField();
      t1.setBounds(200, 150, 150, 30);
      t2=new JTextField();
      t2.setBounds(200, 200, 150, 30);
      b1=new JButton("SEARCH");
      b1.setBounds(160, 280, 100, 30);
      l3=new JLabel();
      l3.setBounds(400,90,150,30);
      //bg=new JLabel(new ImageIcon("E:\\ARMSTR.png"));
      //bg.setBounds(499,399,700,700);
      
      
      f.add(l0);
      f.add(l1);
      f.add(l2);
      f.add(t1);
      f.add(t2);
      f.add(b1);
      f.add(l3);
      //f.add(bg);
      
      b1.addActionListener(this);
      
      f.setSize(500,400);
      f.setLayout(null);
      f.setVisible(true);
      //f.setContentPane(new JLabel(new ImageIcon("E:\\ARMSTR.png")));
      f.getContentPane().setBackground(Color.CYAN);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int flag=0;
        int i;
        bookstock bs[]=new bookstock[5];
        bs[0]=new bookstock("aaa","bbb","ccc",90.0,6);
        bs[1]=new bookstock("aaa1","bbb1","ccc1",91.0,6);
        bs[2]=new bookstock("aaa2","bbb2","ccc2",92.0,6);
        bs[3]=new bookstock("aaa3","bbb3","ccc3",93.0,6);
        bs[4]=new bookstock("aaa4","bbb4","ccc4",94.0,6);
        for(i=0;i<5;i++){
        if(t1.getText().equals(bs[i].title) && t2.getText().equals(bs[i].author)){
            flag++;
            break;
        }
     }
        if(flag>0){
             f.setVisible(false);
             new display(bs[i]);
        }
        if(flag==0){
            JOptionPane.showMessageDialog(null,"SORRY..!! THE BOOK IS UNAVAILABLE");
        }
    }
    
    public static void main(String[] args) {
      new Hamesbookshop();
    }
    
}
