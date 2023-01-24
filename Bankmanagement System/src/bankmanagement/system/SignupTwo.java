
package bankmanagement.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.util.*;  //random numbers util package m hote hai//
//import com.toedter.calendar.JDateChooser; //datechooser package (jar)//
//import com.toedter.calendar.JDateChooser;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//import javax.swing.ButtonGroup;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;

public class SignupTwo  extends JFrame implements ActionListener{
    
//        long random;
        JTextField pan,aadhar;
        JButton next;
        JRadioButton syes,sno,eyes,eno;
//        JDateChooser dateChooser;
        JComboBox religion,category,occupation,education,income;
        String formno;
        
        SignupTwo( String formno){
            this.formno = formno;
            setLayout(null); //setLayout tbhi work karta h jb vo null ho//
            
            setTitle("New Account Application Form - Page 2");
            
//            Random ran = new Random();
//            random =Math.abs((ran.nextLong() % 9000L) + 1000L);  //random numner m negative value ko math.absoulate positive krta hai//
            
//            JLabel formno = new JLabel("APPLICATION FORM NO." + random);
//            formno.setFont(new Font("Raleway",Font.BOLD,38));
//            formno.setBounds(140,20,600,40);
//            add(formno);
            
             
            JLabel additionalDetails = new JLabel("Pagr 2: Additional Details");
            additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
            additionalDetails.setBounds(290,80,400,30);
            add(additionalDetails);
            
            JLabel Name = new JLabel("Religions:");
            Name.setFont(new Font("Raleway",Font.BOLD,20));
            Name.setBounds(100,140,100,30);
            add(Name);
            
            String valReligion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
             religion = new JComboBox(valReligion);
             religion.setBounds(300,140,400,30);
             religion.setBackground(Color.WHITE);
            add(religion);
            
            
//            nameTextField=new JTextField();
//            nameTextField.setFont(new Font("Raieway",Font.BOLD,13));
//            nameTextField.setBounds(300,140,400,30);
//            add(nameTextField);
            
            
            JLabel fname = new JLabel("Category:");
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100,190,200,30);
            add(fname);
            
            String valcategory[]={"General","OBC","SC","ST","Other"};
            category = new JComboBox(valcategory);
            category.setBounds(300,190,400,30);
            category.setBackground(Color.WHITE);
            add(category);
            
//            fnameTextField=new JTextField();
//            fnameTextField.setFont(new Font("Raieway",Font.BOLD,13));
            
            JLabel dob = new JLabel("Income:");
            dob.setFont(new Font("Raieway",Font.BOLD,20));
            dob.setBounds(100,240,200,30);
            add(dob);
            
            String incomecategory[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
            income = new JComboBox(incomecategory);
            income.setBounds(300,240,400,30);
            income.setBackground(Color.WHITE);
            add(income);
            
            
//            dateChooser= new JDateChooser();
//            dateChooser.setBounds(300,240,400,30);
//            dateChooser.setForeground(Color.BLACK);
//            add(dateChooser);
            
            
            JLabel gender = new JLabel("Educational:");
            gender.setFont(new Font("Raieway",Font.BOLD,20));
            gender.setBounds(100,290,200,30);
            add(gender);
//            male = new JRadioButton("Male");
//            male.setBounds(300,290,60,30);
//            male.setBackground(Color.WHITE);
//            add(male);
//            female = new JRadioButton("Female");
//            female.setBounds(450,290,120,30);
//            female.setBackground(Color.WHITE);
//            add(female);  
//            ButtonGroup gendergroup = new ButtonGroup();
//            gendergroup.add(male);
//            gendergroup.add(female);
            
            JLabel email = new JLabel("Qualification:");
            email.setFont(new Font("Raieway",Font.BOLD,20));
            email.setBounds(100,315,200,30);
            add(email);
            
            String educationalValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Other"};
            education = new JComboBox(educationalValues);
            education.setBounds(300,315,400,30);
            education.setBackground(Color.WHITE);
            add(education);
   
//            emailTextField=new JTextField();
//            emailTextField.setFont(new Font("Raieway",Font.BOLD,13));
//            emailTextField.setBounds(300,340,400,30);
//            add(emailTextField);
//            
            
            JLabel marital = new JLabel("Occupation:");
            marital.setFont(new Font("Raieway",Font.BOLD,20));
            marital.setBounds(100,390,200,30);
            add(marital);
            
            String occupationValues[] = {"Salaried-Employed","Self-Employed","Bussiness","Student","Retired","Others"};
            occupation = new JComboBox(occupationValues);
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.WHITE);
            add(occupation);
 
//            married = new JRadioButton("Married");
//            married.setBounds(300,390,100,30);
//            married.setBackground(Color.WHITE);
//            add(married);
//            
//             unmarried = new JRadioButton("Unmarried");
//            unmarried.setBounds(450,390,110,30);
//            unmarried.setBackground(Color.WHITE);
//            add(unmarried);
//                   
//            other = new JRadioButton("Other");
//            other.setBounds(630,390,100,30);
//            other.setBackground(Color.WHITE);
//            add(other);
//            
//            ButtonGroup maritalgroup = new ButtonGroup();
//            maritalgroup.add(married);
//            maritalgroup.add(unmarried);
//            maritalgroup.add(other);
                
            JLabel address = new JLabel("Pan Number:");
            address.setFont(new Font("Raieway",Font.BOLD,20));
            address.setBounds(100,440,200,30);
            add(address);
            
            pan=new JTextField();
            pan.setFont(new Font("Raieway",Font.BOLD,13));
            pan.setBounds(300,440,400,30);
            add(pan);
            
            
            JLabel city = new JLabel("Aadhar Number:");
            city.setFont(new Font("Raieway",Font.BOLD,20));
            city.setBounds(100,490,200,30);
            add(city);
            
            aadhar = new JTextField();
            aadhar.setFont(new Font("Raieway",Font.BOLD,13));
            aadhar.setBounds(300,490,400,30);
            add(aadhar);
            
            
            
            JLabel state = new JLabel("Senior Citizen:");
            state.setFont(new Font("Raieway",Font.BOLD,20));
            state.setBounds(100,540,200,30);
            add(state);
            
            syes = new JRadioButton("Yes");
            syes.setBounds(300,540,100,30);
            syes.setBackground(Color.WHITE);
            add(syes);        
            
            sno = new JRadioButton("No");
            sno.setBounds(450,540,110,30);
            sno.setBackground(Color.WHITE);
            add(sno);
            
            ButtonGroup maritalgroup = new ButtonGroup();
            maritalgroup.add(syes);
            maritalgroup.add(sno);
       
            
//            stateTextField=new JTextField();
//            stateTextField.setFont(new Font("Raieway",Font.BOLD,13));
//            stateTextField.setBounds(300,540,400,30);
//            add(stateTextField);
//            
            
             JLabel pincode = new JLabel("Exisiting Account:");
             pincode.setFont(new Font("Raieway",Font.BOLD,20));
             pincode.setBounds(100,590,200,30);
             add(pincode);
             
            eyes = new JRadioButton("Yes");
            eyes.setBounds(300,590,100,30);
            eyes.setBackground(Color.WHITE);
            add(eyes);        
            
            eno = new JRadioButton("No");
            eno.setBounds(450,590,110,30);
            eno.setBackground(Color.WHITE);
            add(eno);
            
            ButtonGroup existing = new ButtonGroup();
            existing.add(eyes);
            existing.add(eno);
            
            
            
            
            next = new JButton("Next");
            next.setBackground(Color.BLACK);
            next.setForeground(Color.WHITE);
            next.setFont(new Font("Raleway",Font.BOLD,14));
            next.setBounds(620,660,80,30);
            next.addActionListener(this);
            add(next);
            
            
    
            
            getContentPane().setBackground(Color.white);  // frame ko color krne k liye awt package use krte hi
             setSize(850,800); // makeframe
            setLocation(350,10);
            setVisible(true);
           
        }
        
        @Override
        public void actionPerformed(ActionEvent ae){
//            String formno ="" + random; //long
            String sreligion = (String)religion.getSelectedItem();
            String scategory = (String)category.getSelectedItem(); 
            String sincome = (String)income.getSelectedItem();
            String seducation=(String)education.getSelectedItem();
            String soccupation=(String)occupation.getSelectedItem();
            
            String seniorcitizen = null;
            
              if(syes.isSelected()){
                  seniorcitizen = "Yes";
              }
              else if(sno.isSelected()){
                  seniorcitizen = "No";
              }
        
//              String email = emailTextField.getText();
              String existingaccount =  null;
              if(eyes.isSelected()){
                  existingaccount = "Yes";
                  
              }else if(eno.isSelected()){
                  existingaccount = "No";
              }
              
              String span = pan.getText();
              String saadhar = aadhar.getText();
//              String state = stateTextField.getText();
//              String pincode = pincodeTextField.getText();
              
              try{
               
                     Conn c = new Conn();
                     String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                     c.s.executeUpdate(query); //dml cmd exceute
                     
                     //signup3 object
                     setVisible(false);
                     new SignupThree(formno).setVisible(true);
              }
              catch(Exception e){
                  System.out.println(e);
              }
               
        }
        public static void main(String[]args){
                
            new SignupTwo("");
}          

}







