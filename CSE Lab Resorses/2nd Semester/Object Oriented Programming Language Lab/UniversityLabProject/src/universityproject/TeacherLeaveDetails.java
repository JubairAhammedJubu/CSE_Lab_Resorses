/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityproject;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jubair
 */



public class TeacherLeaveDetails extends JFrame implements ActionListener {

    Choice crollno;
    JTable table;
    JButton search, add, cancel;

    // Sample student leave details (replace database calls with this sample data)
    List<StudentLeave> leaveList = new ArrayList<>();

    // Constructor to set up the UI
    TeacherLeaveDetails() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search by Roll Number");
        heading.setBounds(40, 20, 150, 20);
        add(heading);

        // Create a Choice dropdown for selecting roll numbers
        crollno = new Choice();
        crollno.setBounds(200, 20, 150, 20);
        add(crollno);

        // Populate the roll numbers for the dropdown
        loadSampleData();
        for (StudentLeave leave : leaveList) {
            crollno.add(leave.getRollNumber());
        }

        // Create the table
        table = new JTable();
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(40, 120, 900, 400);
        add(jsp);

        // Create and add buttons
        search = new JButton("Search");
        search.setBounds(40, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        add = new JButton("Add");
        add.setBounds(140, 70, 80, 20);
        add.addActionListener(this);
        add(add);

        cancel = new JButton("Cancel");
        cancel.setBounds(240, 70, 80, 20);
        cancel.addActionListener(this);
        add(cancel);
        
        setTitle("Teacher Leave Details");
        setSize(1000, 600);
        setLocation(150, 50);
        setVisible(true);
    }

    // Sample method to load student leave data
    private void loadSampleData() {
        leaveList.add(new StudentLeave("John Doe", "S123", "2024-12-01", "Medical"));
        leaveList.add(new StudentLeave("Jane Smith", "S124", "2024-12-02", "Personal"));
        leaveList.add(new StudentLeave("Sam Wilson", "S125", "2024-12-03", "Family"));
    }

    // Method to display the leave details in the table for the selected roll number
    private void displayLeaveDetails(String rollno) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Student Name", "Roll Number", "Leave Date", "Reason"}, 0);

        for (StudentLeave leave : leaveList) {
            if (leave.getRollNumber().equals(rollno)) {
                model.addRow(new Object[]{leave.getStudentName(), leave.getRollNumber(), leave.getLeaveDate(), leave.getReason()});
            }
        }

        table.setModel(model);
    }

    // Method to add a new student's leave details
    private void addNewLeaveDetails() {
        // Prompt the user for details using input dialogs
        String studentName = JOptionPane.showInputDialog(this, "Enter Student Name:");
        String rollNumber = JOptionPane.showInputDialog(this, "Enter Roll Number:");
        String leaveDate = JOptionPane.showInputDialog(this, "Enter Leave Date (yyyy-mm-dd):");
        String reason = JOptionPane.showInputDialog(this, "Enter Leave Reason:");

        // If all fields are filled, create a new student leave entry
        if (studentName != null && !studentName.isEmpty() && 
            rollNumber != null && !rollNumber.isEmpty() && 
            leaveDate != null && !leaveDate.isEmpty() && 
            reason != null && !reason.isEmpty()) {

            // Add the new entry to the list
            leaveList.add(new StudentLeave(studentName, rollNumber, leaveDate, reason));

            // Update the table with the new data
            crollno.add(rollNumber);  // Add the new roll number to the dropdown
            JOptionPane.showMessageDialog(this, "Leave details added successfully!");

        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            String selectedRollNo = crollno.getSelectedItem();
            displayLeaveDetails(selectedRollNo);
        } else if (ae.getSource() == add) {
            addNewLeaveDetails();
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new TeacherLeaveDetails();
    }
}

// Helper class to hold student leave details
class StudentLeave {
    private String studentName;
    private String rollNumber;
    private String leaveDate;
    private String reason;

    public StudentLeave(String studentName, String rollNumber, String leaveDate, String reason) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.leaveDate = leaveDate;
        this.reason = reason;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public String getReason() {
        return reason;
    }
}
