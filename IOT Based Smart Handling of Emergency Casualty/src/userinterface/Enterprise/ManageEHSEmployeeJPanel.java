/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Enterprise;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.PatternMatcher.PatternMatcher;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author test
 */
public class ManageEHSEmployeeJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private OrganizationDirectory organizationDirectory;
private Organization organization1;  
private Enterprise enterprise;
/**
     * Creates new form ManageEHSEmployeeJPanel
     */
    public ManageEHSEmployeeJPanel(JPanel userProcessContainer,Enterprise enterprise, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        Type type = Organization.Type.Ambulance;
        txtVal.setText(Organization.Type.Ambulance.getValue());
        populateTable();
       /* if(type == Organization.Type.Ambulance)
        {
         if(organization.getEmployeeDirectory().getEmployeeList().isEmpty()) 
         {
        organization = organizationDirectory.createOrganization(Organization.Type.Ambulance);
        }
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        addJButton.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel1.setText("Organization");
        jLabel1.setToolTipText("");

        backJButton.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jScrollPane1.setToolTipText("");

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel4.setText("Location");

        txtVal.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        txtVal.setText("<                                                      >");
        txtVal.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setText("Manage Employees");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(68, 68, 68)
                                .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void populateTable()
    {
     DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            {
               organization1 = organization;    
            for(Employee employee : organization.getEmployeeDirectory().getEmployeeList())
            {
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee.getName();
            row[2] = employee.getWorkplace();
            model.addRow(row);
        }
        }
    }
    }
    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

     //  Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText().trim();
        String location = txtLoc.getText().trim();
        if(PatternMatcher.validateName(name)== false)
        {
        JOptionPane.showMessageDialog(null,"The name should be in characters","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        if(PatternMatcher.validateLocation(location)== false)
        {
        JOptionPane.showMessageDialog(null,"The location should be in characters","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
      //  EmergencyHealthServicesEnterprise ehs = (EmergencyHealthServicesEnterprise) enterprise;
     for(Organization organizaton: enterprise.getOrganizationDirectory().getOrganizationList())
     {
        for(Employee e: organizaton.getEmployeeDirectory().getEmployeeList())
        {
           if(organizaton instanceof AmbulanceOrganization)
           {
        if(e.getWorkplace().equalsIgnoreCase(location) )
        {
        JOptionPane.showMessageDialog(null,"The location has been already assigned to:"+e.getId(),"Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        }
        }
     }
        organization1.getEmployeeDirectory().createEmployee(name,location);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

      userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JLabel txtVal;
    // End of variables declaration//GEN-END:variables
}
