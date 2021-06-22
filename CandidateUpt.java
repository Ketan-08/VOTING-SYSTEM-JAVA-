
package onlinevotingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


public class CandidateUpt 
{
    public static void main(String[] args) 
    {
       CandUpt c = new CandUpt(); 
    }
}

class CandUpt extends JFrame implements ActionListener
{
    JLabel lh,l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
     
    public CandUpt()
    {
     
        lh=new JLabel("UPDATE CANDIDATE LIST");
        lh.setOpaque(true);
        lh.setFont(new Font("Georgia",Font.BOLD,50));
        lh.setHorizontalAlignment(JLabel.CENTER);
        lh.setBackground(Color.BLACK);
        lh.setForeground(Color.cyan);
        lh.setBounds(430,30,800,100);
        
        l1=new JLabel("CANDIDATE NAME");
        l1.setOpaque(true);
        l1.setFont(new Font("Georgia",Font.PLAIN,25));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(300,230,230,50);
        
        l2=new JLabel(":");
        l2.setOpaque(true);
        l2.setBounds(570,230,20,50);
        l2.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l3=new JLabel("AGE");
        l3.setOpaque(true);
        l3.setFont(new Font("Georgia",Font.PLAIN,25));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setBounds(320,310,200,50);
        
        l4=new JLabel(":");
        l4.setOpaque(true);
        l4.setBounds(570,310,20,50);
        l4.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l5=new JLabel("PARTY NAME");
        l5.setOpaque(true);
        l5.setFont(new Font("Georgia",Font.PLAIN,25));
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setBackground(Color.LIGHT_GRAY);
        l5.setBounds(320,390,200,50);
        
        l6=new JLabel(":");
        l6.setOpaque(true);
        l6.setBounds(570,390,20,50);
        l6.setFont(new Font("Georgia",Font.PLAIN,25));
        
        l7=new JLabel("PARTY SYMBOL");
        l7.setOpaque(true);
        l7.setFont(new Font("Georgia",Font.PLAIN,25));
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setBackground(Color.LIGHT_GRAY);
        l7.setBounds(320,470,200,50);
        
        l8=new JLabel(":");
        l8.setOpaque(true);
        l8.setBounds(570,470,20,50);
        l8.setFont(new Font("Georgia",Font.PLAIN,25));
        
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
        t4.setBounds(650,470,300,100);
        t4.setFont(new Font("Consolas",Font.PLAIN,25));
        
        b1=new JButton("INSERT");
        b1.setBounds(300,630,200,50);
        b1.setFont(new Font("Georgia",Font.BOLD,25));
        b1.setBackground(Color.green);
        
        b2=new JButton("DELETE");
        b2.setBounds(600,630,200,50);
        b2.setFont(new Font("Georgia",Font.BOLD,25));
        b2.setBackground(Color.red);
        
        b3=new JButton("CANCEL");
        b3.setBounds(900,630,200,50);
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
        add(l7);add(b4);
        add(l8);
        
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
       if(e.getSource() == b1) {		//Add//
    		
    		String party_name = t3.getText();
        	String party_symbol = t4.getText();
        	String c_name = t1.getText();
        	int c_age = Integer.parseInt(t2.getText());
        	
        	
        	try {
    			
    			String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
    			String uname = "root";
    			String pass = "";
    			String query = "Insert into parties values(?,?,?,?)";
    			
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection con = DriverManager.getConnection(url,uname,pass);
    			PreparedStatement st = con.prepareStatement(query);
    			
    			st.setString(1,party_name);
    			st.setString(2,party_symbol);
    			st.setString(3,c_name);
    			st.setInt(4,c_age);
    			
    			
    			
    			st.executeUpdate();
    			
    			st.close();
    			con.close();
    			
    			
    			}catch (SQLException | ClassNotFoundException sqlException) {
                
    			sqlException.printStackTrace();
                        
                        JOptionPane.showMessageDialog(b1,"Candidate Successfully Inserted!!!");
                        
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                
    		}
    		
    	}
    	
    	if(e.getSource() == b2) {
    		
    		String party_name = t3.getText();
    		
    		try {
    			
    			String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
    			String uname = "root";
    			String pass = "";
    			String query = "Delete * from parties where voterid = '"+party_name+"'";
    			
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection con = DriverManager.getConnection(url,uname,pass);
    			Statement st = con.createStatement();
    			st.executeUpdate(query);
    		
    			
    			st.close();
    			con.close();
    			
    			
    			}catch (SQLException | ClassNotFoundException sqlException) {
                
    			sqlException.printStackTrace();
                
    			}
                
                 JOptionPane.showMessageDialog(b2,"Candidate Successfully Deleted");
                 
                 t1.setText("");
                 t2.setText("");
                 t3.setText("");
                 t4.setText("");
    		
    	}
    	
    	if(e.getSource() == b3) {
    		
    		dispose();
                new AdminOptions();
    	}
        
        if(e.getSource()==b4)
        {
         dispose();
         new AdminOptions();
        }
    }



}
