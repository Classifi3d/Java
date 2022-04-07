//Mustea Dumitru-Dan Lab11_6
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.regex.*; 
import java.util.regex.*; 
import javax.swing.*;

public class MusteaDan_Lab11_6 {
    public static void main(String[] args) {
        new MyFrame6();
    }
}

class MyFrame6 {
    //variables
    static float result=0;
    static float input=0;

    MyFrame6() {

    /* -------------------------------- /Frame/ -------------------------------- */
    //main elements
    JFrame f = new JFrame("Mustea Dan Lab11_6");

    f.setLocationRelativeTo(null);
    f.getContentPane().setBackground(Color.WHITE);
    f.setResizable(false);
    f.setSize(500,500);
    f.setLayout(new GridLayout(7,2));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Student studentInformation = new Student();

    JLabel lab1 = new JLabel("First Name");
    lab1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab2 = new JLabel("Sure Name");
    lab2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab3 = new JLabel("Year of Study");  
    lab3.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab4 = new JLabel("Faculty");  
    lab4.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab5 = new JLabel("Budget");  
    lab5.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JLabel lab6 = new JLabel("Course");
    lab6.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextField text1 = new JTextField();
    text1.setPreferredSize(new Dimension(30,20));
    text1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextField text2 = new JTextField();
    text2.setPreferredSize(new Dimension(30,20));
    text2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] myYearList = { "1", "2", "3", "4", "5", "6"};
    Arrays.sort(myYearList);
    JComboBox<String> combo1 = new JComboBox<String>(myYearList);
    combo1.setSelectedIndex(-1);
    combo1.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] myFacultyList = { "AC", "ETTI", "FAU", "ARMM", "Constructions", "IMM", "Instalations", "IE", "CM"};
    Arrays.sort(myFacultyList);
    JComboBox<String> combo2 = new JComboBox<String>(myFacultyList);
    combo2.setSelectedIndex(-1);
    combo2.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    String[] course = { "CAD", "SDIC", "SE", "ETM", "Microwaves", "ASC", "AIC"};
    Arrays.sort(course);
    JComboBox<String> combo3 = new JComboBox<String>(course);
    combo3.setSelectedIndex(-1);
    combo3.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JCheckBox check = new JCheckBox("Check if you're at budget");
    check.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JButton b = new JButton("Print");
    b.setBorder(BorderFactory.createLineBorder(Color.GRAY));

    JTextArea output = new JTextArea();
    output.setBounds(2,20, 10,10);  
    output.setBorder(BorderFactory.createLineBorder(Color.GRAY));


    b.setPreferredSize(new Dimension(480,20));
    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){
            output.setForeground(Color.BLACK);
            Boolean valid=true;
            Boolean nameValid=true;
            String nameValidationString="^[A-Za-z]+([\\ A-Za-z]+)*";
            if(Pattern.matches(nameValidationString,text1.getText())){
                studentInformation.setName(text1.getText());
            }else{
                valid = false;
                nameValid=false;
            }

            if(Pattern.matches(nameValidationString,text2.getText())){
                studentInformation.setSurename(text2.getText());
            }else{
                valid=false;
                nameValid=false;
            }

            if(combo1.getSelectedIndex()>-1&&combo1.getSelectedIndex()<myYearList.length){
                try{
                    studentInformation.setYearOfStudy(Integer.parseInt(combo1.getSelectedItem().toString()));
                }catch(Exception E){
                    valid=false;
                }
            }else{
                valid=false;
            }

            if(combo2.getSelectedIndex()>-1&&combo2.getSelectedIndex()<myFacultyList.length){
                studentInformation.setFaculty(combo2.getSelectedItem().toString());

            }else{
                valid=false;
            }

            if(check.isSelected()){
                studentInformation.setFinancing(true);
            }else{
                studentInformation.setFinancing(false);
            }

            if(combo3.getSelectedIndex()>-1&&combo3.getSelectedIndex()<course.length){
                studentInformation.setCourse(combo3.getSelectedItem().toString());
            }else{
                valid=false;
            }
            
            if(valid==true){
                output.setText(studentInformation.getName()+" "+
                                studentInformation.getSurename()+" "+
                                studentInformation.getYearOfStudy()+" "+
                                studentInformation.getFaculty()+" "+
                                studentInformation.getFinancing()+" "+
                                studentInformation.getCourse()+" ");  
            }else{
                if(nameValid==false){
                    output.setForeground(Color.RED);
                    output.setText("Invalid Name Entered!");
                }else {
                    output.setForeground(Color.RED);
                    output.setText("Insufficient Or Invalid Data Entered!");
                }
            }
        }  
    });

    f.add(lab1);
    f.add(lab2);
    f.add(text1);
    f.add(text2);
    f.add(lab3);
    f.add(lab4);
    f.add(combo1);
    f.add(combo2);
    f.add(lab5);
    f.add(lab6);
    f.add(check);
    f.add(combo3);
    f.add(b);
    f.add(output);

    
    f.setVisible(true);
}
}

class Student{
    String name;//textfield
    String surename;//textfield
    int yearOfStudy;//dropdown
    String faculty;//dropdown
    Boolean financing;//checkbox
    String course;//dropdown

    public Student() {
    }

    public Student(String name, String surename, int yearOfStudy, String faculty, Boolean financing, String course) {
        this.name = name;
        this.surename = surename;
        this.yearOfStudy = yearOfStudy;
        this.faculty = faculty;
        this.financing = financing;
        this.course = course;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return this.surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getYearOfStudy() {
        return this.yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Boolean isFinancing() {
        return this.financing;
    }

    public String getFinancing() {
        if(financing==true){
            return "Budget";
        }else{
            return "Tax";
        }
    }

    public void setFinancing(Boolean financing) {
        this.financing = financing;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student surename(String surename) {
        setSurename(surename);
        return this;
    }

    public Student yearOfStudy(int yearOfStudy) {
        setYearOfStudy(yearOfStudy);
        return this;
    }

    public Student faculty(String faculty) {
        setFaculty(faculty);
        return this;
    }

    public Student financing(Boolean financing) {
        setFinancing(financing);
        return this;
    }

    public Student course(String course) {
        setCourse(course);
        return this;
    }
}
