/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {

    About() {
        setSize(900, 550);
        setLocation(200, 70);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/jubu.jpg"));
        Image i2 = i1.getImage().getScaledInstance(202, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(650, 110, 202, 250);
        add(image);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/fayza1.jpg"));
        Image i5 = i4.getImage().getScaledInstance(188, 250, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        image = new JLabel(i6);
        image.setBounds(450, 110, 188, 250);
        add(image);
        
        JLabel heading = new JLabel("University Management System");
        heading.setBounds(170, 5, 600, 90);
        heading.setFont(new Font("Serif", Font.BOLD, 40));
        add(heading);
        
        JLabel name = new JLabel("Developed By:");
        name.setBounds(50, 170, 550, 40);
        name.setFont(new Font("Serif", Font.BOLD, 30));
        add(name);
        
        JLabel jubu = new JLabel(" Jubair Ahammed Jubu");
        jubu.setBounds(40, 220, 550, 40);
        jubu.setFont(new Font("Serif", Font.PLAIN, 30));
        add(jubu);
        
        JLabel fayza = new JLabel(" Mahfuza Akter Fayza");
        fayza.setBounds(40, 270, 550, 40);
        fayza.setFont(new Font("Serif", Font.PLAIN, 30));
        add(fayza);
        
        JLabel thanks = new JLabel("Thank You Very Much");
        thanks.setBounds(180, 375, 650, 100);
        thanks.setFont(new Font("Serif", Font.BOLD, 50));
        add(thanks);
        
//        JLabel rollno = new JLabel("Roll number: 1533146");
//        rollno.setBounds(70, 280, 550, 40);
//        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
//        add(rollno);
//        
//        JLabel contact = new JLabel("Contact: codeforinterview03@gmail.com");
//        contact.setBounds(70, 340, 550, 40);
//        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
