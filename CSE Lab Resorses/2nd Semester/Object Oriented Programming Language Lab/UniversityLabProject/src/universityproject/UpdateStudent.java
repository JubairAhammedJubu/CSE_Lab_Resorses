/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;




    


public class UpdateStudent extends JFrame{

    // Column names for the table
    String[] columns = {"Name", "Father's Name", "Mother's Name", "DOB", "Mobile", "Email", "Address", "School", "GPA", "Passing Year", "Board", "College","GPA", "Passing Year", "Board" ,"University", "Programme", "Department", "ID"};
    
    // Sample data for the table
    String[][] data = {
        {"John Doe", "Michael Doe", "Jane Doe", "1980-05-14", "1234567890", "john@example.com", "123 Street, City", "XYZ School", "4.80", "2003", "ABC Board", "ABC College","4.80", "2005", "ABC Board", "XYZ University", "Computer Science", "Engineering", "111"},
        {"Jane Smith", "David Smith", "Alice Smith", "1979-06-20", "0987654321", "jane@example.com", "456 Avenue, Town", "ABC School", "4.75", "2001", "XYZ Board", "XYZ College","4.75", "2003", "XYZ Board", "ABC University", "Mechanical Engineering", "Engineering", "112"}
    };
    
    // Table and Text fields
    JTable teacherTable;
    JTextField[] textFields = new JTextField[16];
    
    // Constructor to set up the JFrame and JTable
    public UpdateStudent() {
        setTitle("Student Details");
        setSize(1200, 670);
        setLocation(50, 5);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize table
        teacherTable = new JTable(data, columns);
        JScrollPane tableScroll = new JScrollPane(teacherTable);
        tableScroll.setBounds(20, 20, 1150, 200);
        add(tableScroll);

        // Create text fields for updates
        createUpdateFields();

        // Create and add Update button
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(620, 380, 100, 30);
        updateButton.addActionListener(e -> updateTeacherDetails());
        add(updateButton);
        
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(620, 420, 100, 30);
        cancel.addActionListener(e -> cancelMethod());
        add(cancel);

        setLayout(null);
        setVisible(true);
    }

    // Create text fields for user input
    private void createUpdateFields() {
        String[] labels = {
            "Name", "Father's Name", "Mother's Name", "DOB", "Mobile", "Email", "Address",
            "School", "GPA", "Passing Year", "Board", "College", "University", "Programme", "Department", "CGPA"
        };
        
        int yPosition = 230;
        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i] + ":");
            label.setBounds(20, yPosition, 120, 20);
            add(label);
            
            textFields[i] = new JTextField();
            textFields[i].setBounds(140, yPosition, 200, 20);
            add(textFields[i]);
            
            yPosition += 25;
        }
    }

    // Update teacher details in the selected row
    private void updateTeacherDetails() {
        int selectedRow = teacherTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        // Update the row with values from text fields
        for (int i = 0; i < textFields.length; i++) {
            teacherTable.setValueAt(textFields[i].getText(), selectedRow, i);
        }

        // Show success message
        JOptionPane.showMessageDialog(this, "Details updated successfully!");
        

    }
    
    private void cancelMethod() {
         this.setVisible(false);
        }

    // Main method to run the application
    public static void main(String[] args) {
        new UpdateStudent();
    }
}
