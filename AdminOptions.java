
package onlinevotingsystem;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AdminOptions
{
    public static void main(String[] args) 
    {
      Options op = new Options();  
    }
}

class Options extends JFrame implements ActionListener
{
    JLabel l,l1,l2,l3;
    JButton b1,b2,b3,b4;
    
    public Options()
    {
        l=new JLabel("ADMIN ACCESS");
        l.setOpaque(true);
        l.setBounds(550,30,500, 100);
        l.setFont(new Font("Georgia",Font.BOLD,50));
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBackground(Color.ORANGE);
        l.setForeground(Color.black);
        
        l1=new JLabel("1.");
        l1.setOpaque(true);
        l1.setBounds(320,300,80,60);
        l1.setFont(new Font("Georgia",Font.BOLD,50));
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.black);
        
        l2=new JLabel("2.");
        l2.setOpaque(true);
        l2.setBounds(320,400,80,60);
        l2.setFont(new Font("Georgia",Font.BOLD,50));
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(Color.black);
        
        
        l3=new JLabel("3.");
        l3.setOpaque(true);
        l3.setBounds(320,500,80,60);
        l3.setFont(new Font("Georgia",Font.BOLD,50));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.black);
        
        b1=new JButton("UPDATE VOTERS LIST");
        b1.setBounds(420,300,600,60);
        b1.setFont(new Font("Georgia",Font.BOLD,30));
        b1.setBackground(Color.cyan);
        b1.setForeground(Color.BLACK);
        
        b2=new JButton("UPDATE CANDIDATE LIST");
        b2.setBounds(420,400,600,60);
        b2.setFont(new Font("Georgia",Font.BOLD,30));
        b2.setBackground(Color.cyan);
        b2.setForeground(Color.BLACK);
        
        b3=new JButton("VIEW RESULTS");
        b3.setBounds(420,500,600,60);
        b3.setFont(new Font("Georgia",Font.BOLD,30));
        b3.setBackground(Color.cyan);
        b3.setForeground(Color.BLACK);
        
        b4=new JButton("BACK");
        b4.setBounds(20,30,180,50);
        b4.setFont(new Font("Georgia",Font.BOLD,25));
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        b4.setHorizontalAlignment(JButton.CENTER);
        
        
        
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    
    
        setLayout(null);
        setVisible(true);
        setSize(5000,5000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            dispose();
         new UpdateList();
         
        }
        if(e.getSource()==b2)
        {
            dispose();
         new CandUpt();
         
        }
        if(e.getSource()==b3)
        {
            dispose();
            try {
                new ViewResult();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Options.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }
        if(e.getSource()==b4)
        {
          dispose();
          new Admin();
        }
      
    }


}
