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

public class Patientdetailsview extends Frame implements ActionListener
{

   Frame f;
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b1,b2,b3,b4;
    Connection c;
    Statement s;
    ResultSet r1;
    String s1;
    String pid;
    Patientdetailsview(String id)
    {
        pid=id;
        try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
        String path="C:\\Apps\\patientdb.accdb";
        String url="jdbc:ucanaccess://"+path;
        c=DriverManager.getConnection(url);
        s=c.createStatement();
        System.out.println("Connected");
        
        f=new Frame("Patient details");
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        
        l1=new Label("Patient ID");
        l1.setBounds(50, 100, 100, 50);
        f.add(l1);        
        t1=new TextField(pid);
        t1.setBounds(150, 100, 150, 50);
        f.add(t1);
        
        l2=new Label("Name");
        l2.setBounds(320, 100, 100, 50);
        f.add(l2); 
        t2=new TextField("");
        t2.setBounds(430, 100, 150, 50);
        f.add(t2);
        t2.setEditable(false);
        
        l3=new Label("Visit date:");
        l3.setBounds(50, 200, 100, 50);
        f.add(l3); 
        t3=new TextField("");
        t3.setBounds(150, 200, 150, 50);
        f.add(t3);
        t3.setEditable(false);
        
        l4=new Label("Treatment for: ");
        l4.setBounds(320, 200, 100, 50);
        f.add(l4); 
        t4=new TextField("");
        t4.setBounds(430, 200, 150, 50);
        f.add(t4);
        t4.setEditable(false);
        
        l5=new Label("Treated by: ");
        l5.setBounds(50, 300, 100, 50);
        f.add(l5); 
        t5=new TextField("");
        t5.setBounds(150, 300, 150, 50);
        f.add(t5);
        t5.setEditable(false);
        
        l6=new Label("Medicines taken: ");
        l6.setBounds(320, 300, 100, 50);
        f.add(l6); 
        t6=new TextField("");
        t6.setBounds(430, 300, 150, 50);
        t6.setEditable(false);
        f.add(t6);
        
        l7=new Label("Medical Reports: ");
        l7.setBounds(50, 400, 100, 50);
        f.add(l7); 
        t7=new TextField("");
        t7.setBounds(150, 400, 430, 50);
        f.add(t7);
        t7.setEditable(false);
        
        b1=new Button("op?");
        b1.setBounds(20, 500, 120, 50);
        f.add(b1);
        b1.addActionListener(this);
        
        b2=new Button("Exit");
        b2.setBounds(320, 500, 120, 50);
        f.add(b2);
        b2.addActionListener(this);
        
        
        }
        catch(Exception ex)
        {
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        String a=t1.getText();
       try
        {
               
                    
                    String first_name;
                    String visited_date;
                    String treatment_for;                    
                    String treated_by,med_taken,med_report;
                    s1="select * from patientdetails where pid="+a+"";
                    r1=s.executeQuery(s1);
                   while(r1.next())
                   {
                           
                            visited_date=r1.getString(3);
                            first_name=r1.getString(4);
                            treatment_for=r1.getString(12);
                            treated_by=r1.getString(13);
                            med_taken=r1.getString(14);
                            med_report=r1.getString(15);
                            
                            t2.setText(first_name);
                            t3.setText(visited_date);
                            t4.setText(treatment_for);
                            t5.setText(treated_by);
                            t6.setText(med_taken);
                            t7.setText(med_report);
                            
                   }    
                    
                  if(e.getSource()==b1)
                {   
                  
                    
                }   
                    
                
               
                else if(e.getSource()==b2)
                {
                   
                    System.exit(0);
                    
                }
                
        }
        catch(Exception ex)
        {
            
        }
    }
    
}
