
package onlinevotingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


public class Result
{
    public static void main(String[] args) throws ClassNotFoundException
    {
       ViewResult r = new ViewResult();
    }
}

class ViewResult extends JFrame implements ActionListener
{
    JLabel lh,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6;
    
    int r1=0,r2=0,r3=0,r4=0,r5=0;     //stores the count of votes of respective parties//
		
    
    
    public ViewResult() throws ClassNotFoundException
    {
        int p=0;  //percentage of participation//
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
			String uname = "root";
			String pass = "";
			String query1 = "Select electedparty,count(*) from voters where voted='Yes' group by electedparty";
			String query2 = "Select count(*) from voters where voted='Yes'";
			String query3 = "Select count(*) from voters";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pass);
			Statement st = con.createStatement();
			ResultSet rs  = st.executeQuery(query1);
			
			
			while(rs.next()) {
				
				String party = rs.getString(1);
				
				
				if(party.equals("BJP")) {
					
					r1 = rs.getInt(2);
				}
				else if(party.equals("SHIVSENA")) {
					
					r2 = rs.getInt(2);
				}
				else if(party.equals("CONGRESS")) {
					
					
					r3 = rs.getInt(2);
				}
				else if(party.equals("NCP")) {
					
					
					r4 = rs.getInt(2);
				}
				else{
					
					r5 = rs.getInt(2);
				}
				
			}
			
			
			
			int x;			//  no of voters participated//
			int y;			// total no of voters//
			
			rs  = st.executeQuery(query2);
			rs.next();
			x = rs.getInt(1);
		
			rs  = st.executeQuery(query3);
			rs.next();
			y = rs.getInt(1);
			
			p = (x*100)/y;
			
			st.close();
			con.close();
			
			
		}catch (SQLException sqlException) {
            
			sqlException.printStackTrace();
            
		}
        
        
        
        lh=new JLabel("VIEW RESULTS");
        lh.setOpaque(true);
        lh.setFont(new Font("Georgia",Font.BOLD,50));
        lh.setHorizontalAlignment(JLabel.CENTER);
        lh.setBackground(Color.BLACK);
        lh.setForeground(Color.cyan);
        lh.setBounds(430,30,800,100);
        
        l1=new JLabel("CANDIDATES");
        l1.setOpaque(true);
        l1.setFont(new Font("Georgia",Font.BOLD,25));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        l1.setBounds(320,200,200,50);
        
        l2=new JLabel("TOTAL VOTES");
        l2.setOpaque(true);
        l2.setFont(new Font("Georgia",Font.BOLD,25));
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        l2.setBounds(1020,200,200,50);
        
        l3=new JLabel("1.");
        l3.setOpaque(true);
        l3.setBounds(230,300,80,60);
        l3.setFont(new Font("Georgia",Font.BOLD,25));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.black);
        
        l4=new JLabel("2.");
        l4.setOpaque(true);
        l4.setBounds(230,380,80,60);
        l4.setFont(new Font("Georgia",Font.BOLD,25));
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(Color.black);
        
        l5=new JLabel("3.");
        l5.setOpaque(true);
        l5.setBounds(230,460,80,60);
        l5.setFont(new Font("Georgia",Font.BOLD,25));
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(Color.black);
        
        l6=new JLabel("4.");
        l6.setOpaque(true);
        l6.setBounds(230,540,80,60);
        l6.setFont(new Font("Georgia",Font.BOLD,25));
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(Color.black);
        
        l7=new JLabel("5.");
        l7.setOpaque(true);
        l7.setBounds(230,620,80,60);
        l7.setFont(new Font("Georgia",Font.BOLD,25));
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setForeground(Color.black);
        
        l8=new JLabel("BJP");
        l8.setOpaque(true);
        l8.setFont(new Font("Georgia",Font.BOLD,25));
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setBackground(Color.LIGHT_GRAY);
        l8.setForeground(Color.BLACK);
        l8.setBounds(300,300,200,50);
        
        l9=new JLabel("SHIVSENA");
        l9.setOpaque(true);
        l9.setFont(new Font("Georgia",Font.BOLD,25));
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setBackground(Color.LIGHT_GRAY);
        l9.setForeground(Color.black);
        l9.setBounds(300,380,200,50);
        
        l10=new JLabel("CONGRESS");
        l10.setOpaque(true);
        l10.setFont(new Font("Georgia",Font.BOLD,25));
        l10.setHorizontalAlignment(JLabel.CENTER);
        l10.setBackground(Color.LIGHT_GRAY);
        l10.setForeground(Color.black);
        l10.setBounds(300,460,200,50);
        
        l11=new JLabel("NCP");
        l11.setOpaque(true);
        l11.setFont(new Font("Georgia",Font.BOLD,25));
        l11.setHorizontalAlignment(JLabel.CENTER);
        l11.setBackground(Color.LIGHT_GRAY);
        l11.setForeground(Color.black);
        l11.setBounds(300,540,200,50);
        
        l12=new JLabel("NOTA");
        l12.setOpaque(true);
        l12.setFont(new Font("Georgia",Font.BOLD,25));
        l12.setHorizontalAlignment(JLabel.CENTER);
        l12.setBackground(Color.LIGHT_GRAY);
        l12.setForeground(Color.black);
        l12.setBounds(300,620,200,50);
       
        t1=new JTextField();
        t1.setBounds(1020,300,300,50);
        t1.setFont(new Font("Consolas",Font.BOLD,25));
        t1.setEnabled(false);
        //t1.setText("0");
        t1.setText(Integer.toString(r1));
        
        t2=new JTextField();
        t2.setBounds(1020,380,300,50);
        t2.setFont(new Font("Consolas",Font.PLAIN,25));
        t2.setEnabled(false);
        //t2.setText("0");
        t2.setText(Integer.toString(r2));
        
        t3=new JTextField();
        t3.setBounds(1020,460,300,50);
        t3.setFont(new Font("Consolas",Font.PLAIN,25));
        t3.setEnabled(false);
        //t3.setText("0");
        t3.setText(Integer.toString(r3));
        
        t4=new JTextField();
        t4.setBounds(1020,540,300,50);
        t4.setFont(new Font("Consolas",Font.PLAIN,25));
        t4.setEnabled(false);
       // t4.setText("0");
       t4.setText(Integer.toString(r4));
        
        
        t5=new JTextField();
        t5.setBounds(1020,620,300,50);
        t5.setFont(new Font("Consolas",Font.PLAIN,25));
        t5.setEnabled(false);
       // t5.setText("0");
       t5.setText(Integer.toString(r5));
        
        l13=new JLabel("PERCENTAGE OF PEOPLE VOTED");
        l13.setOpaque(true);
        l13.setFont(new Font("Georgia",Font.BOLD,25));
        l13.setHorizontalAlignment(JLabel.CENTER);
        l13.setBackground(Color.LIGHT_GRAY);
        l13.setForeground(Color.black);
        l13.setBounds(180,730,480,50);
        
        l14=new JLabel(":");
        l14.setOpaque(true);
        l14.setBounds(750,730,20,50);
        l14.setFont(new Font("Georgia",Font.BOLD,25));
        
        t6=new JTextField();
        t6.setBounds(900,730,400,50);
        t6.setFont(new Font("Consolas",Font.PLAIN,25));
        t6.setEnabled(false);
       // t6.setText("0");
       t6.setText(Integer.toString(p));
        
        b1=new JButton("BACK");
        b1.setBounds(20,30,180,50);
        b1.setFont(new Font("Georgia",Font.BOLD,25));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setHorizontalAlignment(JButton.CENTER);
        
         	
		
		
		
		
        
        
        
        
        
        
        
        add(lh);add(t1);
        add(l1);add(t2);
        add(l2);add(t3);
        add(l3);add(t4);
        add(l4);add(t5);
        add(l5);add(t6);
        add(l6);add(b1);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        
        
        setLayout(null);
        setVisible(true);
        setSize(4000, 4000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    }

    
    public void actionPerformed(ActionEvent e)
    {
                 
        
        if(e.getSource()==b1)
        {
            dispose();
            new Options();
        }
    }




}        