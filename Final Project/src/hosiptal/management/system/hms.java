/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosiptal.management.system;

/**
 *
 * @author B JAHNAVI
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class hms extends Frame implements ActionListener{
    
Frame f;
Button b1,b2;
     
public hms(){
 f=new Frame("Neva Hospital Management Software");
  f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
	
        b1=new Button("Employee");
        b1.setBounds(50, 100, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2=new Button("Doctor");
        b2.setBounds(160, 100, 80, 30);
        f.add(b2);
        b2.addActionListener(this);
    
}
public void actionPerformed(ActionEvent e) 
    {

        if(e.getSource()==b1)
        {
             emplogin obj17=new emplogin();
    
        }
        
    if(e.getSource()==b2)
        {
             doclogin obj11=new doclogin();
    
        }
    }
    
    public static void main(String[] args) {
    
    
    hms obj=new hms();
    
    }
}
