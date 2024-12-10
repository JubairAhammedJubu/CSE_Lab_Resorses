/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TeacherDetails extends JFrame {
    
        // Column names for the table
    String[] columnNames = {
        "Name", "Father's Name", "Mother's Name", "Date of Birth", "Mobile", 
        "Email", "Address", "School", "GPA", "Passing Year", "Board", 
        "College","GPA", "Passing Year", "Board","University", "Programme", "Department", "ID"
    };
    
    // Data for the table
    String[][] studentData = {
        {"John Doe", "Michael Doe", "Mary Doe", "2004-05-14", "1234567890", "john@example.com", 
         "123 Street, City", "ABC High School","3.5","2022", "ABC Board", "ABC College","4.80", "2024", "ABC Board",
         "ABC Versity","Computer Science", "Engineering", "CS123"},
        
        {"Jane Smith", "David Smith", "Laura Smith", "2005-06-20", "0987654321", "jane@example.com", 
         "456 Avenue, Town", "XYZ High School","4.75", "2001", "XYZ Board", "XYZ College","4.75", "2003", "XYZ Board", 
         "XYZ Versity","Mechanical", "Engineering", "ME124"}
    };

    // Constructor to set up the JFrame and JTable
    public TeacherDetails() {
        setTitle("Teacher Details");
        
        setSize(1200, 570);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize table
        JTable teacherTable = new JTable(studentData, columnNames);
        JScrollPane tableScroll = new JScrollPane(teacherTable);
        tableScroll.setBounds(20, 20, 1150, 460);
        add(tableScroll);

       
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(520, 490, 100, 30);
        cancel.addActionListener(e -> cancelMethod());
        add(cancel);
        

        setLayout(null);
        setVisible(true);
    }

    
     private void cancelMethod() {
         this.setVisible(false);
        }
     
    // Main method to run the application
    public static void main(String[] args) {
        new TeacherDetails();
    }
}
