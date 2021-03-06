/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AreaAdminWorkArea;

import Business.Area.Area;
import Business.PatternMatcher.PatternMatcher;
import Business.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class ViewPersonDetails extends javax.swing.JPanel {
private JPanel userPocessContainer;
private Area area;
private Person person;
    /**
     * Creates new form ViewPersonDetails
     */
    public ViewPersonDetails(JPanel userProcessContainer, Area area) {
        initComponents();
        this.userPocessContainer = userProcessContainer;
        this.area = area;
        populatePersonTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchKeyWord = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnviewdetail = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtable = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        txtState = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPerson = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        txtSearchKeyWord.setToolTipText("");
        txtSearchKeyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchKeyWordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jLabel2.setText("Search by Person ID");

        btnsearch.setText("search");
        btnsearch.setToolTipText("");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnviewdetail.setText("View Detail");
        btnviewdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdetailActionPerformed(evt);
            }
        });

        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("View Details");

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonName", "PersonID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.setViewportView(tblDetails);

        txtState.setEditable(false);

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setText("State");
        jLabel4.setToolTipText("");

        txtCountry.setEditable(false);

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel5.setText("Country");
        jLabel5.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        txtPerson.setEditable(false);

        txtName.setEditable(false);

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel6.setText("Person ID");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel7.setText("Street");

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel8.setText("Age");

        txtCity.setEditable(false);
        txtCity.setEnabled(false);

        txtStreet.setEditable(false);

        txtAge.setEditable(false);

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel9.setText("City");

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel10.setText("Emergency Info");

        txtContact.setEditable(false);

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel11.setText("Person Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtable, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnrefresh)
                                    .addComponent(btndelete)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnviewdetail)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsearch))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(59, 59, 59)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnviewdetail)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchKeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnrefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtable, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(jButton1)
                    .addComponent(btnSave))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populatePersonTable()
    {
    DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();

        model.setRowCount(0);
            for (Person person : area.getPersonDirectory().getPersonList()) {
                Object[] row = new Object[2];
                row[0] = person;
                row[1] = person.getPersonID();
                model.addRow(row);
            
        }
    }
    private void txtSearchKeyWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchKeyWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyWordActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
    String keyWord = txtSearchKeyWord.getText().trim();
    Person p;
        if(keyWord.equals(""))
        {
        JOptionPane.showMessageDialog(null,"Please enter some text to serach","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        else
          p =  searchPerson(keyWord);
          if(p == null)
          {
          JOptionPane.showMessageDialog(null,"No matching","Warning",JOptionPane.WARNING_MESSAGE);
        
          }

    }//GEN-LAST:event_btnsearchActionPerformed
     private Person searchPerson(String key)
    {
    DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
    for(Person p1 : area.getPersonDirectory().getPersonList())
    { 
    if(p1.getPersonID().equalsIgnoreCase(key))
    {
    //a = 1;
    dtm.setRowCount(0);
    Object[] row = new Object[2];
    row[0] = p1;
    row[1] = p1.getPersonID();

    dtm.addRow(row);
    return p1;
    }
   
    }
    return null;
     
     
     }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
       int selectedrow = tblDetails.getSelectedRow();
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select an entry from table", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete a person", "INFO", JOptionPane.YES_NO_CANCEL_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Person person = (Person) tblDetails.getValueAt(selectedrow, 0);
                area.getPersonDirectory().getPersonList().remove(person);
                populatePersonTable();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnviewdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdetailActionPerformed
        // TODO add your handling code here:

      int selectedRow = tblDetails.getSelectedRow();
        if (selectedRow >= 0) {
            Person p = (Person) tblDetails.getValueAt(selectedRow, 0);
            person = p;
            txtName.setText(p.getName());
            txtAge.setText(String.valueOf(p.getAge()));
            txtContact.setText(p.getEmergencyContact());
            txtStreet.setText(p.getStreet());
            txtCity.setText(p.getCity());
            txtState.setText(p.getState());
            txtCountry.setText(p.getCountry());
            txtPerson.setText(p.getPersonID());
        } else {
            JOptionPane.showMessageDialog(null, "Please select an entry  from the table", "warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnviewdetailActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        populatePersonTable();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userPocessContainer.remove(this);
        CardLayout layout = (CardLayout) userPocessContainer.getLayout();
        layout.previous(userPocessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       txtName.setEditable(true);
       txtAge.setEditable(true);
       txtContact.setEditable(true);
       txtStreet.setEditable(true);
       btnSave.setEnabled(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       String name = txtName.getText().trim();
        String phone = txtContact.getText().trim();
        String street = txtStreet.getText().trim();
        int age = Integer.parseInt(txtAge.getText().trim());
        if(name.equals("")|| phone.equals("")|| street.equals("")||txtAge.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill the fields","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(PatternMatcher.validateName(name)== false)
        {
            JOptionPane.showMessageDialog(null,"Please enter name in characters","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(PatternMatcher.validatePhoneNumber(phone)== false)
        {
            JOptionPane.showMessageDialog(null,"Please enter contact number in format 123-123-7890","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(age == 0 || age < 0)
        {
            JOptionPane.showMessageDialog(null,"Please enter correct age","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(PatternMatcher.validateStreet(street)== false)
        {
            JOptionPane.showMessageDialog(null,"Please enter the street name correctly","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        person.setFirstName(name);
        person.setAge(age);
        person.setEmergencyContact(phone);
        person.setStreet(street);
        JOptionPane.showMessageDialog(null,"Details have been updated successfully","Information",JOptionPane.INFORMATION_MESSAGE);
        txtName.setEditable(false);
       txtAge.setEditable(false);
       txtContact.setEditable(false);
       txtStreet.setEditable(false);
       btnSave.setEnabled(false);  
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnviewdetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jtable;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPerson;
    private javax.swing.JTextField txtSearchKeyWord;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
