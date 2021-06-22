
package onlinevotingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;



public class AdminLogin 
{
    public static void main(String[] args) 
    {
       Admin a=new Admin(); 
    }
}

class Admin extends JFrame implements ActionListener
{
     JLabel lh,l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2,b3;
    
    public Admin()
    {
        lh=new JLabel("ADMIN LOGIN");
        lh.setOpaque(true);
        lh.setFont(new Font("Georgia",Font.BOLD,50));
        lh.setHorizontalAlignment(JLabel.CENTER);
        lh.setBackground(Color.YELLOW);
        lh.setForeground(Color.BLACK);
        lh.setBounds(550,30,500, 100);
        
        l1=new JLabel("ADMIN ID");
        l1.setOpaque(true);
        l1.setFont(new Font("Georgia",Font.PLAIN,25));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(320,300,200,50);
        
        l2=new JLabel(":");
        l2.setOpaque(true);
        l2.setBounds(570,300,20,50);
        l2.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l3=new JLabel("PASSWORD");
        l3.setOpaque(true);
        l3.setFont(new Font("Georgia",Font.PLAIN,25));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setBounds(320,400,200,50);
        
        l4=new JLabel(":");
        l4.setOpaque(true);
        l4.setBounds(570,400,20,50);
        l4.setFont(new Font("Georgia",Font.PLAIN,25));
        
        t1=new JTextField();
        t1.setBounds(650,300,300,50);
        t1.setFont(new Font("Consolas",Font.PLAIN,25));
        
        
        t2=new JPasswordField();
        t2.setBounds(650,400,300,50);
        t2.setFont(new Font("Consolas",Font.PLAIN,25));
        
        b1=new JButton("LOGIN");
        b1.setBounds(300,600,300,80);
        b1.setFont(new Font("Georgia",Font.BOLD,25));
        b1.setBackground(Color.green);
        
        b2=new JButton("CANCEL");
        b2.setBounds(800,600,300,80);
        b2.setFont(new Font("Georgia",Font.BOLD,25));
        b2.setBackground(Color.red);
        
        b3=new JButton("BACK");
        b3.setBounds(20,30,180,50);
        b3.setFont(new Font("Georgia",Font.BOLD,25));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        b3.setHorizontalAlignment(JButton.CENTER);
        
        
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(lh);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        
    
    
    
        setLayout(null);
        setVisible(true);
        setSize(5000, 5000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource()==b1)
        {
            int a_id = Integer.parseInt(t1.getText());
			@SuppressWarnings("deprecation")
			String pass_word = t2.getText();
			
			
			try {
				
				String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
				String uname = "root";
				String pass = "";
				String query = ("Select * from admin where admin_id ='"+a_id+"' and admin_password='"+pass_word+"'");
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,uname,pass);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query);
				
				if(rs.next()) {
					
					dispose();
					new Options();
					
				}
			    else {
                   
					JOptionPane.showMessageDialog(b1, "Wrong Admin id & Password");
					
                }
				st.close();
				con.close();
				
				
			}catch (SQLException | ClassNotFoundException sqlException) {
                
				sqlException.printStackTrace();
                
			}
                        
                        
         
        }
        if(e.getSource()==b2)
        {
          dispose();
          new MainPage();
        }
        
        if(e.getSource()==b3)
        {
          dispose();
          new MainPage();
        }
       
    }

}
