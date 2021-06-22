
package onlinevotingsystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class OnlineVotingSystem 
{

    
    public static void main(String[] args)
    {
     MainPage mp=new MainPage();
    }
    
}

class MainPage extends JFrame implements ActionListener
{
    JLabel l,l1;
    JButton b1,b2;
    public MainPage()
    {
        l=new JLabel();
        l1=new JLabel("ONLINE VOTING SYSTEM");
        
        b1=new JButton("VOTER LOGIN");
        b1.setBounds(300, 600, 300, 80);
        b1.setFont(new Font("Calibri",Font.BOLD,30));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.YELLOW);
        
        b2=new JButton("ADMIN LOGIN");
        b2.setBounds(800, 600, 300, 80);
        b2.setFont(new Font("Calibri",Font.BOLD ,30));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.YELLOW); 
         
        l1.setBounds(400, 300, 700, 100);
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        l1.setFont(new Font("Consolas",Font.BOLD,50));
        l1.setOpaque(true);
        l1.setBackground(Color.pink);
        
       
       
        l.setBounds(550,0,600, 300);
        ImageIcon image =new ImageIcon("voting system.jfif");
       setIconImage(image.getImage());
        l.setIcon(image);
        
        add(l);
        add(l1);
        add(b1);
        b1.addActionListener(this);
        add(b2);
        b2.addActionListener(this);
        
        
        
        setLayout(null);
        setVisible(true);
        setSize(5000, 5000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            dispose();
         new Voter();
        }
        if(e.getSource()==b2)
        {
            dispose();
            new Admin();
         
        }
      
    }
    
}
 
