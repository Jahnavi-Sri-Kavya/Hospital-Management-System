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

public class op extends Frame implements ActionListener
{

   Frame f;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1,b2;
    Connection c;
    Statement s;
    ResultSet r1;
    String s1;
    
    op(String ID){
        f=new Frame("OP details");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
        l1=new Label("Patient Id:");
        l1.setBounds(50, 100, 100, 50);
        f.add(l1);        
        t1=new TextField(ID);
        t1.setBounds(150, 100, 150, 50);
        f.add(t1);
        
        l1=new Label("Doctor Id:");
        l1.setBounds(50, 200, 100, 50);
        f.add(l1);        
        t2=new TextField("");
        t2.setBounds(150, 200, 150, 50);
        f.add(t2);
        
        l3=new Label("Date:");
        l3.setBounds(50, 300, 100, 50);
        f.add(l3);        
        t3=new TextField("");
        t3.setBounds(150, 300, 150, 50);
        f.add(t3);
        
        
        l4=new Label("Disease:");
        l4.setBounds(50, 400, 100, 50);
        f.add(l4);        
        t4=new TextField("");
        t4.setBounds(150, 400, 150, 50);
        f.add(t4);
        
        b1=new Button("Add");
        b1.setBounds(50, 500, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
        String path="C:\\Apps\\op.accdb";
        String url="jdbc:ucanaccess://"+path;
        c=DriverManager.getConnection(url);
        s=c.createStatement();
        System.out.println("Connected");
        }
        catch(Exception ex)
        {
            
        }
    }
    public void actionPerformed(ActionEvent e)
{
    try{
         String a,b,c,d;   
    if (e.getSource()==b1)
    {
        a=t1.getText();
        b=t2.getText(); 
        c=t3.getText();
        d=t4.getText();
          s.executeUpdate("insert into op(pid,did,op_date,Disease) values ('"+a+"','"+b+"','"+c+"','"+d+"')");
    }
    }
    catch(Exception ex)
        {
            
        }
}
    
}
