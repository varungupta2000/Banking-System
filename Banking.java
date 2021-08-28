import java.awt.*;								
import java.awt.event.*;			
import java.sql.*;							
import java.util.*;							
import javax.swing.*;						
import java.util.Properties;	
import javax.mail.Message.RecipientType;			
import javax.mail.*;
import javax.mail.internet.*;

/* b1,b19 are used in the mainpage function 
 * b2,b3,b4,b5,b6,b7,b16 loggedin page
 b8,l1,l2,t1,box1,t15,l16,l17,t16 is used in the openacc function
 b9,t2,t3,l3,l4 are used in the checkbalance function
 b10,l5,t4 are used in deactivate function
 b11,l6,t5 are used in reactivate function
 b12,l7,l8,t6,t7 are used in deposit money
 b13,l9,l10,t8,t9 are used in withdraw money
 l11,l12,l13,b14,t10,t11,t12 are used in transfer money function
 t14,b17,l15 are used to delete the account
 l18-l27,b18 are used in Welcome Page
 l28,l29,t17,p1,b20,21 are used in login page
 l31,l32,t18,t19,b22 are used in forget password
 */

class BabyAuthenticator extends Authenticator
{
	public PasswordAuthentication getPasswordAuthentication()
	{
		PasswordAuthentication pa = new PasswordAuthentication("put your email","put password");
		return pa;
	}
}

public class Banking extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33;
	JComboBox box1;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,p1,p2;
	static String s3="";
	public void welcome()
	{
		super.setBounds(100, 100, 600, 510);
		super.setResizable(false);
		super.setTitle("Welcome Page");
	        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("E:\\a.jpg")));
        setLayout(new FlowLayout());
		
		l18= new JLabel("Welcome to Banking System");
		l18.setBounds(100, 30, 500, 30);
		super.add(l18);
		l18.setFont(new Font("Verdana", Font.BOLD, 25));
		l18.setForeground(Color.RED);
		
		l19= new JLabel("1. User can Create Account in 4 Banks as given below:");
		l19.setBounds(20, 80, 500, 30);
		super.add(l19);
		l19.setFont(new Font("Verdana", Font.ITALIC, 15));
		l19.setForeground(Color.GREEN);
		
		l20= new JLabel("A. State Bank Of India - Min Opening Amount:1000");
		l20.setBounds(40, 120, 500, 30);
		super.add(l20);
		l20.setFont(new Font("Verdana", Font.ITALIC, 13));
		l20.setForeground(Color.white);
		
		l21= new JLabel("B. Punjab National Bank - Min Opening Amount:500");
		l21.setBounds(40, 160, 500, 30);
		super.add(l21);
		l21.setFont(new Font("Verdana", Font.ITALIC, 13));
		l21.setForeground(Color.white);
		
		l22= new JLabel("C. Kotak Mahindra Bank - Min Opening Amount:7500");
		l22.setBounds(40, 200, 500, 30);
		super.add(l22);
		l22.setFont(new Font("Verdana", Font.ITALIC, 13));
		l22.setForeground(Color.white);
		
		l23= new JLabel("D. HDFC Bank - Min Opening Amount:10000");
		l23.setBounds(40, 240, 500, 30);
		super.add(l23);
		l23.setFont(new Font("Verdana", Font.ITALIC, 13));
		l23.setForeground(Color.white);
		
		l24= new JLabel("Made By:");
		l24.setBounds(450, 340, 500, 30);
		super.add(l24);
		l24.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		l25= new JLabel("Varun Gupta");
		l25.setBounds(450, 360, 500, 30);
		super.add(l25);
		l25.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		l26= new JLabel("Shubham");
		l26.setBounds(450, 380, 500, 30);
		super.add(l26);
		l26.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		l27= new JLabel("2. Enter All the Details Carefully!!");
		l27.setBounds(20, 280, 500, 30);
		super.add(l27);
		l27.setFont(new Font("Verdana", Font.ITALIC, 15));
		l27.setForeground(Color.green);
		
		b18= new JButton("Go To Main Page");
		b18.setBounds(220, 430, 150, 30);
		super.add(b18);
		b18.addActionListener(this);
		b18.setFont(new Font("Verdana", Font.BOLD, 11));
		
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mainpage()              //This function is for the main page of the Banking system in which we have all the buttons
	{
		super.setBounds(100, 100, 265, 120);
		super.setResizable(false);
		super.setTitle("Banking");
		
		b1= new JButton("Open Account");
		b1.setBounds(0, 0, 250, 40);
		super.add(b1);
		b1.addActionListener(this);
		b1.setForeground(Color.BLUE);
		b1.setBackground(Color.RED);
		b1.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b19= new JButton("Login");
		b19.setBounds(0, 40, 250, 40);
		super.add(b19);
		b19.addActionListener(this);
		b19.setForeground(Color.BLUE);
		b19.setBackground(Color.RED);
		b19.setFont(new Font("Verdana", Font.BOLD, 15));
		
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 	public void login()
 	{
 		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Login Page");
		

		l28= new JLabel("Email ID");
		l28.setBounds(50, 50, 100, 30);
		super.add(l28);
		l28.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t17= new JTextField();
		t17.setBounds(140,50,200, 30);
		super.add(t17);
		
		l29= new JLabel("Password");
		l29.setBounds(50,90,100, 30);
		super.add(l29);
		l29.setFont(new Font("Verdana", Font.BOLD, 11));
		
		p1= new JTextField();
		p1.setBounds(140,90,200, 30);
		super.add(p1);
		
		b20= new JButton("Login");
		b20.setBounds(40, 170, 140, 30);
		super.add(b20);
		b20.addActionListener(this);
		b20.setFont(new Font("Verdana", Font.BOLD, 12));
		
		b21= new JButton("Forget Password");
		b21.setBounds(220, 170, 140, 30);
		super.add(b21);
		b21.addActionListener(this);
		b21.setFont(new Font("Verdana", Font.BOLD, 12));
		
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 	public void forgetpass()
 	{
 		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Login Page");
		

		l31= new JLabel("Email ID");
		l31.setBounds(30, 50, 100, 30);
		super.add(l31);
		l31.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t18= new JTextField();
		t18.setBounds(160,50,200, 30);
		super.add(t18);
		
		l32= new JLabel("New Password");
		l32.setBounds(30, 90, 100, 30);
		super.add(l32);
		l32.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t19= new JTextField();
		t19.setBounds(160,90,200, 30);
		super.add(t19);
		
		l33= new JLabel("Confirm Password");
		l33.setBounds(30, 130, 120, 30);
		super.add(l33);
		l33.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t20= new JTextField();
		t20.setBounds(160,130,200, 30);
		super.add(t20);
		
		b22= new JButton("Change Password");
		b22.setBounds(130, 170, 170, 30);
		super.add(b22);
		b22.addActionListener(this);
		b22.setFont(new Font("Verdana", Font.BOLD, 12));
		
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 	public void Loggedin()
 	{
 		super.setBounds(100, 100, 265, 320);
		super.setResizable(false);
		super.setTitle("Facilities");
		

		b2= new JButton("Check Balance");
		b2.setBounds(0, 0, 250, 40);
		super.add(b2);
		b2.addActionListener(this);
		b2.setForeground(Color.blue);
		b2.setBackground(Color.RED);
		b2.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b3= new JButton("Deposit Money");
		b3.setBounds(0, 40, 250, 40);
		super.add(b3);
		b3.addActionListener(this);
		b3.setForeground(Color.blue);
		b3.setBackground(Color.RED);
		b3.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b4= new JButton("Withdraw Money");
		b4.setBounds(0, 80, 250, 40);
		super.add(b4);
		b4.addActionListener(this);
		b4.setForeground(Color.blue);
		b4.setBackground(Color.RED);
		b4.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b5= new JButton("Fund Transfer");
		b5.setBounds(0, 120, 250, 40);
		super.add(b5);
		b5.addActionListener(this);
		b5.setForeground(Color.blue);
		b5.setBackground(Color.RED);
		b5.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b6= new JButton("Account Deactivate");
		b6.setBounds(0, 160, 250, 40);
		super.add(b6);
		b6.addActionListener(this);
		b6.setForeground(Color.blue);
		b6.setBackground(Color.RED);
		b6.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b7= new JButton("Account Reactivate");
		b7.setBounds(0, 200, 250, 40);
		super.add(b7);
		b7.addActionListener(this);
		b7.setForeground(Color.blue);
		b7.setBackground(Color.RED);
		b7.setFont(new Font("Verdana", Font.BOLD, 15));
		
		b16= new JButton("Delete Your Account");
		b16.setBounds(0, 240, 250, 40);
		super.add(b16);
		b16.addActionListener(this);
		b16.setForeground(Color.blue);
		b16.setBackground(Color.RED);
		b16.setFont(new Font("Verdana", Font.BOLD, 15));
		
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
	public void openacc()				//This function is for the Opening of Accounr
	{
		String[] s= {"State Bank of India","HDFC Bank","Punjab National Bank","Kotak Mahindra Bank"};
		super.setBounds(100, 100, 400, 380);
		super.setResizable(false);
		super.setTitle("Open Account");
		
		
		l1= new JLabel("Select the Bank");
		l1.setBounds(50, 50, 100, 30);
		super.add(l1);
		l1.setFont(new Font("Verdana", Font.BOLD, 11));
		
		box1= new JComboBox(s);
		box1.setBounds(170, 50, 200, 30);
		super.add(box1);
		
		l17= new JLabel("Name");
		l17.setBounds(50,90,100, 30);
		super.add(l17);
		l17.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t16= new JTextField();
		t16.setBounds(170,90,200, 30);
		super.add(t16);
		
		l14= new JLabel("Email");
		l14.setBounds(50,130,100, 30);
		super.add(l14);
		l14.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t13= new JTextField();
		t13.setBounds( 170,130,200, 30);
		super.add(t13);
		
		l2= new JLabel("Amount");
		l2.setBounds(50,170,100, 30);
		super.add(l2);
		l2.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t1= new JTextField();
		t1.setBounds(170,170,200, 30);
		super.add(t1);
		
		l16= new JLabel("Phone Number");
		l16.setBounds(50,210,100, 30);
		super.add(l16);
		l16.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t15= new JTextField();
		t15.setBounds(170,210,200, 30);
		super.add(t15);
		
		l30= new JLabel("Password");
		l30.setBounds(50,250,100,30);
		super.add(l30);
		l30.setFont(new Font("Verdana", Font.BOLD, 11));
		
		p2= new JTextField();
		p2.setBounds(170, 250, 200, 30);
		super.add(p2);
		
		b8= new JButton("Open Account");
		b8.setBounds(140, 300, 150, 30);
		super.add(b8);
		b8.addActionListener(this);
		b8.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void checkbalance() 			//this function is used to check the balance of a partucular account number
	{
		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Check Balance");
		
		l3= new JLabel("Account number");
		l3.setBounds(50, 50, 100, 30);
		super.add(l3);
		l3.setFont(new Font("Verdana", Font.BOLD, 10));
		
		t2= new JTextField();
		t2.setBounds(170, 50, 200, 30);
		super.add(t2);
		
		l4= new JLabel("Balance");
		l4.setBounds(50, 90, 100, 30);
		super.add(l4);
		l4.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t3=new JTextField();
		t3.setBounds(170, 90, 200, 30);
		super.add(t3);
		
		b9= new JButton("Balance");
		b9.setBounds(80, 150, 100, 30);
		super.add(b9);
		b9.addActionListener(this);
		b9.setFont(new Font("Verdana", Font.BOLD, 11));
		
		b15= new JButton("Main Page");
		b15.setBounds(200, 150, 100, 30);
		super.add(b15);
		b15.addActionListener(this);
		b15.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void deposit() 				// function to deposit money
	{
		super.setBounds(100, 100, 500, 250);
		super.setResizable(false);
		super.setTitle("Deposit Money");
		
		l7= new JLabel("Account Number");
		l7.setBounds(50, 50, 200, 30);
		super.add(l7);
		l7.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t6= new JTextField();
		t6.setBounds(250, 50, 200, 30);
		super.add(t6);
		
		l8=new JLabel("Amount to be deposited");
		l8.setBounds(50, 90, 200, 30);
		super.add(l8);
		l8.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t7= new JTextField();
		t7.setBounds(250,90,200,30);
		super.add(t7);
		
		b12= new JButton("Deposit Money");
		b12.setBounds(150, 170, 150, 30);
		super.add(b12);
		b12.addActionListener(this);
		b12.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void withdraw() 				// function to withdraw money
	{
		super.setBounds(100, 100, 500, 250);
		super.setResizable(false);
		super.setTitle("Withdraw Money");
		
		l9= new JLabel("Account Number");
		l9.setBounds(50, 50, 200, 30);
		super.add(l9);
		l9.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t8= new JTextField();
		t8.setBounds(250, 50, 200, 30);
		super.add(t8);
		
		l10=new JLabel("Amount to be Withdrawn");
		l10.setBounds(50, 90, 200, 30);
		super.add(l10);
		l10.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t9= new JTextField();
		t9.setBounds(250,90,200,30);
		super.add(t9);
		
		b13= new JButton("Withdraw Money");
		b13.setBounds(150, 170, 150, 30);
		super.add(b13);
		b13.addActionListener(this);
		b13.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void transfer() 				// function to transfer money
	{
		super.setBounds(100, 100, 600,300);
		super.setResizable(true);
		super.setTitle("Fund Transfer");
		
		l11= new JLabel("Account Number from Where Money to Transfer");
		l11.setBounds(20,50,300,30);
		super.add(l11);
		l11.setFont(new Font("Verdana", Font.BOLD, 10));
		
		l12= new JLabel("Account Number where Money to be Transfered");
		l12.setBounds(20, 90, 300, 30);
		super.add(l12);
		l12.setFont(new Font("Verdana", Font.BOLD, 10));
		
		l13= new JLabel("Amount");
		l13.setBounds(245, 130, 50, 30);
		super.add(l13);
		l13.setFont(new Font("Verdana", Font.BOLD, 10));
		
		t10= new JTextField();
		t10.setBounds(300, 50, 250, 30);
		super.add(t10);
		
		t11= new JTextField();
		t11.setBounds(300, 90, 250, 30);
		super.add(t11);
		
		t12= new JTextField();
		t12.setBounds(300, 130, 250, 30);
		super.add(t12);
		
		b14= new JButton("Transfer");
		b14.setBounds(230, 200, 100, 30);
		super.add(b14);
		b14.addActionListener(this);
		b14.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void deactivate()			//Function to deactivate account
	{
		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Deactivate Account");
		
		l5= new JLabel("Account number");
		l5.setBounds(50, 50, 100, 30);
		super.add(l5);
		l5.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t4= new JTextField();
		t4.setBounds(170, 50, 200, 30);
		super.add(t4);
		
		b10= new JButton("Deactivate");
		b10.setBounds(140, 150, 150, 30);
		super.add(b10);
		b10.addActionListener(this);
		b10.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void reactivate()			//Function to reactivate account
	{
		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Reactivate Account");
		
		l6= new JLabel("Account number");
		l6.setBounds(50, 50, 120, 30);
		super.add(l6);
		l6.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t5= new JTextField();
		t5.setBounds(170, 50, 200, 30);
		super.add(t5);
		
		b11= new JButton("Reactivate");
		b11.setBounds(140, 150, 150, 30);
		super.add(b11);
		b11.addActionListener(this);
		b11.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void deleteacc() 			//Function to delete the Account 
	{
		super.setBounds(100, 100, 400, 250);
		super.setResizable(false);
		super.setTitle("Deleting Account");
		
		l15= new JLabel("Account number");
		l15.setBounds(50, 50, 120, 30);
		super.add(l15);
		l15.setFont(new Font("Verdana", Font.BOLD, 11));
		
		t14= new JTextField();
		t14.setBounds(170, 50, 200, 30);
		super.add(t14);
		
		b17= new JButton("Delete Account");
		b17.setBounds(140, 150, 150, 30);
		super.add(b17);
		b17.addActionListener(this);
		b17.setFont(new Font("Verdana", Font.BOLD, 11));
		
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) 

	{
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

          } catch (Exception e) {
            System.out.println("Look and feel not set.");
          }
		Banking b= new Banking();
		b.welcome();
	}
	public void actionPerformed(ActionEvent e) 
	{
		Banking b= new Banking();
		if(e.getSource()==b18)
		{
			b.mainpage();
			super.dispose();
		}
		if(e.getSource()==b19)
		{
			b.login();
			super.dispose();
		}
		if(e.getSource()==b21)
		{
			b.forgetpass();
			super.dispose();
		}
		
		if(e.getSource()==b1)
		{
			b.openacc();
			super.dispose();
		}
		if(e.getSource()==b2)
		{
			b.checkbalance();
			super.dispose();
		}
		if(e.getSource()==b3)
		{
			b.deposit();
			super.dispose();
		}
		if(e.getSource()==b4)
		{
			b.withdraw();
			super.dispose();
		}
		if(e.getSource()==b5)
		{
			b.transfer();
			super.dispose();
		}
		if(e.getSource()==b6)
		{
			b.deactivate();
			super.dispose();
		}
		if(e.getSource()==b7)
		{
			b.reactivate();
			super.dispose();
		}
		if(e.getSource()==b15)
		{
			b.mainpage();
			super.dispose();
		}
		if(e.getSource()==b16)
		{
			b.deleteacc();
			super.dispose();
		}
		if(e.getSource()==b8) //this is used for the opening of the account and storing it in a database.
		{
			Random r= new Random();
			String s1= (String) box1.getSelectedItem();
			String s2= t1.getText();
			String mail= t13.getText();
			String phone= t15.getText();
			int a=Integer.parseInt(s2);
			String name= t16.getText();
			String pass=p2.getText();
			if(s1=="State Bank of India")
			{
				if(a>=1000)
				{
					s3="SBI"+r.nextInt(2147483647);
					JOptionPane.showMessageDialog(null, "Account has been created and your account number is "+s3 + " Please note it down for furthur use");
					super.dispose();
					b.mainpage();
					try 
					{
						
						int as=1;
						Class.forName("com.mysql.jdbc.Driver");
						Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
						Statement st=co.createStatement();
						st.executeUpdate("create table if not exists account(acc_no varchar(100) Primary Key,"
								+ "Customer_name char(200),"+"Amount int," +"Email varchar(300),"+"Password char(220),"+"Bank_name varchar(100)," +"phone char(200),"+ " Activated_status int)");
						st.executeUpdate("insert into account values('"+s3+"','"+name+"','"+a+"','"+mail+"',sha1('"+pass+"'),'"+s1+"','"+phone+"','"+as+"')");
						
					} 
					catch (Exception e1) 
					{
						System.out.println("error is "+e1);
						e1.printStackTrace();
					}	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum amount to Open Account in SBI is Rs.1000");
					super.dispose();
					b.openacc();
				}
			}
			else if(s1=="HDFC Bank")
			{
				if(a>=10000)
				{
					s3= "HDFC"+r.nextInt(2147483647);
					JOptionPane.showMessageDialog(null, "Account has been created and your account number is "+s3 + " Please note it down for furthur use");
					super.dispose();
					b.mainpage();
					try 
					{
						
						int as=1;
						Class.forName("com.mysql.jdbc.Driver");
						Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
						Statement st=co.createStatement();
						st.executeUpdate("create table if not exists account(acc_no varchar(100) Primary Key,"
								+ "Customer_name char(200),"+"Amount int," +"Email varchar(300),"+"Password char(220),"+"Bank_name varchar(100)," +"phone char(200),"+ " Activated_status int)");
						st.executeUpdate("insert into account values('"+s3+"','"+name+"','"+a+"','"+mail+"',sha1('"+pass+"'),'"+s1+"','"+phone+"','"+as+"')");
					} 
					catch (Exception e1) 
					{
						System.out.println("error is "+e1);
						e1.printStackTrace();
					}	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum amount to Open Account in HDFC is Rs.10000");
					super.dispose();
					b.openacc();
				}
			}
			else if(s1=="Punjab National Bank")
			{
				if(a>=500)
				{
					s3="PNB"+r.nextInt(2147483647);
					JOptionPane.showMessageDialog(null, "Account has been created and your account number is "+ s3 + " Please note it down for furthur use");
					super.dispose();
					b.mainpage();
					try 
					{
						int as=1;
						Class.forName("com.mysql.jdbc.Driver");
						Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
						Statement st=co.createStatement();
						st.executeUpdate("create table if not exists account(acc_no varchar(100) Primary Key,"
								+ "Customer_name char(200),"+"Amount int," +"Email varchar(300),"+"Password char(220),"+"Bank_name varchar(100)," +"phone char(200),"+ " Activated_status int)");
						st.executeUpdate("insert into account values('"+s3+"','"+name+"','"+a+"','"+mail+"',sha1('"+pass+"'),'"+s1+"','"+phone+"','"+as+"')");
					} 
					catch (Exception e1) 
					{
						System.out.println("error is "+e1);
						e1.printStackTrace();
					}	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum amount to Open Account in PNB is Rs.500");
					super.dispose();
					b.openacc();
				}
			}
			else if(s1=="Kotak Mahindra Bank")
			{
				if(a>=7500)
				{
					s3="KMB"+r.nextInt(2147483647);
					JOptionPane.showMessageDialog(null, "Account has been created and your account number is "+s3 + " Please note it down for furthur use");
					super.dispose();
					b.mainpage();
					try 
					{
						int as=1;
						Class.forName("com.mysql.jdbc.Driver");
						Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
						Statement st=co.createStatement();
						st.executeUpdate("create table if not exists account(acc_no varchar(100) Primary Key,"
								+ "Customer_name char(200),"+"Amount int," +"Email varchar(300),"+"Password char(220),"+"Bank_name varchar(100)," +"phone char(200),"+ " Activated_status int)");
						st.executeUpdate("insert into account values('"+s3+"','"+name+"','"+a+"','"+mail+"',sha1('"+pass+"'),'"+s1+"','"+phone+"','"+as+"')");
					} 
					catch (Exception e1) 
					{
						System.out.println("error is "+e1);
						e1.printStackTrace();
					}	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum amount to Open Account in KMB is Rs.7500");
					super.dispose();
					b.openacc();	
				}
			}			
		}//end of oepning account
		
		
		
		
		
		if(e.getSource()==b9)// check balance
		{
			String s4= t2.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				Statement st=co.createStatement();
				ResultSet rs= st.executeQuery("select * from account where Password='"+s4+"'" );
				if(rs.next())
				{
					String s5=rs.getString("Amount");
					String s6=rs.getString("Activated_status");
					int a= Integer.parseInt(s6);
					if(a!=0)
					{
						t3.setText(s5);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your Account was deactivated.Kindly Reactivate to check the balance");
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account number");
					b.Loggedin();
					super.dispose();
				}
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}	
		}//end of check balance
		
		
		
		
		
		if(e.getSource()==b10)//function to deactivate the account
		{
			String s4= t4.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				PreparedStatement ps= co.prepareStatement("update account set Activated_status=? where acc_no =?");
				ps.setInt(1, 0);
				ps.setString(2, s4);
				int c=ps.executeUpdate();
				ResultSet rs= ps.executeQuery("select * from account where acc_no='"+s4+"'");
				if(rs.next())
				{
					int a= rs.getInt("Activated_status");
					if(a==0 && c==1)
					{
						JOptionPane.showMessageDialog(null, "Account Deactivated");
						String mail1= rs.getString("Email");
						String number= rs.getString("acc_no");
						Properties p = new Properties();
						p.put("mail.smtp.host", "smtp.gmail.com");
						p.put("mail.smtp.port", "587");
						p.put("mail.smtp.auth", "true"); // validate email/password of sender
						p.put("mail.smtp.starttls.enable", "true");
						p.put("mail.debug", "true");
						
						BabyAuthenticator ba = new BabyAuthenticator();
						
						// get session object jiske context mai hum mail bhejne wale hain
						Session s = Session.getDefaultInstance(p, ba);
						
						// create object of message to be send in the context of this session
						MimeMessage mm = new MimeMessage(s);
						mm.setSubject("Account Deactivation");
						mm.setRecipients(RecipientType.TO, mail1);
						MimeBodyPart bp1 = new MimeBodyPart();
						MimeMultipart mp = new MimeMultipart();
						bp1.setContent("<p>Your Account with Account Number: "+number+" has been deactivated</p><br><br><br>Thank You<br>Customer Care<br>Banking System", "text/html");
						mp.addBodyPart(bp1);
						mm.setContent(mp);
						Transport.send(mm);
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number");
					b.Loggedin();
					super.dispose();
				}
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
			
		}//end of deactivate account
		
		
		
		
		
		if(e.getSource()==b11)//function to reactivate the account
		{
			String s4= t5.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				PreparedStatement ps= co.prepareStatement("update account set Activated_status=? where acc_no =?");
				ps.setInt(1, 1);
				ps.setString(2, s4);
				ps.executeUpdate();
				ResultSet rs= ps.executeQuery("select * from account where acc_no='"+s4+"'");
				if(rs.next())
				{
					int a= rs.getInt("Activated_status");
					if(a==1)
					{
						JOptionPane.showMessageDialog(null, "Account Reactivated");
						b.mainpage();
						String mail1= rs.getString("Email");
						String number= rs.getString("acc_no");
						Properties p = new Properties();
						p.put("mail.smtp.host", "smtp.gmail.com");
						p.put("mail.smtp.port", "587");
						p.put("mail.smtp.auth", "true"); // validate email/password of sender
						p.put("mail.smtp.starttls.enable", "true");
						p.put("mail.debug", "true");
						
						BabyAuthenticator ba = new BabyAuthenticator();
						
						// get session object jiske context mai hum mail bhejne wale hain
						Session s = Session.getDefaultInstance(p, ba);
						
						// create object of message to be send in the context of this session
						MimeMessage mm = new MimeMessage(s);
						mm.setSubject("Account Reactivation");
						mm.setRecipients(RecipientType.TO, mail1);
						MimeBodyPart bp1 = new MimeBodyPart();
						MimeMultipart mp = new MimeMultipart();
						bp1.setContent("<p>Your Account with Account Number: "+number+" has been reactivated</p><br><br><br>Thank You<br>Customer Care<br>Banking System", "text/html");
						mp.addBodyPart(bp1);
						mm.setContent(mp);
						Transport.send(mm);
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number");
					b.Loggedin();
					super.dispose();
				}
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
			
		}//end of reactivate account
		
		
		
		
		
		
		if(e.getSource()==b17)//function to delete the account
		{
			String s4= t14.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				PreparedStatement ps= co.prepareStatement("delete from account where acc_no =?");
				ps.setString(1, s4);
				int c=ps.executeUpdate();
				if(c==1) 
				{
					JOptionPane.showMessageDialog(null, "Account Deleted");	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number");
				}
				
				b.mainpage();
				super.dispose();				
				
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
			
		}//end of delete account
		
		
		
		
		
		if(e.getSource()==b12)//deposit money
		{
			String s4=t6.getText();
			String s5= t7.getText();
			int a= Integer.parseInt(s5);
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				Statement st= co.createStatement();
				ResultSet rs= st.executeQuery("select * from account where acc_no='"+s4+"'");
				if(rs.next())
				{
					int am=rs.getInt("Amount");
					int as=rs.getInt("Activated_status");
					int c=a+am;
					if(as!=0)
					{
						PreparedStatement ps=co.prepareStatement("update account set Amount=? where acc_no=?");
						ps.setInt(1, c);
						ps.setString(2, s4);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Amount has been deposited into your account");
						String mail1= rs.getString("Email");
						String number= rs.getString("acc_no");
						Properties p = new Properties();
						p.put("mail.smtp.host", "smtp.gmail.com");
						p.put("mail.smtp.port", "587");
						p.put("mail.smtp.auth", "true"); // validate email/password of sender
						p.put("mail.smtp.starttls.enable", "true");
						p.put("mail.debug", "true");
						
						BabyAuthenticator ba = new BabyAuthenticator();
						
						// get session object jiske context mai hum mail bhejne wale hain
						Session s = Session.getDefaultInstance(p, ba);
						
						// create object of message to be send in the context of this session
						MimeMessage mm = new MimeMessage(s);
						mm.setSubject("Account Balance Update");
						mm.setRecipients(RecipientType.TO, mail1);
						MimeBodyPart bp1 = new MimeBodyPart();
						MimeMultipart mp = new MimeMultipart();
						bp1.setContent("<p>Your Account with Account Number: "+number+" has been upadated and the updated balance is: "+c+"</p><br><br><br>Thank You<br>Customer Care<br>Banking System", "text/html");
						mp.addBodyPart(bp1);
						mm.setContent(mp);
						Transport.send(mm);
						b.Loggedin();
						super.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your account was deactivated.kindly reactivate to deposit money");
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number");
					b.Loggedin();
					super.dispose();
				}
				
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
		}//end of deposit money
		
		
		
		
		
		if(e.getSource()==b13) //function to withdraw money
		{
			String s4=t8.getText();
			String s5= t9.getText();
			int a= Integer.parseInt(s5);
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				Statement st= co.createStatement();
				ResultSet rs= st.executeQuery("select * from account where acc_no='"+s4+"'");
				if(rs.next())
				{
					int am=rs.getInt("Amount");
					int as=rs.getInt("Activated_status");
					int c=am-a;
					if(c<0)
					{
						JOptionPane.showMessageDialog(null, "You can maximum Witdraw upto "+am);
						b.mainpage();
						super.dispose();
					}
					else if(as!=0)
					{
						PreparedStatement ps=co.prepareStatement("update account set Amount=? where acc_no=?");
						ps.setInt(1, c);
						ps.setString(2, s4);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Amount has been withdrwan from your account");
						String mail1= rs.getString("Email");
						String number= rs.getString("acc_no");
						Properties p = new Properties();
						p.put("mail.smtp.host", "smtp.gmail.com");
						p.put("mail.smtp.port", "587");
						p.put("mail.smtp.auth", "true"); // validate email/password of sender
						p.put("mail.smtp.starttls.enable", "true");
						p.put("mail.debug", "true");
						
						BabyAuthenticator ba = new BabyAuthenticator();
						
						// get session object jiske context mai hum mail bhejne wale hain
						Session s = Session.getDefaultInstance(p, ba);
						
						// create object of message to be send in the context of this session
						MimeMessage mm = new MimeMessage(s);
						mm.setSubject("Account Balance Reduction");
						mm.setRecipients(RecipientType.TO, mail1);
						MimeBodyPart bp1 = new MimeBodyPart();
						MimeMultipart mp = new MimeMultipart();
						bp1.setContent("<p>Your Account with Account Number: "+number+" has been updated and updated balance is: "+c+"</p><br><br><br>Thank You<br>Customer Care<br>Banking System", "text/html");
						mp.addBodyPart(bp1);
						mm.setContent(mp);
						Transport.send(mm);
						b.Loggedin();
						super.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your account was deactivated.kindly reactivate to withdraw money");
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number");
					b.Loggedin();
					super.dispose();
				}
				
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
		}//end of withdraw money
		
		
		
		
	
		if(e.getSource()==b14)// to transfer funds
		{
			int d=0;
			String s4=t10.getText();
			String s5= t11.getText();
			String s6=t12.getText();
			int c= Integer.parseInt(s6);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				Statement st= co.createStatement();
				ResultSet rs= st.executeQuery("Select * from account where acc_no='"+s4+"'");
				if(rs.next())
				{
					int am= rs.getInt("Amount");
					int as= rs.getInt("Activated_status");
					int ab=am-c;
					if(ab<0)
					{
						JOptionPane.showMessageDialog(null, "You Dont have enough money to transfer this amount");
						b.Loggedin();
						super.dispose();
					}
					else if(as!=0)
					{
						PreparedStatement ps=co.prepareStatement("update account set Amount=? where acc_no=?");
						ps.setInt(1, ab);
						ps.setString(2, s4);
						ps.executeUpdate();
						d=1;
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Account Deactivated.Kindly Reactivate");
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number of Debit Account");
					b.Loggedin();
					super.dispose();
				}
				ResultSet rs1= st.executeQuery("Select * from account where acc_no='"+s5+"'");
				if(rs1.next())
				{
					int am= rs1.getInt("Amount");
					int as= rs1.getInt("Activated_status");
					int ab=am+c;
					if(as!=0)
					{
						if(d==1)
						{
							PreparedStatement ps=co.prepareStatement("update account set Amount=? where acc_no=?");
							ps.setInt(1, ab);
							ps.setString(2, s5);
							ps.executeUpdate();
							JOptionPane.showMessageDialog(null, "Your Transfer is Completed!!!!");
							b.Loggedin();
							super.dispose();
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Account Deactivated.Kindly Reactivate");
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong Account Number of Credit Account");
					b.Loggedin();
					super.dispose();
				}
								
			} 
			catch (Exception e1) 
			{
				System.out.println("error is "+e1);
				e1.printStackTrace();
			}
		}// end of transfer funds
		
		
		
		
		
		if(e.getSource()==b20)//for login
		{
			String emailID= t17.getText();
			String pass= p1.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");
				Statement st=co.createStatement();
				ResultSet rs= st.executeQuery("select Email from account where Password=sha1('"+pass+"')");
				if(rs.next())
				{
					String a= new String(rs.getString("Email"));
					if(a.equals(emailID)) 
					{
						b.Loggedin();
						super.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your Email is incorrect");
						b.login();
						super.dispose();
					}
				}		
				else
				{
					JOptionPane.showMessageDialog(null, "Your Password is incorrect");
					b.login();
					super.dispose();
				}
			}
			catch (Exception f) 
			{
				f.printStackTrace();
			}			
		}//end of login
		
		
		
		if(e.getSource()==b22) //for forgetting password
		{
			String email=t18.getText();
			String pass=t19.getText();
			String passcon= t20.getText();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection co= DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "root");

				PreparedStatement ps= co.prepareStatement("update account set Password=sha1(?) where Email=?");
				ps.setString(1, pass);
				ps.setString(2, email);
				int c= ps.executeUpdate();
				if(pass.equals(passcon))
				{
					if(c==1 )
					{
						JOptionPane.showMessageDialog(null, "Password has been Reset");
						b.Loggedin();
						super.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No account find with this"+email);
						b.Loggedin();
						super.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match");
					b.Loggedin();
					super.dispose();
				}
				
			}
			catch (Exception f) 
			{
				f.printStackTrace();
			}			
		}//end of forgetting password
	}
}