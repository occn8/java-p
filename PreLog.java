import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PreLog implements ActionListener
{

JFrame f1=new JFrame("HOME");
JButton b1;


PreLog()
{
Font f = new Font("Serif", Font.BOLD, 25);
Font v = new Font("", Font.BOLD, 15);
JLabel label = new JLabel("UGANDA MARTYRS UNIVERSITY");
label.setForeground(new java.awt.Color(139,0,0));
label.setFont(f);
JLabel l1 = new JLabel("Welcome To UMU Application Platform");
JLabel l2 = new JLabel("Your SUCCESFULLY Signed Up");
l1.setFont(v);
l2.setFont(v);
b1=new JButton("Apply Now");
JLabel background;
ImageIcon img= new ImageIcon("index.png");
background =new JLabel("",img,JLabel.CENTER);
background.setBounds(0,0,300,100);
f1.add(background);

f1.setSize(600,450);
f1.setLocation(300,100);
f1.setVisible(true);
f1.setLayout(null);

f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
f1.add(label);
f1.add(l1);
f1.add(l2);
f1.getContentPane().add(b1);
f1.getContentPane().setBackground(new java.awt.Color(205, 200, 166));

label.setBounds(50,10,500,50);
l1.setBounds(100,60,350,30);
l2.setBounds(150,320,300,30);
b1.setBounds(220,360,150,30);

b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{

f1.dispose();
LogIn p3=new LogIn();
}

public static void main(String []args)
{
PreLog p4=new PreLog();
}
}
