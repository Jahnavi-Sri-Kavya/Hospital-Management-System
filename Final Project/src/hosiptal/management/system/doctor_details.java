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

public class doctor_details extends Frame implements ActionListener{
Frame f;
Checkbox c1,c2;
Button b1,b2,b3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
CheckboxGroup g;
Choice x1;
Connection c;
    Statement s;
    ResultSet r1;
String s1;
public doctor_details(){
 f=new Frame("Doctor Details");
  f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
	g=new CheckboxGroup();

        l1=new Label("Doctor Id:");
        l1.setBounds(50, 100, 100, 50);
        f.add(l1);
        t1=new TextField("");
        t1.setBounds(150,100,150,50);
        f.add(t1);

        l2=new Label("First Name:");
        l2.setBounds(50, 150, 100, 50);
        f.add(l2);
        t2=new TextField("");
        t2.setBounds(150,150,150,50);
        f.add(t2);

        l3=new Label("Last Name:");
        l3.setBounds(50, 200, 100, 50);
        f.add(l3);
        t3=new TextField("");
        t3.setBounds(150,200,150,50);
        f.add(t3);

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
        t4=new TextField("");
        t4.setBounds(150,300,150,50);
        f.add(t4);
        
        l6=new Label("Marital Status:");
        l6.setBounds(50, 350, 100, 50);
        f.add(l6);
        x1=new Choice();
        x1.setBounds(150,350,150,50);
        x1.add("Married");
        x1.add("Single");
        f.add(x1);        

        l7=new Label("Email ID:");
        l7.setBounds(50, 400, 100, 50);
        f.add(l7);
        t5=new TextField("");
        t5.setBounds(150,400,150,50);
        f.add(t5);

        l8=new Label("Phone Number:");
        l8.setBounds(50, 450, 100, 50);
        f.add(l8);
        t6=new TextField("");
        t6.setBounds(150,450,150,50);
        f.add(t6);

	l9=new Label("Address:");
	l9.setBounds(50, 500, 100, 50);
        f.add(l9);
        t7=new TextField("");
        t7.setBounds(150,500,150,50);
        f.add(t7);
 
        l14=new Label("Educational Details:");
        l14.setBounds(50, 600, 250, 50);
        f.add(l14);
        l14.setForeground(Color.BLUE);
        
         l10=new Label("UG(University):");
        l10.setBounds(50, 650, 100, 50);
        f.add(l10);
        t8=new TextField("");
        t8.setBounds(150,650,150,50);
        f.add(t8);
        
        l11=new Label("PG(University):");
        l11.setBounds(50, 700, 100, 50);
        f.add(l11);
        t9=new TextField("");
        t9.setBounds(150,700,150,50);
        f.add(t9);
        
        l12=new Label("Qualifications:");
        l12.setBounds(50, 750, 100, 50);
        f.add(l12);
        t10=new TextField("");
        t10.setBounds(150,750,150,50);
        f.add(t10);
        
        l13=new Label("Department:");
        l13.setBounds(50, 800, 100, 50);
        f.add(l13);
        t11=new TextField("");
        t11.setBounds(150,800,150,50);
        f.add(t11);
    
        l15=new Label("Set Password");
        l15.setBounds(50, 850, 150, 50);
        f.add(l15);
        t12=new TextField("");
        t12.setBounds(150,850,150,50);
        f.add(t12);
        t12.setEchoChar('*');
        
        
        
        b1=new Button("Submit");
        b1.setBounds(50, 900, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2=new Button("Clear");
        b2.setBounds(160, 900, 80, 30);
        f.add(b2);
        b2.addActionListener(this);
        b3=new Button("Exit");
        b3.setBounds(260, 900, 80, 30);
        f.add(b3);
        b3.addActionListener(this);
try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
        String path="C:\\Apps\\Doctordb.accdb";
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
String a,b,c,d,f,g,h,i,j,k,l,m,n,o,p;
try{
        if (e.getSource()==b1){ 
           a=t1.getText();
           b=t2.getText();
           c=t3.getText();
           d=t4.getText();
           f=t5.getText();
           g=t6.getText();
           h=t7.getText();
           i=t8.getText();
           j=t9.getText();
           k=t10.getText();
           l=t11.getText();
           m=x1.getItem(x1.getSelectedIndex());
         
           s.executeUpdate("insert into Doctordetails(did,first_name,last_name,dob,marital_status,email,phone_no,address,UG,PG,qualifications,department)values('"+a+"','"+b+"','"+c+"','"+d+"','"+m+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')");
           
        }
        
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");         
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            
            System.out.print("Entered Button 2");
        }
        else if(e.getSource()==b3)
        {
            System.out.print("Entered Button 3");
            System.exit(0);
            
        }
    }
        catch(Exception ex)
        {
            
        }


}
}