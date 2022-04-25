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

public class Patient extends Frame implements ActionListener{
Frame f;
Button b1,b2;
Connection c;
    Statement s;
    ResultSet r1;
String s1;
public Patient(){
 f=new Frame("Patient Details");
  f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
	
        b1=new Button("Old");
        b1.setBounds(50, 100, 80, 30);
        f.add(b1);
        b1.addActionListener(this);
        b2=new Button("New");
        b2.setBounds(50, 200, 80, 30);
        f.add(b2);
        b2.addActionListener(this);
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
if (e.getSource()==b1){
oldpatientpage obj2=new oldpatientpage();
}
if (e.getSource()==b2){
newpatientpage obj3=new newpatientpage();
}

}
}