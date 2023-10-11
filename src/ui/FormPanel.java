/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Patient;

/**
 *
 * @author kiran
 */
public class FormPanel extends javax.swing.JPanel {

    private Image image;

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    public FormPanel(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel=bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        emaillabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        lastnameLabel = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        uploadButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        patientTypeLabel = new javax.swing.JLabel();
        patientTypeDropBox = new javax.swing.JComboBox<>();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        preferNotToSayButton = new javax.swing.JRadioButton();
        dateOfBirthLabel = new javax.swing.JLabel();
        dateOfBirthValue = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 153, 51));
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 500));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        titleLabel.setText(" PATIENT REGISTRATION FORM");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        namelabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        namelabel.setText("First Name :");

        agelabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        agelabel.setText("Age :");

        emaillabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        emaillabel.setText("Email :");

        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        ageTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        lastnameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lastnameLabel.setText("Last Name :");

        lastnameTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        messageLabel.setText("Message :");

        messageTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        submitbutton.setBackground(new java.awt.Color(0, 0, 0));
        submitbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitbutton.setForeground(new java.awt.Color(255, 255, 255));
        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        uploadButton.setBackground(new java.awt.Color(0, 0, 0));
        uploadButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadButton.setForeground(new java.awt.Color(255, 255, 255));
        uploadButton.setText("UPLOAD IMAGE");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        imageLabel.setBackground(new java.awt.Color(51, 51, 51));

        patientTypeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patientTypeLabel.setText("Patient type :");

        patientTypeDropBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patientTypeDropBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "General Patients", "Pediatric Patients", "Emergency Patients", "Orthopedic Patients" }));
        patientTypeDropBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypeDropBoxActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        genderLabel.setText("Gender :");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("MALE");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("FEMALE");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(preferNotToSayButton);
        preferNotToSayButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        preferNotToSayButton.setText("Prefer Not to Say");
        preferNotToSayButton.setActionCommand("PREFER NOT TO SAY");
        preferNotToSayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferNotToSayButtonActionPerformed(evt);
            }
        });

        dateOfBirthLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dateOfBirthLabel.setText("Date of Birth :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emaillabel)
                            .addComponent(patientTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(messageLabel)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(titleLabel))
                                    .addComponent(patientTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lastnameLabel)
                                        .addGap(14, 14, 14)))
                                .addGap(0, 4, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(uploadButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateOfBirthLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(messageTextField)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(femaleRadioButton)
                                .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(preferNotToSayButton))))
                    .addComponent(dateOfBirthValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agelabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadioButton)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(preferNotToSayButton)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateOfBirthLabel)
                            .addComponent(dateOfBirthValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientTypeDropBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
      
                
        String name = nameTextField.getText();
        String lastName = lastnameTextField.getText();
        String age = ageTextField.getText(); 
        String email = emailTextField.getText();
        String message = messageTextField.getText();
        String type = patientTypeDropBox.getSelectedItem().toString();
        Date dateOfBirth = null;
        String gender = "";
        if(genderButtonGroup.getSelection()!=null){
            gender=genderButtonGroup.getSelection().getActionCommand();
        }
        
        if(dateOfBirthValue.getDate() != null){
            dateOfBirth = dateOfBirthValue.getDate(); 
        }
    

        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher isValidEmail = pattern.matcher(email);

        if(name.length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter a Valid First Name", "Validation Error", HEIGHT);
        }else if (lastName.length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter a valid Last Name", "Validation Error", HEIGHT);
        } else if(age.length() == 0 || !age.chars().allMatch(Character::isDigit) ) {
            JOptionPane.showMessageDialog(this, "Enter Correct Age", "Validation Error", HEIGHT);
        } else if(email.length() == 0 || !isValidEmail.matches()) {
            JOptionPane.showMessageDialog(this, "Enter Correct Email Address", "Validation Error", HEIGHT);
        } else if (message.length() == 0) {
            JOptionPane.showMessageDialog(this, "Please enter Something in Message Box", "Validation Error", HEIGHT);
        }else if (image== null) {
            JOptionPane.showMessageDialog(this, "Please upload an image.", "Validation Error", HEIGHT);
        }else if (gender== "") {
            JOptionPane.showMessageDialog(this, "Please Mark your Gender.", "Validation Error", HEIGHT);
        }else if (dateOfBirth==null) {
            JOptionPane.showMessageDialog(this, "Please Enter Your Date of Birth.", "Validation Error", HEIGHT);
        }
        else {
        //JOptionPane.showMessageDialog(this, name + " " + lastName + " " + age + " " + email + " " + message, "Registeration Form", HEIGHT);
          /*  JDialog a = new JDialog(this);
            JPanel successPanel = new JPanel();
            JLabel lName = new JLabel("Name :"+name + " "+lastName);
            JLabel lAge = new JLabel("Age :"+age);
            JLabel lEmail = new JLabel("Email :"+email);
            JLabel lMessage = new JLabel("Message :"+message);
            JLabel lImage = new JLabel("Image" );
            lImage.setIcon(new ImageIcon(image));

            successPanel.setLayout(new BoxLayout(successPanel, BoxLayout.Y_AXIS));
            successPanel.add(lName);
            successPanel.add(lAge);
            successPanel.add(lEmail);
            successPanel.add(lMessage);
            successPanel.add(lImage);

            a.getContentPane().add(successPanel);
            a.pack();
            a.setVisible(true);*/
        Patient newUser = new Patient();
        newUser.setName(name);
        newUser.setLastName(lastName);
        newUser.setAge(age);
        newUser.setEmail(email);
        newUser.setMessage(message);
        newUser.setType(type);
        newUser.setIcon(new ImageIcon(image));
        newUser.setGender(gender);
        newUser.setdateOfBirth(dateOfBirth);
        ViewPanel newViewPanel = new ViewPanel(newUser);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
        

        }    // TODO add your handling code here:

    }//GEN-LAST:event_submitbuttonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES","png","jpg","jpeg" );
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();

            ImageIcon a = new ImageIcon(selectedImagePath);
            image = a.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(image));

        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void patientTypeDropBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypeDropBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientTypeDropBoxActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void preferNotToSayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferNotToSayButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preferNotToSayButtonActionPerformed

    private void lastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel dateOfBirthLabel;
    private com.toedter.calendar.JDateChooser dateOfBirthValue;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel namelabel;
    private javax.swing.JComboBox<String> patientTypeDropBox;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JRadioButton preferNotToSayButton;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
