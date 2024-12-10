/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;


import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class AddTeacher extends JFrame implements ActionListener  {
    
   Container ct = getContentPane();
    JLabel head1 = new JLabel("New Teacher Details");
    JLabel head2 = new JLabel("Personal Details :");
    JLabel name = new JLabel("Name");
    JLabel fname = new JLabel("Father Name");
    JLabel mname = new JLabel("Mother Name");
    JLabel dob = new JLabel("Date of Birth");
    JLabel address = new JLabel("Address");
    JLabel phone = new JLabel("Mobile");
    JLabel email = new JLabel("Email");
    JTextField tn = new JTextField();
    JTextField tfn = new JTextField();
    JTextField tmn = new JTextField();
    JTextField tdob = new JTextField();
    JTextField taddr = new JTextField();
    JTextField tph = new JTextField();
    JTextField tem = new JTextField();
    
    JLabel head3 = new JLabel("Secondary Education Details : ");
    JLabel school = new JLabel("School");
    JLabel s_gpa = new JLabel("GPA");
    JLabel spassyear = new JLabel("Passing Year");
    JLabel sboard = new JLabel("Board");
    JTextField tsch = new JTextField();
    JTextField ts_gpa = new JTextField();
    JTextField tspassyear = new JTextField();
    JTextField tsboard = new JTextField();
    
    JLabel head4 = new JLabel("Higher Education Details");
    JLabel college = new JLabel("College");
    JLabel c_gpa = new JLabel("GPA");
    JLabel cpassyear= new JLabel("Passing Year");
    JLabel cboard = new JLabel("Board");
    JTextField tcol = new JTextField();
    JTextField tc_gpa = new JTextField();
    JTextField tcpassyear = new JTextField();
    JTextField tcboard = new JTextField();
    
    JLabel head5 = new JLabel("Versity Details :");
    JLabel versity = new JLabel("University");
    JLabel programme = new JLabel("Programme");
    JLabel department= new JLabel("Department");
    JLabel roll = new JLabel("CGPA");
    
    JTextField tversity = new JTextField();
    String course[] = {"Computer Science", "Electronics", "Mechanical", "Civil", "IT","English","Social"};
    String branch[] = {"B.Tech", "BBA","BA", "Bsc", "Msc", "MBA", "MCom", "MA"};
    JComboBox tdepartment = new JComboBox(course);
    JComboBox tprogramme = new JComboBox(branch);
    JTextField troll = new JTextField();
    
    JButton submitButton = new JButton("Submit");
    JButton cancelButton = new JButton("Cancel");
    
    
    
    AddTeacher(){
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setFontForComponents(); // Call the method to set fonts
    }
  
    public void setLayoutManager() {
        setLayout(null);
        setTitle("Teacher Form");
        setSize(760, 620);
        setLocation(250, 40);
        setVisible (true);

    }

    public void setLocationAndSize() {

        //personal details
        head1.setBounds(280, 0, 600, 50);
        head2.setBounds(50, 40, 150, 30);
        name.setBounds(50, 70, 100, 30);
        fname.setBounds(430, 70, 200, 30);
        mname.setBounds(50, 100, 200, 30);
        dob.setBounds(430, 100, 200, 30);
        phone.setBounds(50, 130, 200, 30);
        email.setBounds(430, 130, 200, 30);
        address.setBounds(50, 160, 200, 30);
        
        tn.setBounds(160, 70, 150, 30);
        tfn.setBounds(550, 70, 150, 30);
        tmn.setBounds(160, 100, 150, 30);
        tdob.setBounds(550, 100, 150, 30);
        tph.setBounds(160, 130, 150, 30);
        tem.setBounds(550, 130, 150, 30);
        taddr.setBounds(160, 160, 540, 30);
        
        //secondary details
        head3.setBounds(50, 200, 250, 30);
        school.setBounds(50, 230, 150, 30);
        s_gpa.setBounds(50, 260, 100, 30);
        spassyear.setBounds(300, 260, 400, 30);
        sboard.setBounds(550, 260, 200, 30);
    
        tsch.setBounds(160, 230, 540, 30);
        ts_gpa.setBounds(160, 260, 100, 30);
        tspassyear.setBounds(390, 260, 120, 30);
        tsboard.setBounds(600, 260, 100, 30);

        
       //Higer
        head4.setBounds(50, 300, 250, 30);
        college.setBounds(50, 330, 150, 30);
        c_gpa.setBounds(50, 360, 100, 30);
        cpassyear.setBounds(300, 360, 400, 30);
        cboard.setBounds(550, 360, 200, 30);
    
        tcol.setBounds(160, 330, 540, 30);
        tc_gpa.setBounds(160, 360, 100, 30);
        tcpassyear.setBounds(390, 360, 120, 30);
        tcboard.setBounds(600, 360, 100, 30);
        
        //versity
        head5.setBounds(50, 400, 250, 30);
        versity.setBounds(50, 430, 150, 30);
        programme.setBounds(50, 460, 100, 30);
        department.setBounds(300, 460, 400, 30);
        roll.setBounds(550, 460, 200, 30);
        
        tversity.setBounds(160, 430, 540, 30);
        tprogramme.setBounds(160, 460, 100, 30);
        tdepartment.setBounds(390, 460, 120, 30);
        troll.setBounds(600, 460, 100, 30);

        
        //button
        submitButton.setBounds(230, 530, 120, 30);
        cancelButton.setBounds(430, 530, 120, 30);


    }

    public void addComponentsToContainer() {
        //personal
        ct.add(head1);
        ct.add(head2);
        ct.add(name);
        ct.add(fname);
        ct.add(mname);
        ct.add(dob);
        ct.add(phone);
        ct.add(email);
        ct.add(address);
        
        ct.add(tn);
        ct.add(tfn);
        ct.add(tmn);
        ct.add(tdob);
        ct.add(tph);
        ct.add(tem);
        ct.add(taddr);
        
        //secondary
        ct.add(head3);
        ct.add(school);
        ct.add(s_gpa);
        ct.add(spassyear);
        ct.add(sboard);
        
        ct.add(tsch);
        ct.add(ts_gpa);
        ct.add(tspassyear);
        ct.add(tsboard);
        
        //higher
        ct.add(head4);
        ct.add(college);
        ct.add(c_gpa);
        ct.add(cpassyear);
        ct.add(cboard);
        
        ct.add(tcol);
        ct.add(tc_gpa);
        ct.add(tcpassyear);
        ct.add(tcboard);
        
        //versity
        ct.add(head5);
        ct.add(versity);
        ct.add(programme);
        ct.add(department);
        ct.add(roll);
        
        ct.add(tversity);
        ct.add(tprogramme);
        ct.add(tdepartment);
        ct.add(troll);
               
        //button        
        ct.add(submitButton);
        ct.add(cancelButton);
              
    }
    
     public void setFontForComponents() {
           // Set font for labels
        head1.setFont(new Font("serif", Font.BOLD, 20));
     }

    public void addActionEvent() {
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);    
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == submitButton) {
            String name = tn.getText();
            String fname = tfn.getText();
            String tname = tmn.getText();
            String dob =  tdob.getText();
            String address = taddr.getText();
            String phone = tph.getText();
            String email = tem.getText();
           JOptionPane.showMessageDialog(null,"Teacher Details Added Successfully\n\n added details:\n"+ "- Name: " + name+ "\n- mobile: " + phone+ "\n-Address: " + address); 
            //JOptionPane.showMessageDialog("+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"');
            
            }

        
        else if (e.getSource()== cancelButton){
                setVisible(false);
            }
   }
    
    
        public static void main(String[] a) {
        
          new AddTeacher();

    }
}
