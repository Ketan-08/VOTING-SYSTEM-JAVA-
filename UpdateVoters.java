
package onlinevotingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class UpdateVoters
{
    public static void main(String[] args) 
    {
        new UpdateList(); 
    }
}

class UpdateList extends JFrame implements ActionListener
{
     JLabel lh,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     JTextField t1,t2,t3,t4,t5;
     JButton b1,b2,b3,b4;
     
    public UpdateList()
    {
        lh=new JLabel("UPDATE VOTERS LIST");
        lh.setOpaque(true);
        lh.setFont(new Font("Georgia",Font.BOLD,50));
        lh.setHorizontalAlignment(JLabel.CENTER);
        lh.setBackground(Color.BLACK);
        lh.setForeground(Color.cyan);
        lh.setBounds(450,30,700,100);
        
        l1=new JLabel("VOTER NAME");
        l1.setOpaque(true);
        l1.setFont(new Font("Georgia",Font.PLAIN,25));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(320,230,200,50);
        
        l2=new JLabel(":");
        l2.setOpaque(true);
        l2.setBounds(570,230,20,50);
        l2.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l3=new JLabel("VOTER ID");
        l3.setOpaque(true);
        l3.setFont(new Font("Georgia",Font.PLAIN,25));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setBounds(320,310,200,50);
        
        l4=new JLabel(":");
        l4.setOpaque(true);
        l4.setBounds(570,310,20,50);
        l4.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l5=new JLabel("AGE");
        l5.setOpaque(true);
        l5.setFont(new Font("Georgia",Font.PLAIN,25));
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setBackground(Color.LIGHT_GRAY);
        l5.setBounds(320,390,200,50);
        
        l6=new JLabel(":");
        l6.setOpaque(true);
        l6.setBounds(570,390,20,50);
        l6.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l7=new JLabel("ADDRESS");
        l7.setOpaque(true);
        l7.setFont(new Font("Georgia",Font.PLAIN,25));
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setBackground(Color.LIGHT_GRAY);
        l7.setBounds(320,470,200,50);
        
        l8=new JLabel(":");
        l8.setOpaque(true);
        l8.setBounds(570,470,20,50);
        l8.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l9=new JLabel("PASSWORD");
        l9.setOpaque(true);
        l9.setFont(new Font("Georgia",Font.PLAIN,25));
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setBackground(Color.LIGHT_GRAY);
        l9.setBounds(320,550,200,50);
        
        l10=new JLabel(":");
        l10.setOpaque(true);
        l10.setBounds(570,550,20,50);
        l10.setFont(new Font("Georgia",Font.PLAIN,25));
        
        t1=new JTextField();
        t1.setBounds(650,230,300,50);
        t1.setFont(new Font("Consolas",Font.PLAIN,25));
        
        t2=new JTextField();
        t2.setBounds(650,310,300,50);
        t2.setFont(new Font("Consolas",Font.PLAIN,25));
        
        t3=new JTextField();
        t3.setBounds(650,390,300,50);
        t3.setFont(new Font("Consolas",Font.PLAIN,25));
        
        t4=new JTextField();
        t4.setBounds(650,470,300,70);
        t4.setFont(new Font("Consolas",Font.PLAIN,25));
        
        t5=new JPasswordField();
        t5.setBounds(650,550,300,50);
        t5.setFont(new Font("Consolas",Font.PLAIN,25));
        
        b1=new JButton("ADD");
        b1.setBounds(300,710,200,50);
        b1.setFont(new Font("Georgia",Font.BOLD,25));
        b1.setBackground(Color.green);
        
        b2=new JButton("DELETE");
        b2.setBounds(600,710,200,50);
        b2.setFont(new Font("Georgia",Font.BOLD,25));
        b2.setBackground(Color.red);
        
        b3=new JButton("CANCEL");
        b3.setBounds(900,710,200,50);
        b3.setFont(new Font("Georgia",Font.BOLD,25));
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.white);
        
        b4=new JButton("BACK");
        b4.setBounds(20,30,180,50);
        b4.setFont(new Font("Georgia",Font.BOLD,25));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        b4.setHorizontalAlignment(JButton.CENTER);

        add(lh);add(t1);
        add(l1);add(t2);
        add(l2);add(t3);
        add(l3);add(t4);
        add(l4);add(b1);
        add(l5);add(b2);
        add(l6);add((b3));
        add(l7);add(t5);
        add(l8);add(b4);
        add(l9);
        add(l10);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        setLayout(null);
        setVisible(true);
        setSize(4000, 4000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
      
    }


    public void actionPerformed(ActionEvent e) 
    {
      if(e.getSource() == b1) 
      {		//Add//
    		
    		int id = Integer.parseInt(t2.getText());
        	String name = t1.getText();
        	@SuppressWarnings("deprecation")
        	String pass_word = t5.getText();
        	int age = Integer.parseInt(t3.getText());
        	String add = t4.getText();
        	
        	try
                {
    			
    			String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
    			String uname = "root";
    			String pass = "";
    			String query = "Insert into voters(voter_id,votername,age,address,password,voted) values(?,?,?,?,?,?)";
    			
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection con = DriverManager.getConnection(url,uname,pass);
    			PreparedStatement st = con.prepareStatement(query);
    		
    			st.setInt(1,id);
    			st.setString(2, name);
    			st.setInt(3,age);
    			st.setString(4,add);
    			st.setString(5,pass_word);
    			st.setString(6,"No");
    			
    			st.executeUpdate();
    			
    			st.close();
    			con.close();
    				
    		}
                catch (SQLException | ClassNotFoundException sqlException) 
                {
                
    			sqlException.printStackTrace();
                
    		}
                
                JOptionPane.showMessageDialog(b1,"Voter Successfully Added!!!");
    		t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                
    	}       
    	
    	if(e.getSource() == b2) {
    		
    		int id = Integer.parseInt(t2.getText());
    		
    		try {
    			
    			String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
    			String uname = "root";
    			String pass = "";
    			String query = "Delete from voters where voter_id = '"+id+"'";
    			
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection con = DriverManager.getConnection(url,uname,pass);
    			Statement st = con.createStatement();
    			st.executeUpdate(query);
    		
    			
    			st.close();
    			con.close();
    			
    			
    			}catch (SQLException | ClassNotFoundException sqlException) {
                
    			sqlException.printStackTrace();
                
    			}
                
                JOptionPane.showMessageDialog(b2,"Voter Successfully Deleted!!!");
                
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
    		
    	}
    	
    	if(e.getSource() == b3) {
    		
    		dispose();
                new Options();
    	}
        
        if(e.getSource() == b4) {
    		
    		dispose();
                new Options();
    	}
    }



}
