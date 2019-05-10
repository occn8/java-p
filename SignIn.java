import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SignIn implements ActionListener
{

JFrame f1=new JFrame("SIGN UP");
JLabel label,l1,l2,l3,l4,l5,l6,l7,l8;
JRadioButton jb1,jb2;
JTextField t1,t2,t3,t4;
JTextArea ta;
JPasswordField pw1,pw2;
JButton b1,b2;

SignIn()
{
Font f = new Font("Serif", Font.BOLD, 25);
JLabel label = new JLabel("UGANDA MARTYRS UNIVERSITY");
label.setForeground(new java.awt.Color(139,0,0));
label.setFont(f);
l1=new JLabel("FIRST NAME");
l2=new JLabel("SECOND NAME");
l3=new JLabel("PASSWORD");
l4=new JLabel("(RE)-PASSWORD");
l5=new JLabel("A'LEVEL index");
l6=new JLabel("O'LEVEL index");
l7=new JLabel("SEX:");
l8=new JLabel("WRITE ABOUT YOU:");
t1=new JTextField(30);
t2=new JTextField(30);
t3=new JTextField(20);
t4=new JTextField(20);
ta=new JTextArea();
pw1=new JPasswordField(5);
pw2=new JPasswordField(5);
jb1=new JRadioButton();
jb2=new JRadioButton();
b1=new JButton("Sign up");
b2=new JButton("Back");

f1.setSize(600,450);
f1.setLocation(300,100);
f1.setVisible(true);
f1.setLayout(null);

f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
f1.add(label);
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(l4);
f1.add(l5);
f1.add(l6);
f1.add(l7);
f1.add(l8);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(t4);
f1.add(ta);
f1.add(pw1);
f1.add(pw2);
f1.add(jb1);
jb1.setText("Male");
jb2.setText("Female");
f1.add(jb2);
f1.getContentPane().add(b1);
f1.getContentPane().add(b2);
f1.getContentPane().setBackground(new java.awt.Color(205, 200, 166));

label.setBounds(50,10,500,40);
l1.setBounds(10,60,100,30);
l2.setBounds(300,60,100,30);
l3.setBounds(10,100,100,30);
l4.setBounds(290,100,150,30);
l5.setBounds(10,140,100,30);
l6.setBounds(300,140,100,30);
l7.setBounds(200,180,100,30);
l8.setBounds(10,240,150,30);
t1.setBounds(120,60,150,30);
t2.setBounds(420,60,150,30);
t3.setBounds(120,140,150,30);
t4.setBounds(420,140,150,30);
ta.setBounds(150,240,350,100);
pw1.setBounds(120,100,150,30);
pw2.setBounds(420,100,150,30);
jb1.setBounds(250,180,100,30);
jb2.setBounds(350,180,100,30);
b1.setBounds(100,350,100,30);
b2.setBounds(350,350,100,30);

b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
		{
	f1.dispose();
	PreLog p3=new PreLog();
}
if(e.getSource()==b2)
		{
	f1.dispose();
	Home p4=new Home();
		}

}

public static void main(String []args)
{
SignIn p4=new SignIn();
}
}
