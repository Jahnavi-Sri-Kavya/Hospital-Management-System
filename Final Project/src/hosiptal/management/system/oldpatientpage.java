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

public class oldpatientpage extends Frame implements ActionListener{
Frame f;
Button b1,b2,b3,b4,b5,b6,b7;
Label l1,l2,l3,l4,l5,l6,l7;
TextField t1,t2,t3,t4,t5,t6,t7;
Connection c;
    Statement s;
    ResultSet r1;
String s1;
public oldpatientpage(){
 f=new Frame("Patient details");
  f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
       
	l1=new Label("Patient ID:");
        l1.setBounds(50, 100, 100, 50);
        f.add(l1);
        t1=new TextField("");
        t1.setBounds(150,100,150,50);
        f.add(t1);
       
        b1=new Button("Submit");
        b1.setBounds(50, 300, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2=new Button("Clear");
        b2.setBounds(160, 300, 80, 30);
        f.add(b2);
        b2.addActionListener(this);
        b3=new Button("Back");
        b3.setBounds(260, 300, 80, 30);
        f.add(b3);
        b3.addActionListener(this);
        
        
        l2=new Label("Name");
        l2.setBounds(50, 400, 100, 50);
        f.add(l2); 
        t2=new TextField("");
        t2.setBounds(150, 400, 150, 50);
        f.add(t2);
        t2.setEditable(false);
        
        l3=new Label("Visit date:");
        l3.setBounds(320, 400, 100, 50);
        f.add(l3); 
        t3=new TextField("");
        t3.setBounds(430, 400, 150, 50);
        f.add(t3);
        t3.setEditable(false);
        
        l4=new Label("Treatment for: ");
        l4.setBounds(50, 500, 100, 50);
        f.add(l4); 
        t4=new TextField("");
        t4.setBounds(150, 500, 150, 50);
        f.add(t4);
        t4.setEditable(false);
        
        l5=new Label("Treated by: ");
        l5.setBounds(320, 500, 100, 50);
        f.add(l5); 
        t5=new TextField("");
        t5.setBounds(430, 500, 150, 50);
        f.add(t5);
        t5.setEditable(false);
        
        l6=new Label("Medicines taken: ");
        l6.setBounds(50, 600, 100, 50);
        f.add(l6); 
        t6=new TextField("");
        t6.setBounds(150, 600, 150, 50);
        t6.setEditable(false);
        f.add(t6);
        
        l7=new Label("Medical Reports: ");
        l7.setBounds(320, 600, 100, 50);
        f.add(l7); 
        t7=new TextField("");
        t7.setBounds(430, 600, 430, 50);
        f.add(t7);
        t7.setEditable(false);
        
        
        b4=new Button("Op?");
        b4.setBounds(20, 700, 120, 50);
        f.add(b4);
        b4.addActionListener(this);
        
        b7=new Button("Exit");
        b7.setBounds(170, 700, 120, 50);
        f.add(b7);
        b7.addActionListener(this);
        
        
        
try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
        String path="C:\\Apps\\patientdb.accdb";
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
            String id=t1.getText();
            String first_name;
            String visited_date;
            String treatment_for;                    
            String treated_by,med_taken,med_report;
            String pid;
        if(e.getSource()==b1)
        {
            
           
            s1="select * from patientdetails";
            r1=s.executeQuery(s1);
            while(r1.next())
            {
                pid=r1.getString(15);
                
                if(pid.equals(id))
                {
                    System.out.println("Success");
                      visited_date=r1.getString(14);
                            first_name=r1.getString(2);
                            treatment_for=r1.getString(10);
                            treated_by=r1.getString(11);
                            med_taken=r1.getString(12);
                            med_report=r1.getString(13);
                            
                            t2.setText(first_name);
                            t3.setText(visited_date);
                            t4.setText(treatment_for);
                            t5.setText(treated_by);
                            t6.setText(med_taken);
                            t7.setText(med_report);                                                                                            
                                                                          
                }
                else{
                    
                    System.out.println("Not Success");
                }
                
            }
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            System.out.print("Entered Button 2");
        }
        else if(e.getSource()==b3)
        {
            System.out.print("Entered Button 3");
            Patient obj5=new Patient();
            
        }
        
        else if(e.getSource()==b4)
                {   
                    System.out.println("Appointment");
                    op obj15=new op(id);
                    
                }   
                    
                
               
                else if(e.getSource()==b7)
                {
                   
                    System.exit(0);
                    
                }   
              
 }
        catch(Exception ex)
        {
            
        }
  }
}