
package onlinevotingsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class VotePage 
{
    public static void main(String[] args) 
    {
       //VotePage vp=new VotePage();
        
        
    }
    public VotePage(int x)
    {
        Vote v = new Vote(x);
    };
    
} 

class Vote extends JFrame implements ActionListener
{
   
    JLabel lh,lw,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JRadioButton r1,r2,r3,r4,r5;
    ImageIcon image1,image2,image3,image4,image5;
    JButton b1,b2;
    JProgressBar p;
    int v_id;
    
    
    public Vote(int x)
    {
        v_id=x;
        lh=new JLabel("VOTE");
        lh.setOpaque(true);
        lh.setBounds(550,30,300, 100);
        lh.setFont(new Font("Georgia",Font.BOLD,50));
        lh.setHorizontalAlignment(JLabel.CENTER);
        lh.setBackground(Color.ORANGE);
        lh.setForeground(Color.black);
        
        lw=new JLabel("*SELECT/TICK ANY ONE OPTION FROM THE GIVEN BELOW OPTIONS");
        lw.setBounds(550,120,1000, 100);
        lw.setFont(new Font("Georgia",Font.BOLD,15));
        lw.setHorizontalAlignment(JLabel.CENTER);
        lw.setForeground(Color.RED);
        
        l1=new JLabel("1.");
        l1.setOpaque(true);
        l1.setBounds(230,230,80,60);
        l1.setFont(new Font("Consolas",Font.BOLD,25));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.black);
        
        l2=new JLabel("2.");
        l2.setOpaque(true);
        l2.setBounds(230,330,80,60);
        l2.setFont(new Font("Consolas",Font.BOLD,25));
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(Color.black);
        
        l3=new JLabel("3.");
        l3.setOpaque(true);
        l3.setBounds(230,430,80,60);
        l3.setFont(new Font("Consolas",Font.BOLD,25));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.black);
        
        l4=new JLabel("4.");
        l4.setOpaque(true);
        l4.setBounds(230,530,80,60);
        l4.setFont(new Font("Consolas",Font.BOLD,25));
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(Color.black);
        
        l5=new JLabel("5.");
        l5.setOpaque(true);
        l5.setBounds(230,630,80,60);
        l5.setFont(new Font("Consolas",Font.BOLD,25));
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(Color.black);
        
        l6=new JLabel("BJP");
        l6.setOpaque(true);
        l6.setFont(new Font("Georgia",Font.BOLD,25));
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setBackground(Color.pink);
        l6.setForeground(Color.BLACK);
        l6.setBounds(300,230,200,50);
        
        l7=new JLabel("SHIVSENA");
        l7.setOpaque(true);
        l7.setFont(new Font("Georgia",Font.BOLD,25));
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setBackground(Color.pink);
        l7.setForeground(Color.black);
        l7.setBounds(300,330,200,50);
        
        l8=new JLabel("CONGRESS");
        l8.setOpaque(true);
        l8.setFont(new Font("Georgia",Font.BOLD,25));
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setBackground(Color.pink);
        l8.setForeground(Color.black);
        l8.setBounds(300,430,200,50);
        
        l9=new JLabel("NCP");
        l9.setOpaque(true);
        l9.setFont(new Font("Georgia",Font.BOLD,25));
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setBackground(Color.pink);
        l9.setForeground(Color.black);
        l9.setBounds(300,530,200,50);
        
        l10=new JLabel("NOTA");
        l10.setOpaque(true);
        l10.setFont(new Font("Georgia",Font.BOLD,25));
        l10.setHorizontalAlignment(JLabel.CENTER);
        l10.setBackground(Color.pink);
        l10.setForeground(Color.black);
        l10.setBounds(300,630,200,50);
        
        r1=new JRadioButton();
        r1.setBounds(1100,230,100,50);
        r1.addActionListener(this);
        
        r2=new JRadioButton();
        r2.setBounds(1100,330,100,50);
        r2.addActionListener(this);
        
        r3=new JRadioButton();
        r3.setBounds(1100,430,100,50);
        r3.addActionListener(this);
        
        r4=new JRadioButton();
        r4.setBounds(1100,530,100,50);
        r4.addActionListener(this);
        
        r5=new JRadioButton();
        r5.setBounds(1100,630,100,50);
        r5.addActionListener(this);
       
                
        ButtonGroup g = new ButtonGroup();
        
       g.add(r1);
       g.add(r2);
       g.add(r3);
       g.add(r4);
       g.add(r5);
       
       image1 = new ImageIcon("BJP.jfif");
       setIconImage(image1.getImage());
       l11=new JLabel();
       l11.setIcon(image1);
       l11.setBounds(700,200,200,90);
       l11.setHorizontalAlignment(JLabel.CENTER);
       
       image2 = new ImageIcon("SHIVSENA.jfif");
       setIconImage(image2.getImage());
       l12=new JLabel();
       l12.setIcon(image2);
       l12.setBounds(700,300,200,90);
       l12.setHorizontalAlignment(JLabel.CENTER);
       
       image3 = new ImageIcon("CONGRESS.jfif");
       setIconImage(image3.getImage());
       l13=new JLabel();
       l13.setIcon(image3);
       l13.setBounds(700,400,200,90);
       l13.setHorizontalAlignment(JLabel.CENTER);
       
       image4 = new ImageIcon("NCP.jfif");
       setIconImage(image4.getImage());
       l14=new JLabel();
       l14.setIcon(image4);
       l14.setBounds(700,500,200,90);
       l14.setHorizontalAlignment(JLabel.CENTER);
       
       image5 = new ImageIcon("NOTA.jfif");
       setIconImage(image5.getImage());
       l15=new JLabel();
       l15.setIcon(image5);
       l15.setBounds(700,600,200,90);
       l15.setHorizontalAlignment(JLabel.CENTER);
       
       
       
       b1=new JButton("SUBMIT");
       b1.setBounds(1200,700,200,50);
       b1.setFont(new Font("Georgia",Font.BOLD,25));
       b1.setBackground(Color.green);
       b1.setEnabled(false);
       b1.addActionListener(this);
       
       b2=new JButton("BACK");
       b2.setBounds(20,30,180,50);
       b2.setFont(new Font("Georgia",Font.BOLD,25));
       b2.setBackground(Color.black);
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       b2.setHorizontalAlignment(JButton.CENTER);
       
       p=new JProgressBar(0,100);
       p.setBounds(30,750,900,20);
       p.setStringPainted(true);
       
       p.setForeground(Color.green);
       
      
       
       
       
        
        
        
        
        
        
        
        add(lh);add(r1);
        add(lw);add(r2);
        add(l1);add(r3);
        add(l2);add(r4);
        add(l3);add(r5);
        add(l4);add(l13);
        add(l5);add(l14);
        add(l6);add(l15);
        add(l7);add(b1);
        add(l8);add(b2);
        add(l9);add(p);
        add(l10);
        add(l11);
        add(l12);
        
        setLayout(null);
        setVisible(true);
        setSize(4000, 4000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }

    
    public void actionPerformed(ActionEvent e) 
    { int counter=0;
        if(e.getSource()==r1 || e.getSource()==r2 || e.getSource()==r3 || e.getSource()==r4 || e.getSource()==r5)
        {
          b1.setEnabled(true);
        }
        if(e.getSource()==b2)
        {
           dispose();
           new VoterLogin();
           
        }
        
        String party = "";
		
		if(r1.isSelected()) {
	          
	          party="BJP";
	    }
	    if(r2.isSelected()) {
	          
	          party="SHIVSENA";
	    }
	    if(r3.isSelected()) {
	          
	          party = "CONGRESS";
	    }
	    if(r4.isSelected()) {
	          
	          party = "NCP";
	    }
	    if(r5.isSelected()) {
	          
	          party = "NOTA";
	    }
            
            
            
        if(e.getSource()==b1)
        {
             counter=0;
            
            while(true)
            {
              p.setValue(counter);
              
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            
                counter=counter+10;
                if(counter==110)
                    break;
                
            
            }
            
            try {
			      
			      String url = "jdbc:mysql://localhost:3306/onlinevotingsystem";
			      String uname = "root";
			      String pass = "";
			      String query = "Select * from voters where voter_id = '"+v_id+"'";
			      
			      Connection con = DriverManager.getConnection(url,uname,pass);
		          Statement st = con.createStatement();
		          ResultSet rs = st.executeQuery(query);
		          rs.next();
		          
		          if((rs.getString("voted")).equals("No")) {
		        	  
//		        	  String query1 = "update parties set no_ofvotes=no_ofvotes+1 where p_name = '"+party+"'";
		              String query2 = "update voters set voted = 'Yes',electedparty = '"+party+"' where voter_id = '"+v_id+"'";
		                
		             
		                
		                
//		               st.executeUpdate(query1);
		               st.executeUpdate(query2);
		                 
		               JOptionPane.showMessageDialog(b1, "U have successfully voted");
		               
		          }
		          else {
		        	  
		        	  JOptionPane.showMessageDialog(b1, "U have Alredy voted");
		          }
			      
			      
			      
			      st.close();
			      con.close();
			      
			      
			      
			    }catch (SQLException  sqlException) {
			            
			      sqlException.printStackTrace();
			            
			    }
            
            JOptionPane.showMessageDialog(null, "You have Successfully Voted!!!","Vote",JOptionPane.PLAIN_MESSAGE);
            
            new MainPage();
            dispose();
            
            
           
        }
       
        
         
        
    }
   

}
