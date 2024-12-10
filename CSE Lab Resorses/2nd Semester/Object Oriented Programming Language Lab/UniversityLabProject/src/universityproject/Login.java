/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener{

    JButton login, reset;
    JTextField tfusername;
    JPasswordField tfpassword ;
    JCheckBox showPassword;
    
     // Static username and password
    static String USERNAME = "admin";
    static final String PASSWORD = "admin123";
    
    
    Login () {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);
        
        
        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(150, 100, 150, 20);
        showPassword.addActionListener(this);
        add(showPassword);
        
        login = new JButton("Login");
        login.setBounds(40, 150, 120, 30);
       // login.setBackground(Color.BLACK);
        //login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        reset = new JButton("Reset");
        reset.setBounds(180, 150, 120, 30);
        //cancel.setBackground(Color.BLACK);
        //cancel.setForeground(Color.WHITE);
        reset.addActionListener(this);
        reset.setFont(new Font("serif", Font.BOLD, 15));
        add(reset);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 220);
        add(image);
        
        setSize(600, 300);
        setLocation(350, 200);
        setVisible(true);
        
    
   
//        try{
//              FileReader user = new FileReader("txtSignUp.txt");
//              Scanner userInfo = new Scanner(user);
//              userInfo.useDelimiter("[,\n]");
//              while(userInfo.hasNext()){
//                  String uname = userInfo.next();
//                  String upass = userInfo.next();
//                  String username;
//                  String password;
//                  
//                  if(username.equals(uname.trim())&&password.equals(upass.trim())){
//                      JOptionPane.showMessageDialog(this, "Login Successful");
//                      setVisible(false);
//             
//                      new Project(); 
//                  }
//                  else {
//                         JOptionPane.showMessageDialog(null,"Invalid username or password","Warning",0);
//                    }
//              }
//          }catch(Exception x){
//              
//          }

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            

//                    try{
//              FileReader user = new FileReader("txtSignUp.txt");
//              Scanner userInfo = new Scanner(user);
//              userInfo.useDelimiter("[,\n]");
//              while(userInfo.hasNext()){
//                  String uname = userInfo.next();
//                  String upass = userInfo.next();
//                 
//                  
//                  if(username.equals(uname.trim())&&password.equals(upass.trim())){
//                      JOptionPane.showMessageDialog(this, "Login Successful");
//                      setVisible(false);
//             
//                      new Project(); 
//                  }
//                  else {
//                         JOptionPane.showMessageDialog(null,"Invalid username or password","Warning",0);
//                    }
//              }
//          }catch(Exception x){
//              
//          }

          // Check static credentials

            if (username.equalsIgnoreCase(USERNAME) && password.equalsIgnoreCase(PASSWORD)) {
               JOptionPane.showMessageDialog(this, "Login Successful");
                setVisible(false);
             
                new Project(); // Open your next screen/project here
              
                
            }  else {
                JOptionPane.showMessageDialog(null, "Invalid username or password","Warning",0);
            }
      }
        //Coding Part of RESET button
        else if (e.getSource() == reset) {
            tfusername.setText("");
            tfpassword.setText("");
        }
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                tfpassword.setEchoChar((char) 0);
            } else {
                tfpassword.setEchoChar('*');
            }
    }
    }
    

    public static void main(String[] args) {
        new Login();
    }
}
