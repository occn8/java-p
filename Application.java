
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Application extends JFrame implements ActionListener
{
JFrame f1=new JFrame("APPLICATION FORM");
	
	JLabel l;
	JTextField t1;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1;
	ButtonGroup bg;
	int current=0;

	Application()
	{

		l=new JLabel();
		t1=new JTextField(50);
		f1.add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();
			f1.add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b1.addActionListener(this);
		f1.add(b1);
		set();
		l.setBounds(30,40,450,20);
		t1.setBounds(40,60,150,30);
		jb[0].setBounds(50,80,200,20);
		jb[1].setBounds(50,110,200,20);
		jb[2].setBounds(50,140,200,20);
		jb[3].setBounds(50,170,200,20);
		b1.setBounds(200,240,100,30);
		f1.getContentPane().setBackground(new java.awt.Color(205, 200, 166));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(null);
		f1.setLocation(300,100);
		f1.setVisible(true);
		f1.setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			current++;
			set();
			if(current==5)
			{
				b1.setEnabled(true);
				b1.setText("Submit");
			}
		}

		if(e.getActionCommand().equals("Submit"))
		{

			JOptionPane.showMessageDialog(this,"SUBMITTED SUCCESFULLY");
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("Qn.1: Which one of  the UMU campuses would you choose.");
			jb[0].setText("Nkozi");jb[1].setText("Rubaga");jb[2].setText("Mbale");jb[3].setText("Masaka");
		}
		if(current==1)
		{
			l.setText("Qn.2: Which course of study are opting for.");
			jb[0].setText("BscIT");jb[1].setText("BscGen");jb[2].setText("BscArch");jb[3].setText("Bsc BBS");
		}
		if(current==2)
		{
			l.setText("Qn.3: What is your religion (if NONE of listed then jump qn).");
			jb[0].setText("Catholic");jb[1].setText("Muslim");jb[2].setText("Protestant");jb[3].setText("SDA");
		}
		if(current==3)
		{
			l.setText("Qn.4: Where did you get to know UMU from.");
			jb[0].setText("My Parents");jb[1].setText("Google");jb[2].setText("Friends");jb[3].setText("My Teacher");
		}
		if(current==4)
		{
			l.setText("Qn.5: Which region of the country are you from?");
			jb[0].setText("North");jb[1].setText("Central");jb[2].setText("East");jb[3].setText("West");
		}
		if(current==5)
		{
			l.setText("Qn.6: Whats your age bracket.");
			jb[0].setText("18-20");jb[1].setText("21-23");jb[2].setText("24-26");jb[3].setText("27 and over");

		}

	}

}
