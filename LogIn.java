import javax.swing.*;
import java.awt.event.*;

public class LogIn implements ActionListener
{

JFrame f1=new JFrame("LOG IN");
JLabel l1,l2;
JTextField t1;
JPasswordField pw;
JButton b1,b2;

LogIn()
{
l1=new JLabel("User Name");
l2=new JLabel("Password");
t1=new JTextField(20);
pw=new JPasswordField(20);
b1=new JButton("Log In");
b2=new JButton("Back");

f1.setSize(600,350);
f1.setLocation(300,100);
f1.setVisible(true);
f1.setLayout(null);

f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(pw);
f1.getContentPane().add(b1);
f1.getContentPane().add(b2);
f1.getContentPane().setBackground(new java.awt.Color(205, 200, 166));

l1.setBounds(100,60,100,30);
t1.setBounds(250,60,150,30);
l2.setBounds(100,100,100,30);
pw.setBounds(250,100,150,30);
b1.setBounds(150,200,100,30);
b2.setBounds(350,200,100,30);

b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
		{
f1.dispose();
Application p2=new Application();
	}
if(e.getSource()==b2)
		{
	f1.dispose();
	PreLog p4=new PreLog();
		}

}

public static void main(String []args)
{
LogIn p1=new LogIn();
}
}
