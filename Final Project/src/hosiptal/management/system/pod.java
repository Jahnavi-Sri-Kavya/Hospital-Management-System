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

public class pod extends Frame implements ActionListener
{

   Frame f;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Connection c;
    Statement s;
    ResultSet r1;
    String s1;
    Button b;
    pod(String did){
        f=new Frame("Patient details");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
        l4=new Label("Doctor Id:");
        l4.setBounds(50, 100, 100, 50);
        f.add(l4);
        t4=new TextField(did);
        t4.setBounds(150,100,150,50);
        f.add(t4);
        
        b=new Button("View");
        b.setBounds(50, 200, 100, 50);
        f.add(b);
        b.addActionListener(this);
        
        l1=new Label("Patient ID:");
        l1.setBounds(50, 300, 100, 50);
        f.add(l1); 
        t1=new TextField("");
        t1.setBounds(150, 300, 150, 50);
        f.add(t1);
        t1.setEditable(false);
        
        l2=new Label("Date:");
        l2.setBounds(320, 300, 100, 50);
        f.add(l2); 
        t2=new TextField("");
        t2.setBounds(430, 300, 150, 50);
        f.add(t2);
        t2.setEditable(false);
        
        l3=new Label("Disease: ");
        l3.setBounds(650, 300, 100, 50);
        f.add(l3); 
        t3=new TextField("");
        t3.setBounds(750, 300, 150, 50);
        f.add(t3);
        t3.setEditable(false);
        try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
        String path="C:\\Apps\\op.accdb";
        String url="jdbc:ucanaccess://"+path;
        c=DriverManager.getConnection(url);
        s=c.createStatement();
        System.out.println("Connected");
        }
        catch(Exception Ex){
        }
}
     public void actionPerformed(ActionEvent e)
{
    try{
        String dno=t4.getText();
        if (e.getSource()==b)
        {
                    String pid;
                    String op_date;
                    String Disease;    
                    String did;
                   
       
                    s1="select * from op";
                    r1=s.executeQuery(s1);
                    
                    
                   while(r1.next())
                   {
                            did=r1.getString(3);
                            if (did.equals(dno)){
                            pid=r1.getString(2);
                            op_date=r1.getString(4);
                            Disease=r1.getString(5);
                           
                            t1.setText(pid);
                            t2.setText(op_date);
                            t3.setText(Disease);
                            
                            
                   } 
                    }
        }
   
    }
    
    
    
    catch (Exception ex){
    
    }
}
}
