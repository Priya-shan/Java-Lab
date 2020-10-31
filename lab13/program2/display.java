
package program2;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;


public class display extends JFrame implements ActionListener {
JLabel ll1,ll2;
JButton bb1,bb2;
JTextPane tt1; 
JTextField tf1;
JFrame f;
bookstock bs;    
    public display(bookstock bs) {
    this.bs=bs;
    
    f=new JFrame("book details");
    ll1=new JLabel("THE BOOK IS AVAILABLE...!!");
    ll1.setBounds(170, 10, 300, 30);
    bb1=new JButton("VIEW DETAILS");
    bb1.setBounds(100, 50,300,30);
    tt1=new JTextPane();
    tt1.setBounds(100, 100,300,150);
    tt1.setEditable(false);
    bb2=new JButton("ENTER");
    bb2.setBounds(300, 300,100,30);
    ll2=new JLabel("ENTER NO:OF:COPIES NEEDED : ");
    ll2.setBounds(30, 300, 200, 30);
    tf1=new JTextField();
    tf1.setBounds(220,300 ,50, 30);
    
    f.add(ll1);
    f.add(tt1);
    f.add(bb1);
    f.add(bb2);
    f.add(ll2);
    f.add(tf1);
    
    bb1.addActionListener(this);
    bb2.addActionListener(this);
    f.setSize(500,400);
    f.setLayout(null);
    f.setVisible(true);
    f.getContentPane().setBackground(Color.YELLOW);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==bb1){
           tt1.setText("\n\n\n TITLE------>"+String.valueOf(bs.title)+"\n AUTHOR------>"+String.valueOf(bs.author)+
          "\n PUBLISHER------>"+String.valueOf(bs.publisher)+"\n PRICE------>"+String.valueOf(bs.price));
       }
       if(ae.getSource()==bb2){
           String str="";
           String copies="";
           if(Integer.parseInt(tf1.getText())< bs.stock){
              str=String.format(String.valueOf((Integer.parseInt(tf1.getText())*bs.price)));
              copies=tf1.getText();
              f.setVisible(false);
              new bill(bs,str,copies);
           }
           else{
           JOptionPane.showMessageDialog(null,"Required stock is Unavailable");
           }
           
       }
     }
    
}
