/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
   
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    SignupTwo(){
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        
        
         JLabel addationalDetails = new JLabel("Page 2: Addational Details");
        addationalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        addationalDetails.setBounds(290, 80, 400, 30);
        add(addationalDetails);
        
         JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        JComboBox religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
                 
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        JComboBox category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
         
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        JComboBox income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
         
        
         JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
       
         
          JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        JComboBox education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
          String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        JComboBox occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
          married = new JRadioButton("Married");  
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
         unmarried = new JRadioButton("Unmarried"); 
         unmarried.setBounds(450, 390, 100, 30);
                 unmarried.setBackground(Color.WHITE);
             add(unmarried);
             
              other = new JRadioButton("Other"); 
         other.setBounds(630, 390, 100, 30);
                 other.setBackground(Color.WHITE);
             add(other);
             
             ButtonGroup maritalgroup = new ButtonGroup();
             maritalgroup.add(married);
             maritalgroup.add(unmarried);    
              maritalgroup.add(other);  
        
         
        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
            
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
         JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
            
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
          JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
            
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
          JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
            
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
                next.setForeground(Color.WHITE);
                next.setFont(new Font("Raleway", Font.BOLD, 14));
                next.setBounds(620, 660, 80, 30);
                next.addActionListener(this);
                add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" ;// long
        String name = nameTextField.getText(); // setText
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender ="Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
        } else{
            Conn c = new Conn();
           
            String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+", '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
            c.s.executeUpdate(query);
        }
    }
        catch(Exception e){
                System.out.println(e);
                }
    }
    

    public static void main(String args[]){
        new SignupTwo();
    }
}


