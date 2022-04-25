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
import javax.swing.text.Document;


public class newpatientpage extends Frame implements ActionListener{
Frame f;
Checkbox c1,c2;
Button b1,b2,b3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
TextField t1,t2,t3,t4,t5,t6,t7,t8;
CheckboxGroup g;
Choice x1,x2;
Connection c;
    Statement s;
    ResultSet r1;
String s1;
Document z;
public newpatientpage(){
 f=new Frame("Patient Details");
  f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
	g=new CheckboxGroup();

        
        l11=new Label("patient id:");
        l11.setBounds(50, 100, 100, 50);
        f.add(l11);
        t8=new TextField("");
        t8.setBounds(150,100,150,50);
        f.add(t8);
                
        l1=new Label("First Name:");
        l1.setBounds(320, 100, 100, 50);
        f.add(l1);
        t1=new TextField("");
        t1.setBounds(430,100,150,50);
        f.add(t1);

        l2=new Label("Last Name:");
        l2.setBounds(50, 150, 100, 50);
        f.add(l2);
        t2=new TextField("");
        t2.setBounds(150,150,150,50);
        f.add(t2);

        l3=new Label("Marital Status:");
        l3.setBounds(50, 200, 100, 50);
        f.add(l3);
        x1=new Choice();
        x1.setBounds(150,200,150,50);
        x1.add("Married");
        x1.add("Single");
        f.add(x1);

        l4=new Label("Sex:");
        l4.setBounds(50, 250, 100, 50);
        f.add(l4);
        c1=new Checkbox("Male",g,true);
        c1.setBounds(150,250,150,50);
        f.add(c1);
 	c2=new Checkbox("Female",g,false);
        c2.setBounds(360,250,150,50);
        f.add(c2);

        l5=new Label("Date of Birth:");
        l5.setBounds(50, 300, 100, 50);
        f.add(l5);
        t3=new TextField("");
        t3.setBounds(150,300,150,50);
        f.add(t3);

        l6=new Label("Blood group:");
        l6.setBounds(50, 350, 100, 50);
        f.add(l6);
        x2=new Choice();
        x2.setBounds(150,350,150,50);
        x2.add("A+");
        x2.add("A-");
        x2.add("B+");
        x2.add("B-");
        x2.add("o+");
        x2.add("o-");
        x2.add("AB+");
        x2.add("AB-");
        
        f.add(x2);

        l7=new Label("Address:");
        l7.setBounds(50, 400, 100, 50);
        f.add(l7);
        t4=new TextField("");
        t4.setBounds(150,400,150,50);
        f.add(t4);

	l8=new Label("Phone Number:");
	l8.setBounds(50, 450, 100, 50);
        f.add(l8);
        t5=new TextField("");
        t5.setBounds(150,450,150,50);
        f.add(t5);
       
        l9=new Label("Visit date:");
        l9.setBounds(50, 500, 100, 50);
        f.add(l9);
        t6=new TextField("");
        t6.setBounds(150,500,150,50);
        
        l10=new Label("Treatment for:");
        l10.setBounds(50, 550, 100, 50);
        f.add(l10);
        t7=new TextField("");
        t7.setBounds(150,550,150,50);
             f.add(l9);
             f.add(t6);
             f.add(l10);
             f.add(t7); 

        b1=new Button("Submit");
        b1.setBounds(50, 600, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2=new Button("Clear");
        b2.setBounds(160, 600, 80, 30);
        f.add(b2);
        b2.addActionListener(this);
        b3=new Button("Back");
        b3.setBounds(260, 600, 80, 30);
        f.add(b3);
        b3.addActionListener(this);
        
        
        
        
        
        
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
String a,b,c,d,f,g,h,i,j,k;
try{
        
        if(e.getSource()==b1)
        {
           a=t1.getText();
            b=t2.getText();          
            c=t3.getText();
            d=t4.getText();
            f=t5.getText();
            i=t6.getText();
            j=t7.getText(); 
            g=x1.getItem(x1.getSelectedIndex());
            h=x2.getItem(x2.getSelectedIndex());
            k=t7.getText(); 
           
            s.executeUpdate("insert into patientdetails(pid,visited_date,first_name,last_name,marital_status,dob,blood_group,address,phone_no,treatment_for)values('"+k+"','"+i+"','"+a+"','"+b+"','"+g+"','"+c+"','"+h+"','"+d+"','"+f+"','"+j+"')");
           
        }
           
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");         
            t4.setText("");
            t5.setText("");
            
            
            System.out.print("Entered Button 2");
        }
        else if(e.getSource()==b3)
        {
            System.out.print("Entered Button 3");
            Patient obj19=new Patient();
            
        }
    }
        catch(Exception ex)
        {
            
        }


}
}